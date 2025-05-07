//2. static MemberClass
//	외부클래스의 멤버변수 선언위치에 선언. 
//	외부클래스의 static멤버처럼 다루어진다.
//	주로 외부클래스의 static멤버, 
//	특히 static메서드에서 사용될 목적으로 선언된다.
package innerClass;

public class StaticMemberClass {
	int a = 10;// 객체 만들기 전에 접근 불가
	private int b = 10;// 객체 만들기 전에 접근 불가
	static int c = 200;
	//private int b 접근하려고 setB/getB 생성
	public void setB(int b) {
		this.b = b;
	}

	public int getB() {
		return b;
	}

	static class inner {
		// 모든 종률의 필드와 메소드 선언 가능
		// 외부 클래스의 멤버인스턴스를 접근하기 위해 객체 생성
		StaticMemberClass s = new StaticMemberClass();
		int d = 100;
		static int a = 200;
		// non static error
		// 객체 생성후에 접근 가능, 기본 접근시 접근 불가(a)
		public void printData() {
			System.out.println("int a = " + s.a + ", " + a);
			System.out.println("private int b = " + s.b);//또는 s.getB()
			System.out.println("int d = " + d);
			sMethod();//외부클래스의 static메소드 호출
			s.Method();//객체생성후 접근 가능
		}//printData
	}//innerClass
	public static void sMethod() {
		System.out.println("스택메소드...");
	};
	public void Method() {
		System.out.println("non-스택메소드...");
	};

	public static void main(String[] args) {
		StaticMemberClass.inner inner = new StaticMemberClass.inner();
		inner.printData();
		System.out.println("---------------");
		inner in = new inner();
		in.printData();
	}


	

	

}
