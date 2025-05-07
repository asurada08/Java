package day06;

import java.util.Scanner;

public class Test14_0409 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money, c500, c100, c50, c10;
		A:while (true) {
			System.out.print("동전 교환 확인용 : ");
			money = scan.nextInt();
			if(money==0) {
				System.out.println("종료");
				break A;
			}
			System.out.printf("금액은 %d원 입니다\n", money);
			c500 = money / 500;
			System.out.printf("500원은 %d개 입니다\n", c500);
			money = money % 500;
			c100 = money / 100;
			System.out.printf("100원은 %d개 입니다\n", c100);
			money = money % 100;
			c50 = money / 50;
			System.out.printf("50원은 %d개 입니다\n", c50);
			money = money % 50;
			c10 = money / 10;
			System.out.printf("10원은 %d개 입니다\n", c10);
			money = money % 10;
			System.out.printf("교환할 수 없는 남은 금액은 %d원 입니다\n", money);
		}
		scan.close();
	}

}
