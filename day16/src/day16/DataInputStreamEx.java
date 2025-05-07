//저장된 (이진코드) text.txt 파일 기본형으로 읽어오기
package day16;

import java.io.*;

public class DataInputStreamEx {

	public static void main(String[] args) {
		DataInputStream dis = null;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("src\\day16\\test.txt");
			dis = new DataInputStream(fis);
			
			//DataInputStream은 기본 자료형을 유지한 채로 저장된 값을 읽을수 있는 read()가 있다
			//읽어들일 때는 반드시 기록한 순서대로 읽어와야 한다
			
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();
			System.out.println("i : " + i);
			System.out.println("d : " + d);
			System.out.println("s : " + s);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("오류");
		}finally {
			try {
				if(fis != null) fis.close();
			}catch (IOException e) {
				try {
					if(dis != null) dis.close();
				}catch (IOException e1) {
					e1.getStackTrace();
				}
			}//catch
		}//finally (Exception을 정석으로 처리한 내용)
	}//main
}//DataInputStreamEx
