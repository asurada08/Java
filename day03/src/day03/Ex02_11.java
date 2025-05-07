package day03;

import java.util.Scanner;

public class Ex02_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = scan.nextInt();
		String str, str1, str2;
		str1 = "3의 배수 입니다";
		str2 = "3의 배수가 아닙니다";
		if (a%3==0) {
			str = "3의 배수 입니다";
		} else {
			str = "3의 배수가 아닙니다";
		}
		System.out.println(str);
		
		str = (a%3==0)?str1:str2;
		System.out.println(str);
		scan.close();
	}

}
