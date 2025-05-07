package day10;

public class Person {
	//non_static 인스턴스 멤버변수 : 객체마다 개별적 값을 갖는다
	public String name;
	public int age;
	//static 클래스 멤버변수 : 
	public static int height = 170;//모든 객체가 똑같은 값

	public Person() {// 디폴트 생성자 상속안됨(항상 넣어주는 습관이 들여야 함)
		System.out.println("디폴트 생성자, 아무것도 없으면 jvm이 넣어준다");
	}

	public Person(String s) {// 멤버변수 초기화, 객체 생성
		// 반환없는 메소드, 멤버변수 초기화
		this.name = s;// this는 객체 자신
		System.out.println("매개변수 있는 생성자..." + name);
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Person aPerson, aPerson1, aPerson2;

		aPerson = new Person("김미남");
		aPerson.age = 30;
		int i = aPerson.age;
		String s = aPerson.getName();
		System.out.println("이름 : " + s);
		System.out.println("나이 : " + i);
		System.out.println("신장 : " + height);
		
		aPerson1 = new Person();
		System.out.println("이름 : " + aPerson1.name);
		System.out.println("나이 : " + aPerson1.age);
		System.out.println("신장 : " + height);
				
		aPerson2 = new Person();
		aPerson2.name = "홍길동";
		aPerson2.age = 100;
		System.out.println("이름 : " + aPerson2.name);
		System.out.println("나이 : " + aPerson2.age);
		System.out.println("신장 : " + height);
	}

}
