package day03;

import java.util.Scanner;

public class Ex02_14 {
	//switch문 : 다양한 처리문을 두고 조건값에 의해 하나의 처리문이나 
	//			 여러개의 처리문을 한번에 수행하는데 유용한 분기(비교)문
	//조건 : 정수형(byte, short, char,int), jdk 1.7부터 String형을 허용한다.
	//long, float, double, boolean은 사용불가
	//case : 수식 올 수 없고, 구간 올 수 없다.
	//byte, short, char,int, String만 비교(O)

	public static void main(String[] args) {
		char grade;
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		while (scan.hasNext()) {
			int score = scan.nextInt();
			switch (score / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
			}
			System.out.println("학점은 " + grade + " 입니다.");
			System.out.print("점수를 입력하세요 : ");
		}
		scan.close();
	}

}
