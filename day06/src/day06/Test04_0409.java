package day06;

import java.util.Scanner;

public class Test04_0409 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("종료 : 0");
		int i, j, k, s;
		while (true) {
			System.out.print("찍힐 별의 줄수 : ");
			s = scan.nextInt();
			if (s == 0) {
				System.out.println("종료");
				break;
			}
			for (i = s; i >= 1; i--) {
				for (j = 0; j < s - i; j++) {
					System.out.print(" ");
				}
				for (k = 1; k <= i * 2 - 1; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}