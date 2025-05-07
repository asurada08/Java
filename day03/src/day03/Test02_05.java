package day03;

import java.util.Scanner;

public class Test02_05 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		int korean, math, english, total, avg;
		System.out.print("국어점수 : ");
		korean = scan.nextInt();
		System.out.print("수학점수 : ");
		math = scan.nextInt();
		System.out.print("영어점수 : ");
		english = scan.nextInt();
		System.out.print("총    점 : ");
		total = korean + math + english;
		System.out.println(total);
		System.out.print("평    균 : ");
		avg = total / 3;
		System.out.println(avg);
		scan.close();*/
		Scanner scan = new Scanner(System.in);
		int korean, math, english, total, avg;
		System.out.print("국어점수 : ");
		korean = Integer.parseInt(scan.nextLine());
		System.out.print("수학점수 : ");
		math = Integer.parseInt(scan.nextLine());
		System.out.print("영어점수 : ");
		english = Integer.parseInt(scan.nextLine());
		System.out.print("총    점 : ");
		total = korean + math + english;
		System.out.println(total);
		System.out.print("평    균 : ");
		avg = total / 3;
		System.out.println(avg);
		scan.close();
	}

}