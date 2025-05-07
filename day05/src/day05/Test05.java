//입력한 문자열의 대문자와 소문자, 숫자, 공백이 각각 몇 개인지 세는 프로그램을 작성하시오
//특수기호 등은 무자는 무시한다
package day05;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문장을 입력하세요 : ");
		String test = scan.nextLine();
		int lag = 0;
		int sma = 0;
		int num = 0;
		int space = 0;
		int i;
		for (i = test.length()-1;i>=0;i--) {
			if(test.charAt(i)==' ') {
				space++;
			}else if('a' <= test.charAt(i) && 'z'>=test.charAt(i)) {
				sma++;
			}else if('A' <= test.charAt(i) && 'Z'>=test.charAt(i)) {
				lag++;
			}else if (0 <=(int)test.charAt(i)-48 && 9 >=(int)test.charAt(i)-48) {
				num++;
			}
		}
		System.out.println("공백 "+space+" "+"소문자 "+sma+" "+"대문자 "+lag +" "+"숫자 "+ num);
		scan.close();
	}

}
