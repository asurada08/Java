package day05;

import java.util.Scanner;
public class Ch07_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu;
		String str = "";
		do {
			System.out.printf("손님 주문하시겠습니까?\n");
			System.out.printf("1.카페라떼 2.카푸치노 3.아메리카노 4.그만시킬래요 =>");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				str = "#카페라떼를 주문하셨습니다";
				break;
			case 2:
				str = "#카푸치노를 주문하셨습니다";
				break;
			case 3:
				str = "#아메리카노를 주문하셨습니다";
				break;
			case 4:
				str = "진동벨로 알려드릴께요";
				break;
			default:
				str = "잘못 주문 하셨습니다";					
			}
			System.out.println(str);
		}while (menu != 4);
		
		/*menu = 0; 
		System.out.printf("손님 주문하시겠습니까?\n");
		System.out.printf("1.카페라떼 2.카푸치노 3.아메리카노 4.그만시킬래요 =>");
		menu = scan.nextInt();
		while (menu != 4) {
			switch (menu) {
			case 1:
				str = "#카페라떼를 주문하셨습니다";
				break;
			case 2:
				str = "#카푸치노를 주문하셨습니다";
				break;
			case 3:
				str = "#아메리카노를 주문하셨습니다";
				break;
			case 4:
				str = "진동벨로 알려드릴께요";
				break;
			default:
				str = "잘못 주문 하셨습니다";					
			}
			System.out.println(str);
		}*/
		scan.close();
	}

}
