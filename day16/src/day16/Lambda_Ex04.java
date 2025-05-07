package day16;

interface MyFunction4 {
	int calc(int x, int y);
}

public class Lambda_Ex04 {
	public static void main(String[] args) {
		printMultify(3, 4, (x, y) -> x * y);// 람다식(x,y)->x*y을 매개변수로 전달
	}

	static void printMultify(int x, int y, MyFunction4 f) {// f로 람다식 전달받음
		System.out.println(f.calc(x, y));
	}
}
