package day10;

public class Ex09_15 {
	//클래스 정적 멤버변수 : 이미 메모리가 있고, 초기화가 되어있슴
	static int a = 100;//모든 객체들이 똑같은 값을 받는다
	int b= 500;//클래스 동적 멤버 변수 = 인스턴스 변수 : new 연산자로 메모리 생성후 사용가능
	// 전역변수 a를 생성하고 초깃값을 대입한다(static은 항상 전역변수 앞에 붙는다고 가정한다)
	
	//정적 메소드 : 이미 메모리가 있고, 공유, 그냥 사용 
	static void func1() {
		int a = 200; //지역변수 a를 선언하고 초깃값을 대입한다
		System.out.printf("func1() 에서 a의 값 : %d\n", a);//지역변수를 출력한다
		//System.out.println("b="+b);
	}//static 메소드는 static에만 접근 가능
	//동적 메소드 : new 연산자로 메모리 생성 후 사용 가능 
	void func2() {//메소드 정의 = 프로토타입 = 메소드 원형
		int a = 300;
		System.out.printf("func2() 에서 a의 값 : %d\n", a);//지역변수를 출력한다
		System.out.println("b="+b);
	}//non_static 메소드는 static / non_static 둘다 접근 가능

	public static void main(String[] args) {
		func1();//메소드를 호출한다
		System.out.printf("main()에서 a의 값 : %d\n", a);//전역변수를 출력한다
		Ex09_15 test = new Ex09_15();
		test.func2();
		
	}

}
