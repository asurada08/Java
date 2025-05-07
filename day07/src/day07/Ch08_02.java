package day07;

import java.util.Scanner;

public class Ch08_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] aa = new int[4];
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i] + " ");
		}
		System.out.println("");
		System.out.print("1번째 숫자 : ");
		aa[0] = scan.nextInt();
		System.out.print("2번째 숫자 : ");
		aa[1] = scan.nextInt();
		System.out.print("3번째 숫자 : ");
		aa[2] = scan.nextInt();
		System.out.print("4번째 숫자 : ");
		aa[3] = scan.nextInt();

		int sum = 0;
		sum = aa[0] + aa[1] + aa[2] + aa[3];
		System.out.printf("aa[0] %d aa[1] %d aa[2] %d aa[3] %d\n", aa[0], aa[1], aa[2], aa[3]);
		System.out.println("합 : " + sum);

		sum = 0;
		for (int i = 0; i < aa.length; i++) {
			System.out.printf("%d번째 숫자 : ", i);
			aa[i] = scan.nextInt();
			sum += aa[i];
		}
		System.out.println("합 : " + sum);

		int index = 0;
		sum = 0;
		for (int i : aa) {
			System.out.printf("%d번째 숫자 : ", ++index);
			i = scan.nextInt();
			sum += i;
		}
		System.out.println("합 : " + sum);
		scan.close();
	}

}
