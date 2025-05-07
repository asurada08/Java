// call by value : 반환형 X, 매개변수 X 메소드 전달
package day11;

public class Method03 {
	public static void disp() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		disp();//call by value : 반환형X, 매개변수X
	}
}
