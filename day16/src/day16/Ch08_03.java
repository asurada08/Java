package day16;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ch08_03 {

	public static void main(String[] args) {
		// FileInputStream in = null; 바이트로 읽는놈
		FileReader in = null;
		try {
			// 파일로부터 문자 입력 스트림 생성
			in = new FileReader("src\\day16\\aaa.txt");
			// in = new FileInputStream("src\\day16\\aaa.txt");
			int c;
			while ((c = in.read()) != -1) {// 한 문자씩 읽는다
				System.out.print((char) c);
			}
			in.close();
		} catch (IOException e) {
			System.out.println(e.getMessage() + " 입출력 오류");
		}

	}

}
/*
문자 스트림 : 유니 코드로 된 문자를 입출력 하는 스트림
	- 문자로 표현되지 않는 데이터는 다루지 않음
	- 문자 스트림은 이미지, 동영상과 같은 바이너리 데이터는 입출력 할 수 없음 
	- 문자 스트림은 문자 데이터만 입출력 가능
문자 스트림을 다루는 클래스
 Reader/Writer (java.io 패키지에 포함)
	- 추상 클래스. 문자 스트림을 다루는 모든 클래스의 슈퍼 클래스
 InputStreamReader/OutputStreamWriter
	- 바이트 스트림과 문자 스트림을 연결시켜주는 다리 역할 / 지정된 문자집합 이용
	- InputStreamReader : 바이트를 읽어 문자로 인코딩
	- OutputStreamWriter : 문자를 바이트로 디코딩하여 출력
 FileReader/FileWriter
 	- 텍스트 파일에서 문자 데이터 입출력
*/