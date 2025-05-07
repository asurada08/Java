/*
JDBC 드러이버의 종류
 - JDBC 드라이버는 DBMS의 벤더나 다른 연구 단체들에서 만들어진다. JDBC드라이버는 크게 4가지로 분류된다
 1) JDBC-ODBC 드라이버 : Type-1 
    JDBC API로 작성된 프로그램이 JDBC-ODBC 브리지를 통해 ODBC 드라이버를 JDB드라이버로 여기고 동작
    하도록 한다. 반드시 운영체제 내에 ODBC 드라이버가 존재해야 한다.  - Type -2
 2) 데이터 베이스 API 드라이버 : Type-2
    JDBC API호출을 특정 데이터 베이스의 클라이언트 호출 API로 바꿔주는 드라이버다. 오라클 OCI드라이버가 여기에 속한다.
 3) 네트워크 프로토콜 드라이버 : TYPE-3
    클라이언틔 JDBC API 호출을 특정 데이터베이스의 프로토콜과 전혀 상관없이 독자적인 방식의 프로토콜로 바꾸어 서버로
    전송한다.
    서버에는 미들웨이가 프로토콜을 특정 데이터베이스 API로 바꾸어 처리한다.
 4) 데이터 베이스 프로토콜 드라이버 : Type-4
    JDBC  API 호출을 서버의 특정 데이터베이스에 맞는 프로토콜로 변환시켜 서버로 전송하는 드라이버(Java Thin Driver)이다.

커서 : 명시적인 커서(select), 묵시적인(DML:insert, delete, update)
  ResultSet :select query의 수행결과로 얻어진 결과집합을  추상화한것이다.
  ResultSet은 결과집합에서 data를 가져올 수 있는 다양한 메소드와 Cursor를 포함 하고 있음.
  
  boolean first(): ResultSet에서 커서를 첫번째 row로 이동한다.row가 있으면 true, 없으면 false를 반환
          last() : ResultSet에서 커서를 마지막 row로 이동한다.row가 있으면 true, 없으면 false를 반환
          next() : ResultSet에서 커서를 다음 row로 이동한다.row가 있으면 true, 없으면 false를 반환
          previous() : ResultSet에서 커서를 이전 row로 이동한다.row가 있으면 true, 없으면 false를 반환
  int     getInt(int 컬럼인덱스)ResultSet에서 커서가 가르키는 현재 row에서 
                             columnIndex에서 해당하는 int값을 반환 //칼럼인덱스는 무조건 1부터시작
  String  getString(String 컬럼이름) ResultSet에서 커서가 가르키는 현재 
                                   row에서 columnName에서 해당하는 String값을 반환  //"칼럼이름"
  
  String ResultSet    getString(int 컬럼인덱스) ResultSet에서 커서가 가르키는 현재 row에서 
                      columnIndex에 해당하는 String값을 반환
                      getString(String 컬럼이름)ResultSet에서 커서가 가르키는 현재 row에서 
                      columnName에 해당하는 String값을 반환
*/

package prepareStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Ex01_pre_select {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		//select a.name, a.profno, a.position, b.dname
		//from professor a, department b
		//where a.deptno = b.deptno and a.deptno=?
		sql.append("select a.name,a.profno,a.position,b.dname ");
		sql.append("from professor a, department b ");
		sql.append("where a.deptno=b.deptno and a.deptno=? ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			//? 101 셋팅
			pstmt.setInt(1, 101);
			rs = pstmt.executeQuery();//rs에 저장
			System.out.println("이름	교수번호	전공학과		직책");
			System.out.println("---------------------------------------");
			// 쿼리 실행
			while (rs.next()) {
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getInt("profno")+"\t");
				System.out.print(rs.getString("dname")+"\t");
				System.out.println(rs.getString("position"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage()+" sql 실패...");
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			}catch (Exception e2) {
				e2.getStackTrace();
			}
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.getStackTrace();
			}
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
		
	}

}
