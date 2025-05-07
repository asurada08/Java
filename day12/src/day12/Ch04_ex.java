package day12;

class StaticSample{
	public int n;
	//static 메소드 내에서는 static 멤버필드만 접근해야함. non-static 멤버필드 접근 불가
	//this 키워드 사용불가
	public static int m;
	//non-static메소드 내에서는 static / non-static 멤버필드 모드 접근 할 수 있다
	public void g() {//n=3 O (this.n=3 도 O) 굳이 this 쓸 필요 없다.
		m=20;
		n=3;
	}
	public void h() {//m=30 O
		m=30;
	}
	public static void f() {//n=3 X, this.m=2 X
		//this,m=2;
		m=5;
		//n=3;
		
	}
}

public class Ch04_ex {

	public static void main(String[] args) {
		StaticSample.m=10;
		
		StaticSample s1;
		s1= new StaticSample();
		System.out.println("호출 전 : "+s1.m);//10
		System.out.println(s1.m);
		s1.f();
		StaticSample.f();
		System.out.println("호출 후 : "+s1.m);//5
	}

}
