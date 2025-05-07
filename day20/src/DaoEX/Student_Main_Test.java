//웹(온라인)에서 Servlet(시작)과 같다, 응용프로그램(오프라인)에서는 main이 시작
package DaoEX;

import java.sql.SQLException;
import java.util.List;

public class Student_Main_Test {

	public static void main(String[] args) throws SQLException {
		//1.DAO select, insert, update, delete(DML), CRUD
		Student_Dao dao = new Student_Dao();
		
		//2.VO
		StudentVO vo = new StudentVO();
		
		//3.삽입 자바빈에 저장 insert into student values(?,?,?,?)
//		vo.setNo("00003");//레코드 시작
//		vo.setName("리오");
//		vo.setScore(0);
//		vo.setSubject("무역학과");//레코드 끝
//		//DB에 저장
//		dao.insertStudent(vo);
		
		//4. 수정, score=?, subject=? where no=?
		//자바빈에 저장
//		vo.setScore(50);
//		vo.setSubject("원예학과");
//		vo.setNo("00001");
//		//DB에 수정
//		dao.updateStudent(vo);

		//5. 삭제 delete from student where no=?
		dao.deleteStudent("00003");
		
		//6. 검색 select
		List<StudentVO> list = dao.getStudentList();
		System.out.printf("학번\t이름\t점수\t학과\n");
		System.out.println("----------------------------------");
		for(StudentVO svo: list) {
			System.out.println(svo.getNo()+"\t"+svo.getName()+"\t"+svo.getScore()+"\t"+svo.getSubject());
		}
	}

}
