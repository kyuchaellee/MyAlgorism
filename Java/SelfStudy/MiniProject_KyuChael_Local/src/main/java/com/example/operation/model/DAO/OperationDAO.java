package main.java.com.example.operation.model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import main.java.com.example.doctor.model.DTO.MedicalRecordsDTO;
import main.java.com.example.operation.model.DTO.OperationDTO;

public class OperationDAO {
	 private Connection getConnection() throws SQLException {
	        String url = "jdbc:oracle:thin:@localhost:1521:XE";
	        String username = "GGUPRO";
	        String password = "RBCJFDL789";

	        return DriverManager.getConnection(url, username, password);
	    }
	 
	 public int getColumnOP() {
	        try (Statement statement = getConnection().createStatement()) {
	            ResultSet rs = statement.executeQuery("select count(1) from OPERATION");
	            rs.next();
	            return rs.getInt(1);
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    }
	 
	public int insertOp(String day, String uniqueness, String op_name, String doctorName, String patientName) {
		String sql = "INSERT INTO OPERATION VALUES(?,TO_TIMESTAMP(?),?,?,(SELECT DOCTOR_ID FROM DOCTOR WHERE DOCTOR_NAME = ?),(SELECT PATIENT_ID FROM PATIENT WHERE PATIENT_NAME = ?))";
		try (PreparedStatement pstmt = getConnection().prepareStatement(sql)) {
            pstmt.setInt(1, (getColumnOP()+1));
			pstmt.setString(2, day);
            pstmt.setString(3, uniqueness);
            pstmt.setString(4, op_name);
            pstmt.setString(5, doctorName);
            pstmt.setString(6, patientName);
            
            getConnection().commit();
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
	}

	public List<OperationDTO> searchOp(String patientName) {
		String sql = "SELECT OP_NO,OP_DATE,UNIQUENESS,OP_NAME,DOCTOR_ID,A.PATIENT_ID FROM OPERATION A LEFT JOIN PATIENT B ON A.PATIENT_ID = B.PATIENT_ID WHERE B.PATIENT_NAME = ?"; 
		
		try (PreparedStatement pstmt = getConnection().prepareStatement(sql)) {
            pstmt.setString(1, patientName);
            ResultSet rset = pstmt.executeQuery();
            List<OperationDTO> orr = new ArrayList<>();    
            
			while (rset.next()) {
				orr.add(new OperationDTO(rset.getInt(1), rset.getTimestamp(2), rset.getString(3), rset.getString(4), rset.getInt(5),rset.getInt(6)));
			}
            rset.close();
            return orr;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
	}

	public int updateOp(String patientName, String date,String newDate) {
		String sql = "UPDATE OPERATION SET OP_DATE = TO_TIMESTAMP(?) WHERE OP_DATE = ? AND PATIENT_ID = (SELECT PATIENT_ID FROM PATIENT WHERE PATIENT_NAME = ?)";
		try (PreparedStatement pstmt = getConnection().prepareStatement(sql)) {
			pstmt.setString(1,newDate);
            pstmt.setString(2, date);
			pstmt.setString(3, patientName);
            
            getConnection().commit();
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
	}

	public int deleteOp(String patientName, String date) {
		String sql = "DELETE FROM OPERATION WHERE PATIENT_ID = (SELECT PATIENT_ID FROM PATIENT WHERE PATIENT_NAME = ?) AND OP_DATE = TO_TIMESTAMP(?)";
		try (PreparedStatement pstmt = getConnection().prepareStatement(sql)) {
			pstmt.setString(1,patientName);
            pstmt.setString(2, date);
            
            getConnection().commit();
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
	}
}
