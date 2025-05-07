package day04;

import java.util.Scanner;
//기본형에서 : == 값 비교
//객체  에서 : == 주소 비교(값 비교 X) / 객체.equals("객체") (값 비교 X)
//String에서 : == 주소 비교(값 비교 X) / 스트링.equals("스트링") 값 비교
//Object에 있는 equals()를 값 비교로 overriding(재정의) 했다.
public class Test02 {
//가위=0 바위=1 보=2 게임
	public static void main(String[] args) {
		//가위, 바위 -> 바위
		//가위, 보 ->보
		//가위, 가위 -> 무승부
		Scanner scan = new Scanner(System.in);
		System.out.print("p1 : ");
		String p1 = scan.nextLine();
		
		System.out.print("p2 : ");
		String p2 = scan.nextLine();
		
		if (p1.equals("가위")) {
			if(p2.equals("바위")) {
				System.out.println("p2 승");
			}else if(p2.equals("보")) {
				System.out.println("p1 승");
			}else {
				System.out.println("다시");
			}
		}
		if (p1.equals("바위")) {
			if(p2.equals("보")) {
				System.out.println("p2 승");
			}else if(p2.equals("가위")) {
				System.out.println("p1 승");
			}else {
				System.out.println("다시");
			}
		}
		if (p1.equals("보")) {
			if(p2.equals("가위")) {
				System.out.println("p2 승");
			}else if(p2.equals("바위")) {
				System.out.println("p1 승");
			}else {
				System.out.println("다시");
			}
		}
		scan.close();
	}

}
