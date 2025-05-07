package day04;

import java.util.Scanner;

public class Ch06_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, i, sum = 0;
		System.out.print("값 입력 : ");
		num = scan.nextInt();
		for (i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.print("1부터 " + num + " 까지의 합은 : " + sum);
		System.out.println("");
		int j = 1;
		sum = 0;
		while (j <= num) {
			sum += j;
			j++;
		}
		System.out.print("1부터 " + num + " 까지의 합은 : " + sum);
		System.out.println("");
		int k = 1;
		sum = 0;
		do {
			sum += k;
			k++;
		} while (k <= num);
		System.out.print("1부터 " + num + " 까지의 합은 : " + sum);
		scan.close();
	}
}
