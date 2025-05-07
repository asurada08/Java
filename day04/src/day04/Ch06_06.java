package day04;

import java.util.Scanner;

public class Ch06_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3, i, sum;
		System.out.print("시작값 : ");
		num1 = scan.nextInt();
		System.out.print("종료값 : ");
		num2 = scan.nextInt();
		System.out.print("증가값 : ");
		num3 = scan.nextInt();

		sum = 0;
		System.out.println("for");
		for (i = num1; i <= num2; i += num3) {
			sum += i;
		}
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합은 : %d\n", num1, num2, num3, sum);
		System.out.println("while");
		sum = 0;
		i = num1;
		while (i <= num2) {
			sum += i;
			i += num3;
		}
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합은 : %d\n", num1, num2, num3, sum);
		System.out.println("do-while");
		sum = 0;
		i = num1;
		do {
			sum += i;
			i += num3;
		} while (i <= num2);
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합은 : %d\n", num1, num2, num3, sum);
		scan.close();
	}
}
