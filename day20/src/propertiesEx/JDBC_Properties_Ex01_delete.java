package propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import resultsetMetadata.ConnUtil;

public class JDBC_Properties_Ex01_delete {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		try {
			pro.load(new FileInputStream("src/propertiesEx/department.properties"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(pro.getProperty("department_delete"));
			pstmt.setInt(1, 998);
			int i = pstmt.executeUpdate();
			System.out.println(i+"개의 행이 삭제");
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("오류");
		} finally {
			ConnUtil.close(pstmt, conn);
		}
	}

}
