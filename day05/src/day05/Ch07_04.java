package day05;

import java.util.Scanner;

public class Ch07_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;

		while (true) {
			System.out.print("더할 첫 번째 수 입력 : ");
			a = scan.nextInt();
			System.out.print("더할 두 번째 수 입력 : ");
			b = scan.nextInt();

			if (a == 0 && b == 0) {
				break;
			}
			System.out.printf("%d + %d = %d\n", a, b, a + b);
		}
		System.out.println("두 값 다 0을 입력해서 종료하겠습니다\n");
		scan.close();
	}
}
