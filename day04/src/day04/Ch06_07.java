package day04;

import java.util.Scanner;

public class Ch06_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇단을 출력 할까요? ");
		int dan = scan.nextInt();
		int i;
		System.out.println("for");
		for (i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
		}
		System.out.println("\nwhile");
		i = 1;
		while(i<=9) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			i++;
		}
		System.out.println("\ndo-while");
		i = 1;
		do {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			i++;
		} while (i <= 9);
		scan.close();
	}

}