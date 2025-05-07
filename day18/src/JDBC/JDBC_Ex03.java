package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Ex03 {

	public static void main(String[] args) throws SQLException {
		//연결 객체 정의
		Connection conn=null;
		//문장 객체 정의
		Statement stmt=null;
		//ResultSet 객체 정의
		ResultSet  rs=null;
		String sql="",sql2="";
		try {
			//드라이드 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			//connection객체 얻기
			conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			//문장객체
			stmt=conn.createStatement();
			//삽입
			sql2="insert into stock values('10005',150)";
			int result=stmt.executeUpdate(sql2);
			System.out.println("삽입 : "+result);

			sql="select * from stock";
			//검색(ResultSet) 객체 만들기
			rs=stmt.executeQuery(sql);
			//제목출력
			System.out.println("상품코드   재고수량");
			System.out.println("---------------");
			while(rs.next()) {
				String code=rs.getString("code");
				int quantity=rs.getInt(2);
				System.out.printf("%s     %d  %n",code, quantity);
			}
		}catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾을 수 없습니다");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				// conn, stmt, rs 자원반납
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}
}