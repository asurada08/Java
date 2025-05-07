package day13;

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Ch06_ObjectProperty {
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		// 클래스의 이름 가져오기
		System.out.println("p.getClass() : " + p.getClass());
		System.out.println("p.getClass().getName() : " + p.getClass().getName());
		// 객체를 유일하게 구분할 수 있는 정수 ID값을 리턴한다
		// ID값은 객체가 생성될 때 주어지는 값이다 : 
		System.out.println("p.hashCode() : " + p.hashCode());
		System.out.println("p.toString() : " + p.toString());
		System.out.println("p : " + p);//자동으로 toString이 된것
	}

}
