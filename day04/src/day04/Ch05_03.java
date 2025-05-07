package day04;

import java.util.Scanner;

public class Ch05_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.println("종료 = -1");
		while (true) {
			System.out.print("점수를 입력하세요 : ");
			a = scan.nextInt();

			if (a > 100 && a < 0) {
				System.out.println("정확한 값을 입력하세요");
			} else if (a >= 90 && a <= 100) {
				System.out.print("A");
			} else if (a >= 80 && a < 90) {
				System.out.print("B");
			} else if (a >= 70 && a < 80) {
				System.out.print("C");
			} else if (a >= 60 && a < 70) {
				System.out.print("D");
			} else if (a == -1) {
				System.out.println("종료");
				break;
			} else if (a >= 0 && a < 60) {
				System.out.print("F");
			}
			System.out.print("학점입니다\n");
		}
		scan.close();
	}

}
