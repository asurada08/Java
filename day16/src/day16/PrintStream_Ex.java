package day16;

import java.io.*;

public class PrintStream_Ex {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			fos = new FileOutputStream("src\\day16\\test.txt");
			bos = new BufferedOutputStream(fos);
			//(OutputStream out, boolean autoFlush)
			ps = new PrintStream(bos, true);
			ps.println("홍길동");
			ps.println(2023);
			ps.println(true);
			ps.println("a");
		}catch (Exception e) {
			e.getStackTrace();
		}finally {
			//자원 반납
			try {
				if(fos != null) fos.close();
				if(bos != null) bos.close();
				if(ps != null) ps.close();
			}catch (Exception e2) {
				e2.getStackTrace();
			}
		}//finally
	}
}
/*
PrintStream
모든 자료형을 출력 할 수 있는 print(), println() 메소드가 오버로딩 되어있다
프로그램이 시작되면 장치와 연결된 ㅜㅊㄹ력 스트림인 System.in, System.out, System.err
객체가 PrintStream 객체이다
다른 스트림과는 다르게 플러쉬 기능을 자동으로 처리 할 수 있는 생성자를 가지고 있다
모든 메소드는 예외처리를 하지 않는다
*/