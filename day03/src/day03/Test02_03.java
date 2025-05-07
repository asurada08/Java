package day03;

import java.util.Scanner;

public class Test02_03 {

	public static void main(String[] args) {
		int month;
		String str = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		while (scan.hasNext()) {
			month = scan.nextInt();
			if(month >= 13 || month <= 0) {
				System.out.println("그만...");
				break;
			}
			switch (month) {
			case 12:
			case 1:
			case 2:
				//System.out.println(month + "월은 겨울 입니다.");
				str = month + "월은 겨울 입니다.";
				break;
			case 3:
			case 4:
			case 5:
				//System.out.println(month + "월은 봄 입니다.");
				str = month + "월은 봄 입니다.";
				break;
			case 6:
			case 7:
			case 8:
				//System.out.println(month + "월은 여름 입니다.");
				str = month + "월은 여름 입니다.";
				break;
			case 9:
			case 10:
			case 11:
				//System.out.println(month + "월은 가을 입니다.");
				str = month + "월은 가을 입니다.";
				break;
			}
			System.out.println(str);
			System.out.print("월을 입력하세요 : ");
		}
		scan.close();
	}
}
