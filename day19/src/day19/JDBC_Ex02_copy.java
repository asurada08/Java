package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Ex02_copy {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "", sql2 = "";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			stmt = conn.createStatement();
			//삽입
			//sql2 = "insert into goodsinfo values('10006','전산세무1급',30000,'도서출판')";
			//int result = stmt.executeUpdate(sql2);
			//System.out.println(result + "행이 삽입");
			
			//수정
			//sql2 = "update goodsinfo set name='전자사전', price=180000 where code='10004'";
			//int result = stmt.executeUpdate(sql2);
			//System.out.println(result + "행이 수정");
			
			//삭제
			sql2 = "delete from goodsinfo where code='10006'";
			int result = stmt.executeUpdate(sql2);
			System.out.println(result + "행이 삭제");
			
			sql = "select * from goodsinfo order by code";
			rs = stmt.executeQuery(sql);
			
			System.out.println("상품코드 상품명 \t\t\t가격 제조사");
			System.out.println("-------------------------------------------");
			while(rs.next()) {
				String code = rs.getString("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				System.out.printf("%8s %-10s \t%8d %-10s \n", code, name, price, maker);
			}
			System.out.println("데이터 베이스 접속 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("해당클래스를 찾을 수 없음");
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