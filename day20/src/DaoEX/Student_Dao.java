/*
DAO(Data Access Object) 클래스 - CRUD(create, select, update, delete, insert) 작성
데이터 처리의 궁극적인 단계, 비지니스로직에서 처리된 자료를 받아 데이터베이스에 입력과 조회를 한다

VO(Value Object) == DTO : 데이터를 담는 컨테이너 역할을 하는 클래스.
데이터 전달을 목적으로 만들어진 클래스이다. VO클래스는 애플리케이션 구조에서 각 단계의 입출력 정보를 전달하는 역할을 수행
속성(Attribute), setter/getter로 구성된다

속성 : VO 클래스에 입력되는 정보를 저장
setter : 정보를 VO클래스에 저장할 때 사용
getter : VO클래스의 정보를 조회할 때 사용
*/
package DaoEX;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import resultsetMetadata.ConnUtil;

public class Student_Dao {
	//JDBC 관련 변수
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	// student테이블 관련 SQL
	String sel = "select * from student";
	String ins = "insert into student values(?,?,?,?)";
	String upd = "update student set score=?, subject=? where no=?";
	String del = "delete from student where no=?";

	public void deleteStudent(String no) throws SQLException {
		try {
			conn = ConnUtil.getConnection();
			stmt = conn.prepareStatement(del);
			stmt.setString(1, no);
			int i = stmt.executeUpdate();
			System.out.println(i+"행이 삭제");
		} catch (Exception e) {
			System.out.println(e.getMessage()+"쿼리문장 오류");
		} finally {
			ConnUtil.close(stmt, conn);
		}
	}//삭제 끝
	public void updateStudent(StudentVO vo) throws SQLException {
		try {
			conn = ConnUtil.getConnection();
			stmt = conn.prepareStatement(upd);
			stmt.setInt(1, vo.getScore());
			stmt.setString(2, vo.getSubject());
			stmt.setString(3, vo.getNo());
			int i = stmt.executeUpdate();
			System.out.println(i+"행이 수정");
		} catch (Exception e) {
			System.out.println(e.getMessage()+"쿼리문장 오류");
		} finally {
			ConnUtil.close(stmt, conn);
		}
	}//업데이트 끝
	public void insertStudent(StudentVO vo) throws SQLException {
		try {
			conn = ConnUtil.getConnection();
			stmt = conn.prepareStatement(ins);
			stmt.setString(1, vo.getNo());
			stmt.setString(2, vo.getName());
			stmt.setInt(3, vo.getScore());
			stmt.setString(4, vo.getSubject());
			stmt.executeUpdate();
			System.out.println("행이 추가");
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"삽입 에러");
		} finally {
			ConnUtil.close(stmt, conn);
		}
	}//삽입 끝
	public List<StudentVO> getStudentList() throws SQLException {
		List<StudentVO> studentList = new ArrayList<StudentVO>();
		try {
			conn = ConnUtil.getConnection();
			stmt = conn.prepareStatement(sel);
			rs = stmt.executeQuery();
			while(rs.next()) {
				StudentVO student = new StudentVO();
				student.setNo(rs.getString("no"));
				student.setName(rs.getString("name"));
				student.setScore(rs.getInt("score"));
				student.setSubject(rs.getString("subject"));
				studentList.add(student);//레코드 한줄을 리스트에 담기
				System.out.println(studentList.toString());//한줄을 출력해봄
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnUtil.close(stmt, conn, rs);
		}
		System.out.println("");
		return studentList;
	}
	
}