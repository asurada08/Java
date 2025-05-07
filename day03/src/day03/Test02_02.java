package day03;

import java.util.Scanner;

public class Test02_02 {

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
			if (month == 12 || month == 1 || month == 2) {
				//System.out.println(month + "월은 겨울 입니다.");
				str = month + "월은 겨울입니다";
			} else if (month == 3 || month == 4 || month == 5) {
				//System.out.println(month + "월은 봄 입니다.");
				str = month + "월은 봄입니다";
			} else if (month == 6 || month == 7 || month == 8) {
				//System.out.println(month + "월은 여름 입니다.");
				str = month + "월은 여름입니다";
			} else if (month == 9 || month == 10 || month == 11) {
				//System.out.println(month + "월은 가을 입니다.");
				str = month + "월은 가을입니다";
			} else {
				str = month + "월은 없습니다.";
			}
			System.out.println(str);
			System.out.print("월을 입력하세요 : ");
		}
		scan.close();
	}

}