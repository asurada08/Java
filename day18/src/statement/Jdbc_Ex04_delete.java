package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Ex04_delete {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		StringBuffer sql = new StringBuffer();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			stmt = conn.createStatement();
			
			
			sql.append("delete from department where deptno=103");
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result+"개의 행이 삭제 되었습니다");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage()+"클래스가 없어요");
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"delete문 틀립니다");
		} finally {
			try {
				if(conn != null) conn.close();
				if(stmt != null) stmt.close();
			} catch (Exception e) {
				System.out.println(e.getMessage()+"반환실패");
			}
		}

	}
}