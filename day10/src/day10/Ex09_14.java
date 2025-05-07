package day10;

import java.util.Scanner;

public class Ex09_14 {
	//메소드 정의 = 선언부 + 구현부
	//선언부
	static int calc(int v1, int v2, int op) {
		int result;
		switch (op) {
		case 1:
			result = v1 + v2;
			break;
		case 2:
			result = v1 - v2;
			break;
		case 3:
			result = v1 * v2;
			break;
		case 4:
			result = v1 / v2;
			break;
		default:
			result = 0;
		}//여기까지 구현부 : {}안에 내용
		return result;
	};

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int res;
		int oper, num1, num2;

		System.out.print("계산 입력(1:+, 2:-, 3:*, 4:/) : ");
		oper = scan.nextInt();
		System.out.print("첫번째 숫자 : ");
		num1 = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		num2 = scan.nextInt();

		res = calc(num1, num2, oper);//호출 후 제자리로 돌아와야함
		System.out.printf("계산 결과 : %d", res);
		scan.close();
	}

}
