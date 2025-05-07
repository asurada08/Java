package day11;
//this()	 	: 디폴트 생성자 호출 반드시 생성자 내에서만 사용
//			  	  반드시 첫줄에 와야 한다. 객체 자신의 생성자 호출시 사용
//this.필드 		: 멤버변수 초기화
//this.메소드()	: 맴버메소드 호출
public class Ch04_this {
	int id;

	public Ch04_this(int x) {
		this();//또 다른 생성자를 호출할때(Overloading) 생성자내에 첫줄에 와야 한다.
		this.id = x;
		this.set(x);//static이 아니여서 접근 가능
	}
	public Ch04_this() {
		
	}
	public void set(int x) {//static에는 this 쓸수 없음.
		this.id = x;
	}

	public int get() {
		return this.id;
	}

	public static void main(String[] args) {
		Ch04_this ob1 = new Ch04_this(3);
		Ch04_this ob2 = new Ch04_this(3);
		Ch04_this ob3 = new Ch04_this(3);
		ob1.set(5);
		ob2.set(6);
		ob3.set(7);
		System.out.println(ob1.get());
		System.out.println(ob2.get());
		System.out.println(ob3.get());
		
		Ch04_this s;
		s=ob2;//s에 ob2 주소를 넘김
		ob1=ob2;//ob1에 ob2 주소를 넘김 ob2:GC대상(가비지컬랙터)
		System.out.println("ob1.id = "+ob1.id);
		System.out.println("ob2.id = "+ob2.id);
	}

}
