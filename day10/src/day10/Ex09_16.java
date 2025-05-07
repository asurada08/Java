package day10;

public class Ex09_16 {
	static void func1() {//void형 메소드로서 반환값이 없다
		System.out.println("void형 메소드는 돌려줄게 없음");
	}
	static int func2() {//int형 메소드로서 반환값이 있다
		return 100;
	}
	public static void main(String[] args) {
		int a;
		Ex09_16 test = new Ex09_16();//다른 클래스라면 이렇게 접근 가능
		test.func1();
		
		Ex09_16.func1();//같은 클래스여서 이렇게 접근 가능, 다른클래스에서 접근할때?
		
		func1();//void형 메소드를 호출 / 같은 클래스에서 이렇게 접근 가능
		a= func2();//int형 메소드를 호출
		System.out.printf("int형 메소드에서 돌려준 값 : %d\n",a);

	}

}
