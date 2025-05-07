package Ex03;

import java.io.*;

public class Ex02_03 {
	public static void main(String[] args) {
		// 입력스트림 객체 생성 2byte <- 1byte
		InputStreamReader rd = new InputStreamReader(System.in);
		// 표준입력 장치 : System.in (키보드) 1byte
		// 표준출력 장치 : System.out (화면) 1byte
		try {
			while (true) {
				int a = rd.read();//정수로 읽어옴
				if (a == -1) {// ctrl-z가 입력되면 read()는 -1을 리턴 ctrl-z 파일의 끝 EOF==-1
					break;
				}
				System.out.println((char) a);// 입력된 문자 출력
				//int c = a/0;//강제 에러 발생하려고 넣음
			}
		} catch (IOException e) {//IOException e = new IOException() == (IOException e)
			System.out.println("입력 에러 발생" + e.getStackTrace());
			// 에러를 검사해서 에러가 없으면 try문장 처리 catch문을 처리하지 않고 끝남
			// 에러가 있으면 try문장 처리 하지 않고 catch문을 처리함
		} finally {
			System.out.println("에러와 무관하게 무조건 수행 주로 장치를 닫을때 사용");
		}
	}
}