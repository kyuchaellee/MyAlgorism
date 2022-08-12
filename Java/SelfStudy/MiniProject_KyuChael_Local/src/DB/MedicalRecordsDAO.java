package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MedicalRecordsDAO {
	static public Connection conn;
    static Statement stmt = null;
    static ResultSet rs = null;
    static  PreparedStatement pstmt = null;
    static String sql;
    
	public MedicalRecordsDTO insert(MedicalRecordsDTO mrdto) {
		 try{
		        Class.forName("oracle.jdbc.driver.OracleDriver");
		        conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HOSPITAL", "HOSPITAL");
		        System.out.println("연결");
		        
		        sql = "insert into medical_records values(?,?,?,?)";
		        pstmt = conn.prepareStatement(sql);
		        
		       
		        }
		        catch(Exception e) {
		        e.printStackTrace();
		        System.out.println("DB 로드 실패");
		        }
		 
		
		
		
		return mrdto;
	}
}
