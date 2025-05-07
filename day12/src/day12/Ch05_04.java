package day12;

class DObject {
	// 오버라이딩 접근지정자만 부모보다 크거나 같아야하고 나머지는 모두 같아야 한다
	// 부모 메소드를 자식이 재정의 하는 것 : 접근지정자 반환형 메소드{}[],꼭 상속 관계여야 한다
	// 오버로딩 : 메소드명을 기준으로 왼쪽은 무관, 오른쪽은 자료타입, 자료갯수, 모두 달라야한다.

	public DObject next;

	public DObject() {
		next = null;
	}

	public void draw() {
		System.out.println("DObject draw");
	}
}

class Line extends DObject {
	public void draw() {// 메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends DObject {
	public void draw() {// 메소드 오버라이딩
		System.out.println("Rect");
	}
}

class Circle extends DObject {
	public void draw() {// 메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class Ch05_04 {

	public static void main(String[] args) {
		DObject obj = new DObject();
		Line line = new Line();
		DObject p = new Line();// upcasting
		DObject r = line;// upcasting

		obj.draw();// DObject.draw()메소드 실행 "DObject draw"출력
		line.draw();
		p.draw();// 오버라이딩된 메소드 Line.draw() 실행 "Line" 출력(동적바인딩)
		r.draw();// 오버라이딩된 메소드 Line.draw() 실행 "Line" 출력(동적바인딩)

		DObject rect = new Rect();// upcasting
		DObject circle = new Circle();// upcasting
		rect.draw();// 오버라이딩 된 메소드 Rect.draw() 실행 "Rect" 출력
		circle.draw();// 오버라이딩된 메소드 Circle.draw()실행 "Circle" 출력

		// 다운캐스팅
		Rect r1 = (Rect) rect; // downcasting 원래걸로 변환
		Circle C = (Circle) circle;// downcasting 원래걸로 변환

	}

}
//반드시 슈퍼 클래스 메소드와 동일한 이름, 동일한 호출 인자, 반환타입을 가져야함
//오버라이딩된 메소드의 접근 지정자는 슈퍼 클래스의 메소드의 접근지정자 보다 좁아질수 없다
//public > protected > private 순으로 지정 범위가 좁아진다
//반환 타입만 다르면 오류
//staric, private, 또는 final 메소드는 오버라이딩 될 수 없다
