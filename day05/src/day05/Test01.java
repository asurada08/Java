//if문을 활용하여 두수의 +, -, *, /, % 연산을 수행하는 프로그램
//출력
//첫번째 수를 입력하세요 : 5
//계산할 연산자를 입력하세요 : +
//두번째 수를 입력하세요 : 7
//5 + 7 = 12입니다
//반복으로
package day05;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, result = 0;
		String x;

		for (;;) {
			System.out.print("첫번째 수를 입력하세요 : ");
			num1 = scan.nextInt();
			System.out.print("계산할 연산자를 입력하세요 : ");
			x = scan.next();
			System.out.print("두번째 수를 입력하세요 : ");
			num2 = scan.nextInt();

			if (x.equals("+")) {
				result = num1 + num2;				
			} else if (x.equals("-")) {
				result = num1 - num2;				
			} else if (x.equals("*")) {
				result = num1 * num2;				
			} else if (x.equals("/")) {
				result = num1 / num2;
			} else if (x.equals("%")) {
			}
			System.out.printf("%d %s %d = %d\n", num1, x, num2, result);
			scan.close();
		}

		/*while (true) {
			System.out.print("첫번째 수를 입력하세요 : ");
			num1 = scan.nextInt();
			System.out.print("계산할 연산자를 입력하세요 : ");
			x = scan.next();
			System.out.print("두번째 수를 입력하세요 : ");
			num2 = scan.nextInt();
			
			switch (x) {
			case "+":
				result = num1 + num2;
			case "-":
				result = num1 - num2;
			case "*":
				result = num1 * num2;
			case "/":
				result = num1 / num2;
			case "%":
				result = num1 % num2;
			}
			System.out.printf("%d %s %d = %d", num1, x, num2, result);
		}*/
		
	}

}
