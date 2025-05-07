/* 
기본 자료 값을 --> 바이트로 저장(file.txt)
DataInputStream / DataOutputStream
바이트 스트림으로부터 자바 기본 자료형 Data를 읽는다
기본자료형을 바이트스트림으로 출력한다
특정 데이터 타입과 포맷을 유지한 채 데이터를 기록하고 읽어올 수 있는 스트림
특정 데이터 타입과 포맷에 맞게 읽고 쓸 수 있는 
readBoolean(), writeBoolean(boolean v), readInt(), writeInt(int v),
readUTF(), writeUTF(String s) 등의 메소드 재공

생성자
DataInputStream(InputStream stream)
DataOutputStream(OutputStream stream)
 */
package day16;
import java.io.*;
public class DataOutputStreamEx {
	public static void main(String[] args) {
		//DataOutputStream은 기본자료형 타입 그대로 스티림을 통해서 기록 할 수 있다
		//1차 스트림이 아니기 때문에 다른 스트림을 이용해서 특정 device와 연결될 수 있다
		//(필터=보조스트림)
		DataOutputStream dos = null;
		FileOutputStream fos = null;
		try {
			//DataOutputStream과 연결된 FileOutputStream 객체 생성
			fos = new FileOutputStream("src\\day16\\test.txt");
			//기본자료형의 타입을 유지한채 기록할 수 있는 DataOutputStream 객체 생성
			dos = new DataOutputStream(fos);

			int i = 10;
			double d = 3.14;
			String s = "JAVA프로그램";
			//DataOutputStream은 기본자료형별로 write메소드가 존재
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);
						
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("오류");
		}finally {//Exception 유무에 무관 : 무조건 수행, 보조
			try {
				if(fos != null) fos.close();
			}catch (IOException e) {
				try {
					if(dos != null) dos.close();
				}catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}//finally
	}

}
