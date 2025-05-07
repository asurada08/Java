package day11;

class StaticSample {
	public int n;

	public void g() {
		m = 20;
	}

	public void h() {
		m = 30;
	}

	public static int m;

	public static void f() {
		m = 5;
	}
}

public class Ch04_StaticSample {

	public static void main(String[] args) {
		StaticSample s1, s2;
		s1 = new StaticSample();
		System.out.println("s1.m : "+s1.m);
		System.out.println("s1.n : "+s1.n);
		s1.n = 5;
		System.out.println("\ns1.n = 5 후");
		System.out.println("s1.m : "+s1.m);
		System.out.println("s1.n : "+s1.n);
		s1.g();
		System.out.println("\ns1.g() 후");
		System.out.println("s1.m : "+s1.m);
		System.out.println("s1.n : "+s1.n);
		s1.m = 50;//static
		System.out.println("\ns1.m = 50 후");
		System.out.println("s1.m : "+s1.m);
		System.out.println("s1.n : "+s1.n);
		s2 = new StaticSample();
		System.out.println("\ns2.m : "+s2.m);
		System.out.println("s2.n : "+s2.n);
		s2.n = 8;
		System.out.println("\ns2.n = 8 후");
		System.out.println("s2.m : "+s2.m);
		System.out.println("s2.n : "+s2.n);
		s2.h();
		System.out.println("\ns2.h() 후");
		System.out.println("s2.m : "+s2.m);
		System.out.println("s2.n : "+s2.n);
		s2.f();//static
		System.out.println("\ns2.f() 후");
		System.out.println("s2.m : "+s2.m);
		System.out.println("s2.n : "+s2.n);
		System.out.println("\ns1.m s2.m 최종 결과");
		System.out.println("s1.m : "+s1.m);
		System.out.println("s2.m : "+s2.m);
	}

}
