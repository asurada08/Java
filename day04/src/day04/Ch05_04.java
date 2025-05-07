package day04;

import java.io.BufferedReader;
import java.io.IOException;
//import java.util.Scanner;
import java.io.InputStreamReader;

public class Ch05_04 {

	public static void main(String[] args) throws IOException {
		/*Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("1~4 중 하나 입력하세요 : ");
			int a = scan.nextInt();
			if(a==-1) {
				System.out.println("종료");
				break;
			}
			switch (a) {
			case 1:
				System.out.println("1을 선택");
				break;
			case 2:
				System.out.println("2를 선택");
				break;
			case 3:
				System.out.println("3을 선택");
				break;
			case 4:
				System.out.println("4를 선택");
				break;
			default:
				System.out.println("정확한 값을 입력하세요");
			}
		}
		scan.close();
	}

}*/
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		int a;
		System.out.println("종료 : -1");
	A:	while (true) {
			System.out.print("1~4 중 하나 입력하세요 : ");
			a = s.read();//'0' => 48 문자를 읽어서 정수형(아스키코드값)//1
			System.out.println("변경 전 : "+a);
			a = a-'0';//49-48 => 1
			System.out.println("변경 후 : "+a);
						
			switch (a) {
			case 1:
				System.out.println("1을 선택");
				break;
			case 2:
				System.out.println("2를 선택");
				break;
			case 3:
				System.out.println("3을 선택");
				break;
			case 4:
				System.out.println("4를 선택");
				break;
			case -3:
				break A;
			default:
				System.out.println("정확한 값을 입력하세요");
			}
			s.skip(2);
		}//while end
	System.out.println("종료");
	}

}
