package jang2;

//클래스 = 필드+메소드 
public class Test01 {
	// 필드=멤버변수=속성=클래스변수=전역변수 : 디폴트값 초기화
	// 기본형, 컴파일러가 크기 결정, 스택영
	static boolean b;// false / 1byte
	byte bt;// 0 / 1byte / 이진값 표현시, 이미지, 사운드, 동영상에서 사용
	static short sh;// 0 / 2byte / C사용자를 위한 자료형
	static char ch;/* \u0000 출력되지 않음. / 2byte / ' ' 공백초기화, 문자 하나*/ 
	static int i;// 0 / 4byte / 기본:자바는 정수타입이라고 하면 무조건 int형을 말함
	static long l;// 0 / 8byte / 회계에서 많이 사용, long l = 20L;(20L, 20l 대소 구분없음)
	static float f;// 0.0 / 4byte / 정수와 실수중에 실수가 표현범위가 크다, 계산속도는 실수가 느리다
	//float f = 2.5f(O), float f = 2.5(X), float f = (float)2.5(O)
	static double d;// 0.0 / 8byte / 실수에서 기본타입, double d = 2.5;(O)
	//참조형(실행할 때 힙 메모리에 확보) : String, class, interface, 배열, Collection, eum(나열형 상수)
	//생성시 new 연산자로 객체 생성해서 사용
	String str;// null / 가리키는 주소가 없다(선언만 하고 메모리 없음)

	// 프로그램의 시작
	public static void main(String[] args) {
		// 지역변수 선언 : 사용전 꼭 초기화 한 후 사용. 통용범위(사용범위) : {}내에서 만 사용.
		int a = 20;
		int f1 = 30;
		int cnt = 20;
		int c = a + f1;//지역변수 사용
		System.out.println("cnt = "+ cnt);//지역변수 사용
		System.out.println("c = "+ c);
		//클래스 = 설계도(뼈대?) (공유 성격, 고유 성격)
		//객체 = 클래스를 갖고 각각의 객체 마다 개별화 시킴, 클래스를 가지고 구현 한것(실체)
		//생성자 : 객체를 생성, 클래스 내에 멤버 변수들을 초기화 해주는 역할을 한다
		//생성자도 메소드 이다. 차이점은 반환형이 없는 메소드 이다. 클래스 이름과 같다.
		Test01 t = new Test01();// 객체 생성, 실체화?, 인스턴스
		Test01 t2 = new Test01();// 객체 생성
		t.disp(cnt);//메소드

		System.out.println("boolean b = " + b);//static : 이미 메모리가 있음, 클래스 내에서만 접근가능
		System.out.println("boolean b = " + Test01.b);//클래스명.변수 (비선호), 클래스 내외 접근가능
		//System.out.println("boolean b = " + t2.b);//객체명.변수 (비선호), 객체 생성후 접근 가능
		System.out.println("byte bt = " + t.bt);
		System.out.println("short sh = " + sh);
		System.out.println("char ch = " + ch);
		System.out.println("int i = " + i);
		System.out.println("long l = " + l);
		System.out.println("float f = " + f);
		System.out.println("double d = " + d);
		System.out.println("String str = " + t2.str);
	}
	//메소드
	public void disp(int cnt) {
		System.out.println(cnt);//
	}
	//생성자
	public Test01() {//기본 생성자, JVM이 자동으로 넣어준다.
		System.out.println("디폴트 생성자");
	}
}
//CLI(command line Interface)
//CUI(charactor user interface)
//cmd=command
//javac Test01.java => 컴파일 하면 Test01.class 파일 생김(이진파일=완전한중간코드X)
//java Test01 => 실행

//--------------------
//공유 영역(method영역)
//--------------------
//stack영역 | Heap영역
//