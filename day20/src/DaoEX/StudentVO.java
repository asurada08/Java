//자바빈 = use bean : 데이터베이스 테이블에서 SELECT 한 후에 레코드 단위로 검색 또는 저장하는 목적
//VO(Value Object)==DTO(Data Transfer Object) 객체에 저장한 후 폼에 출력하기 위함
//폼에 있는 자료를 VO객체에 저장한 후, 디비에 레코드 단위로 저장하기 위함
package DaoEX;

public class StudentVO {
	private String no;
	private String name;
	private int score;
	private String subject;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "StudentVO [no=" + no + ", name=" + name + ", score=" + score + ", subject=" + subject + "]";
	}	
	
}
