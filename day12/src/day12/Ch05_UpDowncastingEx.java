package day12;

class Person1 {
	String name;
	String id;

	public Person1(String name) {
		this.name = name;
	}
};

class Student1 extends Person1 {
	String grade;
	String department;

	public Student1(String name) {
		super(name);
	}
};

public class Ch05_UpDowncastingEx {

	public static void main(String[] args) {
		Person1 p;
		Student1 s = new Student1("이재문");
		// 부모타입을 하면 자식의 멤버들을 사용할 수 없음
		// 다형성을 지원하기 위해 업캐스팅함
		// 다형성 : 여러 유형의 타입을 지원하기 위해 사용
		p = s;// 업캐스팅 발생(== 업캐스팅, 자동캐스팅, 형식 : 부모타입 = 자식타입)
		// 다형성 때문에 업캐스팅함. 상속관계일때

		System.out.println(p.name);// 오류 없음
		// 부모객체는 부모가 갖고있는 요소만 접근할 수 있다
		// p.grade = "A";//컴파일 오류
		// p.department = "Com";//컴파일 오류
		s = (Student1) p;// 다운캐스팅, 강제형변환, 명시적인 형변환, 자식타입=(자식타입)부모객체
		
		s.name = "박모씨";
		s.grade = "1학년";
		s.department = "컴퓨터과학과";
		s.id = "id0123456789";
		System.out.println("이름 : " + s.name);
		System.out.println("학년 : " + s.grade);
		System.out.println("전공 : " + s.department);
		System.out.println("id : " + s.id);
	}

}
//자식을 부모요소로 담는것(자동타입변환) Upcasting
//부모클래스 요소를 자식클래스에 담는것(강제타입변환) downcasting
//업캐스팅된 것을 다시 원래대로 되돌리는 것 downcasting
//A(){}
//B extends A(){}
//C extends A(){
//	static void disp(A a){A instanceof b --> (B)a; 다운캐스팅} 
//	main(){
//		C c = new C();
//		B b = new B();
//		c.disp(c); // a가 들어갈 자리에 c 가 들어가도 가능하는건 다형성? 
//		b.disp(b);
//	}
//}