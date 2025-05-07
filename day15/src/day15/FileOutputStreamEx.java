package day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("src\\day15\\test.out");//("D:\\java_class\\aaa.out");
			FileInputStream fin = null;

			for (int i=0; i<10; i++) {
				int n = 10-i; // 계산의 결과를 저장
				fout.write(n); // 파일에 결과값을 바이너리로 저장
			}
			fout.close(); //스트림을 닫는다.

			fin = new FileInputStream("src\\day15\\test.out"); 
			int c=0;
			while ((c = fin.read()) != -1) {
				System.out.print(c + " "); 
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
/*바이트 스트림 클래스 (java.io 패키지에 포함)
바이트 스트림 : 바이트 단위의 바이너리 값을 읽고 쓰는 스트림
InputStream/OutputStream (추상 클래스)
바이트 입출력 스트림을 다루는 모든 클래스의 수퍼 클래스
FileInputStream/FileOutputStream (바이너리 파일의 입출력) 
파일로부터 바이트 단위로 읽거나 저장하는 클래스
DataInputStream/DataOutputStream (문자열도 바이너리 형태로 입출력)
자바의 기본 데이터 타입의 값(변수)을 바이너리 값 그대로 입출력
ObjectInputStream/ObjectOutputStream
직렬화 / 역직렬화

입출력은 항상 닫아야 함
*/
