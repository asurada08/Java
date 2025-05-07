package day12;

class Ch05_A {
	public int p;
	private int n;

	public void setN(int n) {// 값 인출
		this.n = n;
	}

	public int getN() {// 값 저장 = 주입
		return n;
	}
}

public class Ch05_B extends Ch05_A {
	private int m;

	public void setM(int m) {
		this.m = m;
	}

	public int getM() {
		return m;
	}
	@Override
	public String toString() {//재정의
		String s = getN() + " " + getM();
		return s;
	}

	public static void main(String[] args) {
		Ch05_A a = new Ch05_A();
		Ch05_B b = new Ch05_B();// Ex05_B() ->Ex05_A() -> A객체생성(실행) -> B객채생성(실행)
		b.m = 5;
		// b.n=5 //error private라 getter() setter()로 접근해야함
		b.setN(10);
		System.out.println("b.getN() : " + b.getN());// 10 / b.n error남
		System.out.println("a : " + a);// day12(패키지).Ex05_A(클래스)@626b2d4a(주소값)
		System.out.println("a.toString() : " + a.toString());// day12.Ex05_A@626b2d4a
		System.out.println("b : " + b); // 10 5
		System.out.println("b.toString() : " + b.toString()); // 10 5
	}
}
