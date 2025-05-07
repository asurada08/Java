package day06;

import java.util.Scanner;

public class Test02_0409 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("종료 : 0");
		int i, j, s;
		while (true) {
			System.out.print("첫줄에 찍힐 별의 갯수 : ");
			s = scan.nextInt();
			if (s == 0) {
				System.out.println("종료");
				break;
			}
			for (i = 1; i <= s; i++) {
				for (j = s; j >= i; j--) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
