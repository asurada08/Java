package day03;

import java.util.Scanner;

public class Ex02_05 {
	//정수를 입력받고 입력 받은 정수의 초를 몇 시간, 몇 분, 몇 초인가를	구하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		int time, second, minute, hour;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");//시, 분, 초로 변활될 정수 입력
		
		time = scan.nextInt();
		second = time % 60; //60으로 나눈 나머지는 초를 의미
		minute = (time / 60) % 60;//60으로 나눈 몫을 다시 60으로 나눈 나머지는 분을 의미
		hour = (time / 60) / 60;//60으로 나눈 몱을 다시 60으로 나눈 몫은 시간을 의미
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.print(second + "초입니다. ");
		
		scan.close();
	}

}
//괄호 > 단항 > 산술 > 비교 > 논리 > 대입 연산자 우선순위
//산술 > 비트 > 시프트 > 비교 > 논리 > 대입