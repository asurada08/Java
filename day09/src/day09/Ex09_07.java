package day09;

import java.util.Scanner;

public class Ex09_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str, result;
		System.out.print("문자열 입력 : ");
		str = scan.nextLine();
		//str = "   한글   ABC   efgh   ";
		result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				result += str.substring(i, i + 1);
			}
		}
		System.out.println("원문자열 : [" + str + "]");
		System.out.println("공백제거 : [" + result + "]");
		scan.close();
	}
}