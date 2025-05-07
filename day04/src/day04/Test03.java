package day04;

//4로 나눠서 떨어지고 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어지는 경우==윤년
//hint) year%4==0 && year%100!=0 ||year%400==0
//연도를 입력하세요 : 20XX
//윤년입니다 or 평년입니다
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("종료 : -1");
		while (true) {
			System.out.print("연도를 입력하세요 : ");
			int year = scan.nextInt();

			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("윤년입니다");
			} else if (year == -1) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("평년입니다");
			}
		}
		scan.close();
	}

}
