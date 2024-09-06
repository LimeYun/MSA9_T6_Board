package application.DTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class JDBC {
	
	public Connection con;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;
	
	public JDBC() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/t6_board?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
			String id = "T6_Board";
			String pw = "123456";
			con = DriverManager.getConnection(url, id, pw);
			
			System.out.println("Connection Succeded");
			
			
		} catch (Exception e) {
			System.err.println("Connection Failed");
		}
	}

}
