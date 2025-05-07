/*
Properties를 이용한 sql문을 해보자
sql문을 별도의 Properties파일에 정의하고, Properties를 이용해서 Properties파일을
읽어서 getProperty(string key)를 활용해서 각각의 SQL문을 얻을 수 있다
department.properties를 만들자
 */
package propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import resultsetMetadata.ConnUtil;

public class JDBC_Properties_Ex01_insert {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/propertiesEx/department.properties"));
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ConnUtil.getConnection();
			//department.properties에 정의된 sql을 가져와서 PreparedStatement객체 만든다
			pstmt = conn.prepareStatement(pro.getProperty("department_insert"));
			//parmeter(바인딩변수에 값 할당받기) 셋팅하기
			pstmt.setInt(1, 998);
			pstmt.setString(2, "의예과");
			pstmt.setInt(3, 900);
			pstmt.setString(4, "7호관");
			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 추가");
		} catch (Exception e) {
			e.getMessage();
		} finally {
			ConnUtil.close(pstmt, conn);
		}

	}

}
