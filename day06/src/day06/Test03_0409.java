package day06;

import java.util.Scanner;

public class Test03_0409 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("종료 : 0");
		int i, j, k, s;
		while (true) {
			System.out.print("마지막줄에 찍힐 별의 갯수 : ");
			s = scan.nextInt();
			if (s == 0) {
				System.out.println("종료");
				break;
			}
			for (i = 0; i < s; i++) {
				for (j = s - 1; j > i; j--) {
					System.out.print(" ");
				}
				for (k = 0; k < i + 1; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
