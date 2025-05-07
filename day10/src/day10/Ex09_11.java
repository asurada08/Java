package day10;

import java.util.Scanner;

public class Ex09_11 {
	static void coffee_machine(int button) {
		System.out.println("\n#1. (자동으로) 뜨거운물을 준비한다");
		System.out.println("#2. (자동으로) 종이컵을 준비한다");
		switch (button) {
		case 1:
			System.out.println("#3. (자동으로) 보통커피를 탄다");
			break;
		case 2:
			System.out.println("#3. (자동으로) 설탕커피를 탄다");
			break;
		case 3:
			System.out.println("#3. (자동으로) 블랙커피를 탄다");
			break;
		default:
			System.out.println("#3. (자동으로) 랜덤입니다");
			break;
		}
		System.out.println("#4. (자동으로) 물을 붓는다");
		System.out.println("#5. (자동으로) 스푼으로 저어서 녹인다\n");

		//return 0;
	}//이거 자체가 return이다

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int coffee;
		//int ret;
		System.out.print("어떤 커피를 드릴까요? (1:보통, 2:설탕, 3:블랙) ");
		coffee = scan.nextInt();
		//ret = coffee_machine(coffee);// coffee_machine 메소드 호출
		coffee_machine(coffee);
		System.out.println("손님~ 커피 여기 있습니다\n");
		scan.close();
	}

}
