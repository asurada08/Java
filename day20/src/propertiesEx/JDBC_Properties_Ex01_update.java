package propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import resultsetMetadata.ConnUtil;

public class JDBC_Properties_Ex01_update {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		try {
			pro.load(new FileInputStream("src/propertiesEx/department.properties"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(pro.getProperty("department_update"));
			pstmt.setString(1, "의예과");
			pstmt.setInt(2, 999);
			pstmt.setInt(3, 207);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 수정");
			
			pstmt = conn.prepareStatement("select * from department");
			rs = pstmt.executeQuery();
			
			System.out.println("----------------------------------------");
			System.out.println("DEPTNO      DNAME      COLLEGE      LOC");
			System.out.println("----------------------------------------");
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				int college = rs.getInt("college");
				String loc = rs.getString("loc");
				System.out.printf("%5d\t%5s\t%5d\t%5s\n", deptno, dname, college, loc);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("SQL문장이 틀림");
		} finally {
			ConnUtil.close(pstmt, conn, rs);
		}
	}

}
