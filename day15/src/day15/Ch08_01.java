package day15;

import java.io.*;

public class Ch08_01 {
	public static void main(String[] args) {
		FileInputStream in = null;
		try {
			in = new FileInputStream("src/junit/Calculator.java");
			
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
		}catch (IOException e) {
			System.out.println(e.getMessage()+"입출력 오류");
		}

	}

}
/*
자바의 스트림
자바의 스트림은 입출력 장치와 프로그램을 연결하며, 
이들 사이의 데이타 흐름을 처리하는 소프트웨어 모듈
입력 스트림 : 
	입력 장치로부터 자바 프로그램으로 전달되는 데이터의 흐름 혹은 데이터 전송 소프트웨어 모듈
출력 스트림 : 
	자바 프로그램에서 출력 장치로 보내는 데이터의 흐름 혹은 데이터 전송 소프트웨어 모듈
입출력 스트림 기본 단위 : 바이트
자바 입출력 스트림 특징 : 단방향 스트림, 선입선출 구조

스트림은 연결될 수 있다
표준 입력 스트림 System.in에 InputStreamReader 스트림을 연결하는 사례
	InputStreamReader rd = new InputStreamReader(System.in);
	int c = rd.read(); // 키보드에서 문자 읽음
*/