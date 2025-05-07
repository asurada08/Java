package day15;

public class Object_Init {
	int n = 1000;// 묵시적 초기화, 명시적 초기화 int = 3;
	int m = 3000;
	static int s;
	
	
	public Object_Init() {//생성자
		System.out.print("\n디폴트 생성자...");
	};

	// 인스턴스 초기화 블럭
	{// 모두(정적/동적 : 메소드, 필드) 허용
		s = 300;// static
		n = 500;
		m = 300;
		System.out.println("\n인스턴스 초기화...");
		write();// 동적(인스턴스) 메소드
		write2();// 동적(static) 메소드 (O)
		this.n = 3;// this(O)
	};
	// 정적 초기화 블럭
	static {
		s = 900;
//		n = 500;//error 정적필드/메소드만 와야함
//		m = 300;//error 정적필드/메소드만 와야함
		System.out.print("\n정적 초기화... s : " + s);
//		write();//동적(인스턴스) 메소드 (X)
		write2();// 동적(static) 메소드 (O)
//		this.n = 3;// this(X)
	};
	public Object_Init(int n, int m) {
		this.n = n;
		this.m = m;
	}
	public void write() {
		//Object_Init t = new Object_Init();
		m = 20;
		s = 20;
		System.out.println("n : " + n + ", m : " + m + ", s : " + s);
	};

	public static void write2() {
		//Object_Init t = new Object_Init();
		//t.m = 20;
		s = 20;
	};

	public static void main(String[] args) {
		Object_Init ob1 = new Object_Init();
		System.out.println("\nob1.m : " + ob1.m);
		System.out.println("ob1.n : " + ob1.n);
		ob1.write();
		Object_Init ob2 = new Object_Init();
		System.out.println("\nob2.m : " + ob2.m);
		System.out.println("ob2.n : " + ob2.n);
		ob2.write();

	}

}
/*
--생성자(Constructor)와 초기화 블럭(Initialized Block)
====================================================
클래스변수의 초기화시점 : 클래스가 처음 로딩될때 단 한번 초기화 된다.
인스턴스변수의 초기화시점 :인스턴스가 생성될 때마다 
각 인스턴스별로 초기화가 이루어진다.
클래스변수의 초기화순서  : 기본값(묵시적초기화)--> 명시적초기화-->클래스초기화 (정적)블럭   
                     	-->인스턴스 초기화 블럭 --> 생성자
인스턴스변수의 초기화순서 : 기본값(묵시적초기화)--> 명시적초기화-->인스턴스 초기화(동적) 블럭 
                      	--> 생성자
출력)
정적 초기화...200
인스턴스 초기화...
n:0, m:0, s:200
디폴트생성자...
ob1.m=0
ob1.n=3
n:3, m:0, s:200
인스턴스 초기화...
n:0, m:0, s:200
디폴트생성자...
ob2.m=0
ob2.n=3
n:3, m:0, s:200
*/