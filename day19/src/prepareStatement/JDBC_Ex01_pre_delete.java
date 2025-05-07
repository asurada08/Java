package prepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBC_Ex01_pre_delete {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from professor where name=?");
		Connection conn= null;
		PreparedStatement pstmt = null;
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, "고길동");
			int i = pstmt.executeUpdate();
			System.out.println(i+"개의 행이 삭제");
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println(e.getMessage()+"오류");
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
