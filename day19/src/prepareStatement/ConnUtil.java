/*
JDBC 이용한 데이터베이스 연결 방법
1단계 : Driver 로딩 - Class.forName("oracle.jdbc.OracleDriver");
2단계 : DataBase 연결
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
 											  	 (ip주소:포트번호:전역변수, 계정명=user, 비번)
3단계 : Query문 작성
	Statement stmt = conn.createStatement();//정적
	prepareStatement pstmt = conn.prepareStatement(sql);//동적(미리 컴파일 됨), 반복작업을 해야하는 경우 유리
4단계 : 결과 담기
	ResultSet rs = stmt.excuteQuery("쿼리문");//select
	stmt.excuteUpdate("쿼리문");//insert, delete, update
5단계 : resource 사용 후 닫기
	conn.close();
	stmt.close();
	rs.close();

prepareStatement객체의 생성 및 바인딩 변수의 사용
	String sql = "insert into department(테이블명) values(?,?,?,?)";//뭐가 들어갈지 모르니 ?로 넣을 갯수 만큼 넣어야함.
	prepareStatement pstmt = conn.prepareStatement(sql);
	바인딩 변수의 개수만큼 순서대로 해당 변수와 대체될 값을 지정해준다
	pstmt.setInt(1,203); // (컬럼위치, 값);
	pstmt.setString(2,"컴퓨터공학"); // (컬럼위치, 값);
	pstmt.setInt(3,200); // (컬럼위치, 값);
	pstmt.setString(4,"4호관"); // (컬럼위치, 값);
	바인딩 변수는 컬럼명에는 절대 사용 할 수 없다(컬럼위치를 써야함)
	
	기본키(Primary key) : 테이블의 각 행을 다른 행과 구분해 주는 역할을 하는 필드(유일성) 반드시 값이 있어야 하고 중복 안됨.
						  즉, not null, unique 제약 조건을 포함 해야함.
	
	관계형데이터베이스(RDB) : 기본 DB에 추가 DB를 만들어 연결해야 하는경우 
	외래키=외부키(Foreign key) : 자식 테이블
	한 테이블의 기본키에 관계를 갖는 두개의 테이블이 있는 경우를 위한 것.
	외부키는 테이블 내의 한 열의 필드인 동시에 다른 테이블(부모:참조키)의 기본키인 열의 필드를 말한다.
 */
package prepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnUtil {
	static {
		try {//드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			System.out.println(e.getMessage()+"not class");
		}
	}
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		
	}
}
