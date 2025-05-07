package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Ex04_insert {

	public static void main(String[] args) {
		Connection conn = null;// 연결객체 초기화
		Statement stmt = null;
		StringBuffer sql = null;
		try {
			// 드라이브 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 연결객체 얻기(url, id, pw)
			conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			stmt = conn.createStatement();
			//삽입
			sql = new StringBuffer();
			sql.append("insert into department ");
			sql.append("values(103,'디자인학과',300,'2호관')");
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result+"개의 행이 추가 되었습니다");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스 찾을 수 없음");
		} catch (SQLException e) {
			System.out.println(e.getStackTrace());
		} finally {
			try {
				if(conn != null) conn.close();
				if(stmt != null) stmt.close();
			} catch (Exception e) {
				e.getStackTrace();
			}
		}

	}
}