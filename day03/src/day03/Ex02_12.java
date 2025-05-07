package day03;

import java.util.Scanner;

public class Ex02_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char grade = 0;
		System.out.print("점수를 입력하세요 : ");
		while (scan.hasNext()) {
			int score = scan.nextInt();
			if (score >= 90 && score <= 100) {
				grade = 'A';
			} else if (score >= 80 && score < 90) {
				grade = 'B';
			} else if (score >= 70 && score < 80) {
				grade = 'C';
			} else if (score >= 60 && score < 70) {
				grade = 'D';
			} else if (score < 60 && score > 0) {
				grade = 'F';
			} else if (score > 100) {
				System.out.println("정확한 점수를 입력하세요");
				grade = 'Z';
			} else if (score < 0) {
				System.out.println("종료합니다");
				break;
			}
			System.out.println("학점은 " + grade + "입니다.");
			System.out.print("점수를 입력하세요 : ");
		}
		System.out.println("종료합니다");
		scan.close();

	}

}
