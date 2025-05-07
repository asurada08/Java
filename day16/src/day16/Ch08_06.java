package day16;

import java.io.*;

public class Ch08_06 {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		FileWriter fout = null;
		
		int c;
		try {
			fout = new FileWriter("src\\day16\\test.txt", true);
			//파일명, 추가설정(true, false) / 추가설정 생략하면 false로 기본설정
			//true : 추가해서 저장 / false : 덮어쓰기
			while((c = in.read()) != -1) {
				fout.write(c);
			}
			in.close();
			fout.close();
		}catch(IOException e){
			System.out.println("입출력 오류");
		}

	}

}
/*
FileWriter 사용 예
c:\test.txt 파일에 문자 출력 스트림을 생성하는 코드
	- FileWriter fout = new FileWriter("c:\\tmp\\test.txt");
파일에 문자 출력
	- FileWriter fout = new FileWriter("c:\\tmp\\test.txt");
	- fout.write(‘A’); // 문자 ‘A’ 출력
	- fout.close();
*/
