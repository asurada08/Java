package propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import resultsetMetadata.ConnUtil;

public class JDBC_Properties_Ex01_select {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		// 파일에 정의 되어있는것을 불러와서 저장하는 역할
		pro.load(new FileInputStream("src/propertiesEx/department.properties"));
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(pro.getProperty("department_select"));

			//pstmt.setInt(1, 207);
			rs = pstmt.executeQuery();
			System.out.println("----------------------------------------");
			System.out.println("DEPTNO      DNAME      COLLEGE      LOC");
			System.out.println("----------------------------------------");
			while(rs.next()){//rs.next();
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				int college = rs.getInt("college");
				String loc = rs.getString("loc");
				System.out.printf("%5d\t%5s\t%5d\t%5s\n", deptno, dname, college, loc);
			}
		} catch (Exception e) {
			ConnUtil.close(pstmt, conn, rs);
		}
	}
}
