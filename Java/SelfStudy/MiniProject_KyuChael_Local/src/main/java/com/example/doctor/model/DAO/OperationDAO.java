package main.java.com.example.doctor.model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OperationDAO {
	 private Connection getConnection() throws SQLException {
	        String url = "jdbc:oracle:thin:@localhost:1521:XE";
	        String username = "ehek01";
	        String password = "ehek12";

	        return DriverManager.getConnection(url, username, password);
	    }
}
