package day04;

//키보드로 입력받은 주민번호에서 문자열을 '-'으로 분리하여 주민번호 앞자리만 출력하시오
//구분 문자를 설정 할 때에는 Scanner 클래스의 useDelimiter()를 사용하세요
//출력형식
// 주민번호 입력[-로 구분]
// 240405-1111111
// 주민번호 앞자리는 240405 입니다
// 주민번호 뒷자리는 1111111 입니다
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//System.out.print("주민번호를 입력하세요 : ");
		//scan = new Scanner(scan.next()).useDelimiter("\\s*-\\s*");
		
		Scanner scan = new Scanner(System.in).useDelimiter("\\s|-");
		System.out.print("주민번호를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.printf("앞자리 : %d\n", num1);
		System.out.printf("뒷자리 : %d", num2);
		scan.close();
	}
}
//useDelimiter()
/*
 * String input = "1 fish 2 fish red fish blue fish"; Scanner s = new
 * Scanner(input). useDelimiter("\\s*fish\\s*");
 * System.out.println(s.nextInt()); System.out.println(s.nextInt());
 * System.out.println(s.next()); System.out.println(s.next()); s.close();
 */