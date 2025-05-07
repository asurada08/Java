/*
ResultsetMetadata : java.sql.ResultSetMetaData/java.sql.Types MetaData는
데이터의 구성요소를 나타낸다 ResultSetMetaData는 ResultSet을 구성하는 모든 요소를
알아낼 수 있는 메소드를 제공한다 
 */
package resultsetMetadata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

public class JDBC_Ex01_resultsetMetadata {
	//실행 select * from professor
	public static void main(String[] args) throws IOException, SQLException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		//키보드로 실행할 sql문장을 입력 받는 장치 실행
		System.out.print("sql 입력 : ");
		String sql = br.readLine();
		
		Connection conn = ConnUtil.getConnection();
		PreparedStatement ptmt = conn.prepareStatement(sql);//미리 컴파일
		ResultSet rs = ptmt.executeQuery();
		//쿼리 수행 결과 집합의 부가 정보를 가지고 있는 ResultSetMetaData 얻기
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnType(6));//6번째 컬럼이 뭔지 확인(hiredate = 93)
		System.out.println("컬럼의 개수 : " + rsmd.getColumnCount());
		
		//컬럼명 출력, 컬럼은 1부터 시작이여서 int i = 1;
		for(int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println("\n-----------------------------------------------------------------------------------------------");
		//컬럼타입
		for(int i= 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnTypeName(i)+"\t");
		}
		
		System.out.println("");
		int colcnt = rsmd.getColumnCount();
		while(rs.next()) {
			for(int i = 1; i <= colcnt; i++) {
				int colType = rsmd.getColumnType(i);
				switch(colType) {
				case 2://Types.NUMERIC
					System.out.print(rs.getInt(i)+"\t");
					break;
				case Types.VARCHAR:
					System.out.print(rs.getString(i)+"\t");
					break;
				case 93://Types.TIMESTAMP
					System.out.print(rs.getDate(i)+"\t");
					break;
				}//switch
			}//for
			System.out.println("");
		}//while
		
	}

}
