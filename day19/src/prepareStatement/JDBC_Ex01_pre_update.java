package prepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBC_Ex01_pre_update {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		//update professor set position=? where name=?
		sql.append("update professor ");
		sql.append("set position=? where name=? ");
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			//세팅
			pstmt.setString(1, "시간강사");
			pstmt.setString(2, "고길동");
			int i = pstmt.executeUpdate();
			System.out.println(i+"개의 행이 변경");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류");
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.getMessage();
			}
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.getMessage();
			}
		}
		

	}

}
