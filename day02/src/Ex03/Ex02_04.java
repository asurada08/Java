package Ex03;

import java.util.Scanner;
public class Ex02_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요");
		 * System.out.println("당신의 나이는 " + scan.nextInt() + "살입니다.");
		 * System.out.println("당신의 체중은 " + scan.nextDouble() + "kg입니다.");
		 * System.out.println("당신의 신장은 " + scan.nextDouble() + "cm입니다.");
		 */
		System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요");
		System.out.print("나이 : ");
		int a = scan.nextInt();
		System.out.print("체중 : ");
		double b = scan.nextDouble();
		System.out.print("신장 : ");
		double c = scan.nextDouble();
		
		System.out.println("당신의 나이는 "+ a +" 살입니다");
		System.out.println("당신의 체중은 "+ b +" kg입니다");
		System.out.println("당신의 신장은 "+ c +" cm입니다");
		
		scan.close();
	}

}