package edu.java.contact.ojdbc;

public interface OracleConnect {
	// oracle db 접속 url
	String URL = "jdbc:oracle:thin:@Localhost:1521:xe";
	
	// oracle db 접속 계정
	String USER = "scott";
	
	// oracle db 접속 계정의 비밀번호
	String PASSWORD = "tiger";
}
