package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Ex04_create {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;// 연결객체 초기화
		Statement stmt = null;
		String sql = "";
		try {
			// 드라이브 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 연결객체 얻기(url, id, pw)
			conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			stmt = conn.createStatement();
			sql="create table department ("
					+ "	deptno number(3) not null,"
					+ "	dname varchar(50) not null,"
					+ "	college number(3) not null,"
					+ "	loc varchar(10) not null,"
					+ "	primary key(deptno)"
					+ ")";
			stmt.execute(sql);
			System.out.println("테이블 생성 완료");
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
