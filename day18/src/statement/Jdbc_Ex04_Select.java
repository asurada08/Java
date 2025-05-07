package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Ex04_Select {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;// 연결객체 초기화
		Statement stmt = null;
		ResultSet  rs = null;
		StringBuffer sql = null;
		sql = new StringBuffer();
		sql.append("select * from department");
		//sql.append("order by deptno desc");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql.toString());

			System.out.println("부서번호 부서이름 상위부서번호 위치");
			System.out.println("---------------------------------");
			while (rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				int college = rs.getInt(3);
				String loc = rs.getString(4);
				System.out.printf("%d %s %d %s %n", deptno, dname, college, loc);
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage()+"클래스가 없어요");
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"delete문 틀립니다");
		} finally {
			try {
				if(conn != null) conn.close();
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e) {
				System.out.println(e.getMessage()+"반환실패");
			}
		}

	}
}