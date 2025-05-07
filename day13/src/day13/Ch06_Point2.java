package day13;

public class Ch06_Point2 {
	int x, y;
	public Ch06_Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Ch06_Point2 p) {
		if(x==p.x && y==p.y) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Ch06_Point2 a = new Ch06_Point2(2, 3);
		Ch06_Point2 b = new Ch06_Point2(2, 3);
		Ch06_Point2 c = new Ch06_Point2(3, 4);
		Ch06_Point2 d = a;
		if(a==b) {//false
			System.out.println("a==b");//주소
		}
		if(d==a) {//true
			System.out.println("d==a");//주소
		}
		if(a.equals(b)) {//true
			System.out.println("a is equal to b");//값
		}
		if(a.equals(c)) {//false
			System.out.println("a is equal to c");//값
		}
	}
}
