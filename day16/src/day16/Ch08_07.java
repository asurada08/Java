package day16;

import java.io.*;
//5바이트가 넘어가면 5바이트 까지는 출력하고 남은 내용은 버퍼에 저장됨
public class Ch08_07 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
		//5바이트 크기의 버퍼 설정, System.out 표준 스트림에 출력
		try {
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);//버퍼가 다 찰 때 문자가 화면에 출력(버퍼 크기만큼 autoflush함)
			}
			out.flush();//버퍼에 남아 있던 문자 출력
			if(in != null) {
				in.close();
				out.close();
			}//메모리 반환(자원 반납)
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
/*
버퍼 입출력 스트림과 버퍼 입출력의 특징
버퍼 스트림 (버퍼를 가진 스트림)
 : 입출력 데이터를 일시적으로 저장하는 버퍼를 이용하여 입출력 효율 개선
버퍼 입출력의 목적 : 입출력 시 운영체제의 API 호출 횟수를 줄여 입출력 성능 개선
	- 출력시 여러 번 출력되는 데이터를 버퍼에 모아두고 한 번에 장치로 출력
	- 입력시 입력 데이터를 버퍼에 모아두고 한번에 프로그램에게 전달
버퍼 스트림의 종류
바이트 버퍼 스트림(BufferedInputStream와 BufferedOutputStream) (1byte로 처리?)
 : 바이트 단위의 바이너리 데이터를 처리하는 버퍼 스트림
문자 버퍼 스트림 (BufferedReader와 BufferedWriter) (2byte로 처리?)
 : 유니코드의 문자 데이터만 처리하는 버퍼 스트림
*/

