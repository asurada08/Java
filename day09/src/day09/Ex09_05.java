package day09;

import java.util.Scanner;

public class Ex09_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str, strRep, strSub, StrAry[];
		System.out.print("문자열 입력 : ");
		str = scan.nextLine();//IT CookBook Java Programming

		strRep = str.replace(" ", "$");
		strSub = str.substring(3, 8);
		StrAry = str.split(" ");

		System.out.println("입력 문자열 : " + str);
		System.out.println("바꾼 문자열 : " + strRep);
		System.out.println("일부 문자열 : " + strSub);
		for (int i = 0; i < StrAry.length; i++) {
			System.out.println("분리한 문자열 " + i + " : " + StrAry[i]);
		}
		scan.close();
	}

}
