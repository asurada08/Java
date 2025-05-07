package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Ex02 {

	public static void main(String[] args) throws SQLException {
		// 연결객체 정의
		Connection conn = null;// 연결객체 초기화
		// 문장객체 정의
		Statement stmt = null;
		// ResultSet 객체 정의
		ResultSet rs = null;
		String sql = "", sql2 = "";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			// DDL(데이터정의어), DML(데이터조작어),DCL(데이터제어어)
			// 조작어(insert, delete, update), 질의어=검색=조회(select)
			// 문장객체 생성(정적), CURD/exeuteUpdate:삽입,삭제,수정
			stmt = conn.createStatement();// sql문 수행할 문장객체 생성
			sql = "select * from goodsinfo";
			rs = stmt.executeQuery(sql);
			//삽입
			//sql2 = "insert into goodsinfo(code, name, price, maker)" + "values('10008','스마트워치',300000,'삼성')";
			//int result = stmt.executeUpdate(sql2);
			//System.out.println("삽입 성공" + result);
			//수정
			//sql2 = "update goodsinfo set name='전자사전', price=180000, maker='아이리버' where code=10008";
			//int result = stmt.executeUpdate(sql2);
			//System.out.println("수정 성공" + result);
			//삭제
			
			// 제목출력
			System.out.println("상품코드 상품명 \t\t가격 제조사");
			System.out.println("--------------------------------------");
			// rs에서 자료 읽어서 출력하기
			while (rs.next()) {
				String code = rs.getString("code");// 칼럼명 또는 위치
				String name = rs.getString(2);// 위치
				int price = rs.getInt("price");// 칼럼명
				String maker = rs.getString(4);// 위치
				System.out.printf("%8s %s \t%d %s %n", code, name, price, maker);
			}
			System.out.println("데이터베이스 접속 성공");
		} catch (ClassNotFoundException e) {
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
