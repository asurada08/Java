//call by value : 반환형X, 매개변수O 있는 기본값 전달 (값 하나만 전달)
//값을 복사해서 전달하고 돌아와서 원래변수에 변화X
package day11;
import java.util.Scanner;
public class Method01 {
	public static void add(int a, int b) {
		System.out.printf("%d + %d = %d\n", a, b, a+b);
	}
	public static void min(int a, int b) {
		System.out.printf("%d - %d = %d\n", a, b, a-b);
	}
	public static void mul(int a, int b) {
		System.out.printf("%d * %d = %d\n", a, b, a*b);
	}
	public static void div(int a, int b) {
		System.out.printf("%d / %d = %d\n", a, b, a/b);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int a = scan.nextInt();
		System.out.print("두번째 정수 : ");
		int b = scan.nextInt();
		/*int tot = a + b;
		System.out.printf("%d + %d = %d\n", a, b, tot);
		tot = a - b;
		System.out.printf("%d - %d = %d\n", a, b, tot);
		tot = a * b;
		System.out.printf("%d * %d = %d\n", a, b, tot);
		tot = a / b;
		System.out.printf("%d / %d = %d\n", a, b, tot);*/
		add(a,b);
		min(a,b);
		mul(a,b);
		div(a,b);
		scan.close();
	}

}
