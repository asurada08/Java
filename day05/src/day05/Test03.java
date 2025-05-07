package day05;

//키보드로 입력된 문자를 다시 거꾸로 출력하는 프로그램을 for문을 이용해 작성하시오.
//hint str="abc"//str.length(); 문자열의 길이
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력된 문자열 : ");
		String str = scan.next();
		String rev = "";
		scan.close();
		int i;
		for (i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("출력된 문자열 : " + rev);
	}

}
