package day06;

import java.util.Scanner;

public class Test12_0409 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1, num2;
		
		A:while (true) {
			System.out.print("첫번째 실수를 입력 : ");
			num1 = scan.nextDouble();
			System.out.print("두번째 실수를 입력 : ");
			num2 = scan.nextDouble();
			
			if (num1 == 0 && num2 == 0) {
				System.out.println("종료 합니다");
				break A;
			}
			
			System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
			System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1 - num2);
			System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1 * num2);
			System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1 / num2);
			System.out.printf("%.2f %% %.2f = %.0f\n", num1, num2, num1 % num2);
		}
		scan.close();
	}

}
