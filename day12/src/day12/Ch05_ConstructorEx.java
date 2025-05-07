package day12;

class A {
	public A() {// 3 생성자 호출(상속이라 부모클래스로)
		System.out.println("생성자 A");// 4 생성자 실행
	}

	public A(int x) {
		System.out.println("매개변수 있는 생성자 A");
	}
};

class B extends A {
	public B() {// 3 생성자 호출(상속이라 부모클래스로)
		System.out.println("생성자 B");// 5 생성자 실행
	}

	public B(int x) {
		super(1);
		System.out.println("매개변수 있는 생성자 B");
	}
};

class C extends B {
	public C() {// 2 생성자 호출(상속이라 부모클래스로)
		System.out.println("생성자 C");// 6생성자 실행
	}

	public C(int x) {
		//super(20);
		this();
		System.out.println("매개변수 있는 생성자 C");
	}
	public void disp(){//메소드는 클래스 안에 작성
		//this();//생성자 호출시는 무조건 생성자 메소드에서만 호출 가능하다
		//super();//부모생성자 호출시 사용
	}
};
public class Ch05_ConstructorEx {

	public static void main(String[] args) {
		C c, c1;
		c = new C();// 1 생성자 C 호출
		c1 =new C(5);
	}

}
