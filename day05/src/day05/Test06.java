//0~9중에서 입력한 수자만큼 별표를 출력하는 프로그램
//5914를 입력하면 각줄에 5개 9개 1개 4개 별을 표시하시오
//숫자 입력 : 5914
//*****
//*********
//*
//****
package day05;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 여러개 입력 : ");
		String num = scan.nextLine();
		
		int i, j, star;
		for(i=0; i<num.length();) {
			star = Integer.parseInt(String.valueOf(num.charAt(i)));
			for (j=0;j<star;j++) {
				System.out.print("*");
			}
			System.out.println("");
			i++;
		}
	}

}
