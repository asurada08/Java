package day16;

import java.io.*;

public class ObjectOutputStreamEx {

	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		/*
		메모리에 생성된 객체를 직렬화 해서 스트림을 통해 기록할 수 있는
		ObjectOutputStream 객체 생성
		ObjectOutputStream을 통해서 직렬화 후 파일로 기록된 
		Data 객체 생성 Data 클래스는 반드시 Serializable을 구현하고 있어야 한다
		 */
		try {
			oos = new ObjectOutputStream(new FileOutputStream("src\\day16\\test01.txt"));
			Data data = new Data();
			data.setNo(30);
			data.setName("홍길동");
			data.setMail("test@naver.com");
			//ObjectOutputStream을 객체를 직렬화 해서 스트림을 통해 기록할 수 있는
			//writeObject()를 제공한다
			oos.writeObject(data);//직렬화된 데이터(test01.txt)에 저장
		}catch (Exception e) { 
			e.getStackTrace();
		}finally {
			try {
				if(oos != null) oos.close();
			}catch (Exception e) {
				e.getStackTrace();
			}
		}//finally
	}

}
