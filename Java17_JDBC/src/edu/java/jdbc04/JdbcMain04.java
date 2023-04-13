package edu.java.jdbc04;

import static edu.java.jdbc.model.Blog.Entity.*;
import static edu.java.jdbc.oracle.OracleConnect.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class JdbcMain04 {

	public static void main(String[] args) {
		// 과제 JDBC delete:
		// delete from BLOGS where ID = ?
		Scanner scanner = new Scanner(System.in); // 삭제할 id를 받을 스캐너
		
		Connection conn = null; // try 안에서 선언하면 finally에서 close할 때 없어서 못함
		PreparedStatement stmt = null; // 위와 동일함
		
		try {
			DriverManager.registerDriver(new OracleDriver()); // SQL익셉션을 던지는 놈이라 트라이로 가둠
			// 오라클 드라이버 연동
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			// 로그인
			
			String sql = String.format("delete from %s where %s = ?", TBL_NAME, COL_ID);
			// sql에서 실행할 SQL문장
			System.out.println(sql);
			// 잘썻는지 확인할 문장
			
			stmt = conn.prepareStatement(sql); // sql문장을 실행시킬 수 있는 Statement객체 생성
			
			System.out.println("삭제할 컬럼 ID를 입력해주세요");
			Integer id = Integer.parseInt(scanner.nextLine());
			
			stmt.setInt(1, id); // 
			
			int result = stmt.executeUpdate();
			System.out.println(result + "개의 행이 삭제되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}










