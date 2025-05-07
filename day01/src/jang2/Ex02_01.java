package jang2;

import java.util.Scanner;
import java.lang.System;//디폴트 패키지라서 생략 가능, 항상 메모리에 있음

public class Ex02_01 {

	public static void main(String[] args) {
		int a = 100;
		int b = 50;
		//int result;
		//double c, d;

		Scanner s = new Scanner(System.in);

		// result = a+b;
		System.out.println(a + " + " + b + " = " + (a + b));
		// result = a-b;
		System.out.println(a + " - " + b + " = " + (a - b));
		// result = a*b;
		System.out.println(a + " * " + b + " = " + (a * b));
		// result = a/b;
		System.out.println(a + " / " + b + " = " + (a / b));

		/*
		 * System.out.print("첫번째 계산할 값을 입력하세요 ==>"); c = s.nextDouble();// 입력대기
		 * System.out.print("두번째 계산할 값을 입력하세요 ==>"); d = s.nextDouble();// 입력대기
		 * System.out.println(c + " + " + d + " = " + (c + d)); System.out.println(c +
		 * " - " + d + " = " + (c - d)); System.out.println(c + " * " + d + " = " + (c *
		 * d)); System.out.println(c + " / " + d + " = " + (c / d));
		 */

		String st, st1;
		System.out.print("문자열를 입력하세요 : ");
		st = s.nextLine();
		System.out.print("문자열 입력하세요 : ");
		st1 = s.next();
		System.out.println(st);
		System.out.println(st1);

		s.close();
	}

}
