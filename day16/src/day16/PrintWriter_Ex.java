package day16;

import java.io.*;

public class PrintWriter_Ex {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintWriter pw = null;
		
		try {
			fos = new FileOutputStream("src\\day16\\testtest.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos, true);

			pw.println("즐거운 귀가 시간입니다");
			pw.println("포근한 저녁입니다");
			pw.println(1000000000);
			pw.println(true);
			
			System.out.println("즐거운 귀가 시간입니다");
			System.out.println("포근한 저녁입니다");
			System.out.println(1000000000);
			System.out.println(true);
		}catch (Exception e) {
			e.getStackTrace();
		}finally {
			//자원 반납
			try {
				if(fos != null) fos.close();
				if(bos != null) bos.close();
				if(pw != null) pw.close();
			}catch (Exception e2) {
				e2.getStackTrace();
			}
		}//finally
	}
}
/*
PrintWriter
PrintWriter는 다른 스트림과 다르게 바이트 출력 스트림과 문자 출력 스트림을
가지고 객체를 생성할 수 있는 클래스이다
자동 플러쉬 기능(auto flush)을 가지고 있다
PrintWriter 클래스의 생성자는 FileNotFoundException 예외를 
발생하기 때문에 반드시 예외처리를 해야한다.
*/