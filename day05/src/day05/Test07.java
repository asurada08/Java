//인원수 국어 영어 수학 점수를 입력받아 총점 평균을 구하시오
package day05;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, i;
		int kor = 0, math = 0, eng = 0, sum = 0, avg;
		System.out.print("인원수를 입력하세요 : ");
		num = scan.nextInt();
		for (i = 1; i <= num; i++) {
			System.out.print("국어점수를 입력하세요 : ");
			kor = scan.nextInt();
			
			System.out.print("수학점수를 입력하세요 : ");
			math = scan.nextInt();
			
			System.out.print("영어점수를 입력하세요 : ");
			eng = scan.nextInt();
			
			System.out.println("");
			sum += kor + math + eng;
		}
		avg = sum / (num * 3);
		System.out.println("총점 : " + sum + "\n평균 : " + avg);
	}

}
