package day14;

import java.util.Scanner;

public class Homework01_0419 {
	public static void main(String[] args) {
		int il[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int yoil[] = { 1, 4, 5, 1, 3, 6, 1, 4, 0, 2, 5, 0 };
		Scanner scan = new Scanner(System.in);
		System.out.print("월>> ");
		int dal = scan.nextInt();
		int day = 7 - yoil[dal - 1];// 해당요일에서 부터 찍을 날짜구하기(4=7-yoil[4-1]//6
		System.out.println("..." + day);

		System.out.println("   일  월  화  수  목  금  토 ");
		System.out.println("  ───────────────────────────");
		for (int i = 0; i < yoil[dal - 1]; i++) {// 해당요일 전까지 빈공간 출력
			System.out.printf("    ");
		}
		for (int i = 1; i <= day; i++) {// 첫줄 찍기
			System.out.printf("%4d", i);
		}
		System.out.println();
		for (int i = 1; i <= il[dal - 1]; i++) {// 2번째줄에서 부터 찍기

			if (i % 7 == 0) {
				System.out.println("  " + (i + day));
			} else {
				System.out.printf("%4d", (i + day));
			}
		}
		scan.close();
	}
}
