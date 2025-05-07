package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Scanner;

public class Test11_0409 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("종료 : 0");
		/*Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("정수를 입력하세요 : ");
			int a = scan.nextInt();
			if(a==0) {
				System.out.println("종료");
				break;
			}
			if (a % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		}
		scan.close();*/
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print("정수를 입력하세요 : ");
			int a = Integer.parseInt(bf.readLine());
			if (a == 0) {
				System.out.println("종료");
				break;
			}
			if (a % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		}
	}
}
