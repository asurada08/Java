package day05;

import java.io.IOException;
import java.util.Scanner;

public class Ch07_02 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int a, b;
		char ch;
		
		while (true) {
			System.out.printf("계산할 첫번째 수 입력 : ");
			a = scan.nextInt();
			System.out.printf("계산할 두번째 수 입력 : ");
			b = scan.nextInt();
			System.out.printf("계산할 연산자 입력 : ");
			ch = (char)System.in.read();
			
			switch(ch) {
			case '+':
				System.out.printf("%d + %d = %d\n", a, b, a+b);
				break;
			case '-':
				System.out.printf("%d - %d = %d\n", a, b, a-b);
				break;
			case '*':
				System.out.printf("%d * %d = %d\n", a, b, a*b);
				break;
			case '/':
				System.out.printf("%d / %d = %d\n", a, b, a/b);
				break;
			case '%':
				System.out.printf("%d %% %d = %d\n", a, b, a%b);
				break;
			default:
				System.out.printf("연산자를 잘못 입력하였습니다\n");
			}
			scan.close();
			
		}

	}

}
