package day04;

import java.util.Scanner;

public class Ch05_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("종료=-1");
		
		while (true) {
			System.out.print("숫자를 입력해보세요 비교해 드릴께요 : ");
			int a = scan.nextInt();
			if (a > 50) {
				if (a < 100) {
					System.out.println("50보단 큰데 100보다 언더~");
				} else {
					System.out.println("100보다 업");
				}
			} else if(a==-1) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("50보다 언더");
			}
		}
		scan.close();
	}
}
