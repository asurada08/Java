package day04;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

import java.util.Scanner;

public class Ch05_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("종료 : -1");
	A:	while (true) {
			System.out.print("출생년도를 입력하세요 : ");
			int year = scan.nextInt();
			
			//year = Interger.parseInt(s.readLine());
			//자 축 인 묘 진 사 오 미 신 유 술 해
			//4  5  6  7  8  9 10 11 0  1  2  3 
			String str = "";
			switch (year % 12) {
			case 0:
				str = "원숭이띠";
				break;
			case 1:
				str = "닭띠";
				break;
			case 2:
				str = "개띠";
				break;
			case 3:
				str = "돼지띠";
				break;
			case 4:
				str = "쥐띠";
				break;
			case 5:
				str = "소띠";
				break;
			case 6:
				str = "호랑이띠";
				break;
			case 7:
				str = "토끼띠";
				break;
			case 8:
				str = "용띠";
				break;
			case 9:
				str = "뱀띠";
				break;
			case 10:
				str = "말띠";
				break;
			case 11:
				str = "양띠";
				break;
			case -1:
				System.out.println("종료");
				break A;
			}
			//s.skip(2);
			System.out.println(str);
			scan.close();
		}
	
	}

}
//버퍼 사용하기
//"대"라는 문자를 BufferedReader를 통해 입력받을 경우 
//2바이트로 구성되어 있기 때문에 1바이트씩 분리한다
//InputStreamReader가 바이트스트림을 문자스트림으로 변환시켜주는 역할을 하게된다
//new 를 통해 heap 메모리 영역을 할당 받아 올라간다
//이경우 s는 reference type변수 == 객체 이다
//readLine()는? BufferedReader의 메소드로 한줄씩 입력 받는다(엔터 전까지)
//숫자 입력은 못받는다. 오직 문자열만 입력 받는다.
//read()메소드는 입력받을 경우 [홍길동]은 5번 정도 입력받아야 한다.