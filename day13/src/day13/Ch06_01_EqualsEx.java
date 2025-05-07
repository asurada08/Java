package day13;

class Rect {
	int width, height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean equals(Rect p) {
		if (width * height == p.width * p.height) {
			return true;
		} else {
			return false;
		}
	}
}

public class Ch06_01_EqualsEx {
	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		Rect d = new Rect(6, 1);
		if(a.equals(b)) {
			System.out.println("a is equal to b");
		}
		if(a.equals(c)) {
			System.out.println("a is equal to c");
		}
		if(b.equals(c)) {
			System.out.println("b is equal to c");
		}
		if(a.equals(d)) {
			System.out.println("a is equal to d");
		}

	}

}
