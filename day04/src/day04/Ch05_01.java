package day04;

import java.util.Scanner;

public class Ch05_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		
		/*System.out.print("정수를 입력하세요 : ");
		a = scan.nextInt();
		
		if(a%2==0) {
			System.out.println("짝수를 입력하셨네요");
		}else {
			System.out.println("홀수를 입력하셨네요");
		}*/
		System.out.println("종료 : -1");
		while (true) {
			System.out.print("정수를 입력하세요 : ");
			a = scan.nextInt();
			
			if(a%2==0) {
				System.out.println("짝수를 입력하셨네여");
			}else if (a==-1) {
				break;
			}else {
				System.out.println("홀수를 입력하셨네요");
			}
		}
		scan.close();
	}

}
