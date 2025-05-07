package day03;

import java.util.Scanner;

public class Ex02_13 {

	public static void main(String[] args) {
		char grade;
		Scanner scan = new Scanner(System.in);
		System.out.print("학점을 입력하세요 : ");
		while (scan.hasNext()) {
			grade = scan.next().toUpperCase().charAt(0);
			// scan.next() "a","A" 입력 / .toUpperCase() "A" 변환 / .charAt(0) "A" -> 'A'변환
			switch (grade) {
			case 'A':
			case 'B':
				System.out.println("참 잘하였습니다.");
				break;
			case 'C':
			case 'D':
				System.out.println("조금더 노력하세요.");
				break;
			case 'F':
				System.out.println("다음학기에 다시만나요.");
				break;
			default:
				System.out.println("잘못된 학점입니다.");
			}
			System.out.print("학점을 입력하세요 : ");
		}
		scan.close();
	}

}
