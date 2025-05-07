//문자 스트림을 이용하여 텍스트 파일을 복사하는 프로그램을 작성하라
package day16;

import java.io.*;

public class Ch08_09 {

	public static void main(String[] args) {
		//File 탐색기와 같은 역할을 한다(입,출력 X)
		File src = new File("src\\day16\\aaaa.txt");//소스파일
		File dst = new File("src\\day16\\test.txt");//목적파일
		FileReader fr = null;//입력 1차스트림
		FileWriter fw = null;//출력 1차스트림
		BufferedReader in = null;//입력 2차스트림
		BufferedWriter out = null;//출력 2차스티림
		//1차 스트림 : 장치(device)에 바로 연결되는 스트림
		//2차 스트림 : 필터(filter)기능을 하는 스트림들을 칭함	/ 혼자서 사용 못함
		//2차 스트림(1차 스트림)
		int c;
		try {
			fr = new FileReader(src);
			fw = new FileWriter(dst);
			in = new BufferedReader(fr);
			out = new BufferedWriter(fw);
			while((c=in.read()) != -1) {
				out.write((char)c);
				System.out.print((char) c);
			}
			in.close();
			out.close();
			fr.close();
			fw.close();
		}catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
