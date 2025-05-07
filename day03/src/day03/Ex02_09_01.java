package day03;

import java.util.Scanner;

//java TernaryOperator 20 30
public class Ex02_09_01 {

	public static void main(String[] args) {
		// 키보드로 받아오는 것은 스트링형이다 해당하는 타입에 맞게 변경해야 한다
		// 객체.기본형으로 변경(객체)
		// int a = Integer.parseInt()
		// 렙퍼클래스 -> 기본형으로 변경 -> 기본형을 객체로 변경
		// System.out.println("a값 : "+ args[0]);
		// System.out.println("b값 : "+ args[1]);

		// int a = Integer.parseInt(args[0]);//30
		// int b = Integer.parseInt(args[1]);//20

		// System.out.println("a + b = " + (a+b));
		// System.out.println("a - b = " + (a-b));

		Scanner scan = new Scanner(System.in);
		System.out.print("a : ");
		int a = scan.nextInt();
		System.out.print("b : ");
		int b = scan.nextInt();
		String str;

		if (a > b) {
			System.out.println("a가 b보다 큽니다");
		} else if (a == b) {
			System.out.println("a와 b는 같습니다");
		} else {
			System.out.println("b가 a보다 큽니다");
		}
		
		str = (a>b)?"a가 b보다 큽니다":(a==b)?"a와 b는 같습니다":"b가 a보다 큽니다";
		System.out.println(str);
		scan.close();
	}

}
