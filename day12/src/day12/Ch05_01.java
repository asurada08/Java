package day12;

class Point {
	public Point() {//
		System.out.println("부모 생성자 호출.....");
	}
	int x, y;// 한 점을 구성하는 x, y 좌표

	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

//자식클래스(Ch05_01) extends 부모클래스(Point)
public class Ch05_01 extends Point {// 클래스는 단일 상속만 가능함
	// 다중상속은 인터페이스로만 가능함
	// 자식클래스 implements 부모인터페이스, 부모인터페이스...

	// Point를 상속받은 ColorPoint 선언
	public Ch05_01() {
		System.out.println("자식 생성자 호출.....");
	}
	String color;

	void setColor(String color) {
		this.color = color;
	}

	void showColorPoint() {// 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();// Point클래스의 showPoint()호출
	}

	public static void main(String[] args) {
		Ch05_01 cp = new Ch05_01();//객체 선언하면 디폴트 생성자를 자동 호출함.(메모리할당)
		cp.set(3, 4);// Point 클래스의 set()메소드 호출
		cp.setColor("green");// 색 지정
		cp.showColorPoint();// 컬러 점의 좌표 출력

	}

}
