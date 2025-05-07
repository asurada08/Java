//바이트 스트림을 이용하여 바이너리 파일을 복사하는 프로그램을 작성하라
package day16;

import java.io.*;

public class Ch08_10 {
	public static void main(String[] args) {
		File src = new File("src\\day16\\aaaa.txt");//소스파일
		File dst = new File("src\\day16\\test.txt");//목적파일
		FileInputStream fi = null;
		FileOutputStream fo = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		int c;
		try {
			fi = new FileInputStream(src);
			fo = new FileOutputStream(dst);
			in = new BufferedInputStream(fi);
			out = new BufferedOutputStream(fo);
			while ((c=in.read()) != -1) {
				out.write((char)c);
				System.out.print((char)c);
			}
			System.out.println("하나의 파일을 복사 했습니다");
			in.close();
			out.close();
			fi.close();
			fo.close();
		}catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
