package day16;

import java.io.*;

public class Ch08_04 {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src\\day16\\aaa.txt");
			in = new InputStreamReader(fin, "UTF-8");

			int c;
			System.out.println("인코딩 문자 집합은 : " + in.getEncoding());
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
/*
문자 집합과 InputStreamReader로 텍스트 파일 읽기
FileInputStream fin = new FileInputStream("c:\\tmp\\hangul.txt");
InputStreamReader in = new InputStreamReader(fin, "MS949"); 
MS949 한글 완성형 확장형 문자 집합
UTF-8로 바꿔도 됨
*/