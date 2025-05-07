package prepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBC_Ex01_pre_insert {

	public static void main(String[] args) {
		//prepareStatment를 사용하는 경우
		StringBuffer sql = new StringBuffer();
		//sysdate()시스템의 오늘 날짜 가져오는 함수 : 프로그램에서 '()'쓰지 않는다
		sql.append("insert into professor values(?,?,?,?,?,sysdate,?,?)");//8개
		Connection conn= null;
		PreparedStatement pstmt = null;
		try {
			//커넥션
			conn = ConnUtil.getConnection();
			//prepareStatment 객체 얻어오기
			pstmt = conn.prepareStatement(sql.toString());
			System.out.println("여기까지 진행되는지 확인해 봄...");
			//값 세팅
			pstmt.setInt(1, 9902);//기본키 : 중복X, 유일, not null;
			pstmt.setString(2, "고길동");
			pstmt.setString(3, "dong");
			pstmt.setString(4, "시간교수");
			pstmt.setInt(5, 450);
			pstmt.setInt(6, 40);
			pstmt.setInt(7, 101);
			System.out.println("여기까지 - 2 진행되는지 확인해 봄...");
			
			//쿼리 실행
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이 추가");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " sql 실패...");
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
