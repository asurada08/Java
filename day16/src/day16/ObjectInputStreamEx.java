package day16;

import java.io.*;

public class ObjectInputStreamEx {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		/*
		파일에 저장된 객체를 읽어들이기 위해 ObjectInputStream 객체 생성
		역직렬화 : 원래 자료형으로 변환 역직렬화 할때 필요한 클래스 파일을 찾지 못할 경우
		ClassNotFoundException을 발생시킨다
		 */
		try {
			ois = new ObjectInputStream(new FileInputStream("src\\day16\\test01.txt"));
			//역직렬화
			Data data = (Data)ois.readObject();//원래 객체로 변환
			System.out.println("번호 : " + data.getNo());
			System.out.println("이름 : " + data.getName());
			System.out.println("메일 : " + data.getMail());//출력 1
			System.out.println("=======================");
			System.out.println(data);//출력 2
			System.out.println("=======================");
			System.out.println(data.toString());//출력 3
		}catch (Exception e) {
			e.getStackTrace();
		}finally {
			try {
				if(ois != null) ois.close();
			}catch (Exception e) {
				e.getStackTrace();
			}
		}//finally
	}

}
