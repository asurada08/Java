package day03;

import java.util.Scanner;

public class Ex02_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("점수를 입력하시오 : ");
		int score = scan.nextInt();
		String str;

		if (score >= 80) {
			str = "축하합니다! 합격입니다.";
		} else {
			str = "다음 기회에...";
		}
		System.out.println(str);

		str = (score >= 80) ? "축하합니다! 합격입니다." : "다음 기회에...";
		System.out.println(str);
		scan.close();
	}

}