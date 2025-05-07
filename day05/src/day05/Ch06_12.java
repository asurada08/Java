package day05;
import java.util.Scanner;
public class Ch06_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		for(;;) {
			System.out.print("더할 첫 번째 수 입력 : ");
			a = scan.nextInt();
			System.out.print("더할 두 번째 수 입력 : ");
			b = scan.nextInt();
			System.out.printf("%d + %d = %d", a, b, a+b);
			scan.close();
		}
	}

}
