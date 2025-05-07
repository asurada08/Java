//사용자로 부터 임의의 정수 3개를 입력 받아 작은수에서 큰수 순으로 출력
//입력 16 8 21
//출력 8 16 21
package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Scanner;
public class Test15_0409 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, num3;
		System.out.println("정수 3개 다 0 입력시 종료");
		while (true) {
			System.out.print("첫번째 정수 입력 : ");
			num1 = Integer.parseInt(bf.readLine());
			System.out.print("두번째 정수 입력 : ");
			num2 = Integer.parseInt(bf.readLine());
			System.out.print("세번째 정수 입력 : ");
			num3 = Integer.parseInt(bf.readLine());
			if(num1==0 && num2 ==0 && num3==0) {
				System.out.println("종료");
				break;
			}
			if (num1 > num2 && num2 > num3) {
				System.out.printf("결과 : %d %d %d\n", num3, num2, num1);
			} else if (num2 > num1 && num1 > num3) {
				System.out.printf("결과 : %d %d %d\n", num3, num1, num2);
			} else if (num1 > num3 && num3 > num2) {
				System.out.printf("결과 : %d %d %d\n", num2, num3, num1);
			} else if (num3 > num1 && num1 > num2) {
				System.out.printf("결과 : %d %d %d\n", num2, num1, num3);
			} else if (num3 > num2 && num2 > num1) {
				System.out.printf("결과 : %d %d %d\n", num1, num2, num3);
			} else if (num2 > num3 && num3 > num1) {
				System.out.printf("결과 : %d %d %d\n", num1, num3, num2);
			} else {
				System.out.printf("3개중 2개 이상 같은 숫자\n");
			}
		}
	}
}
