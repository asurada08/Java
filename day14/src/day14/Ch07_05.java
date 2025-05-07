package day14;

import java.util.*;

public class Ch07_05 {

	public static void main(String[] args) {
		// 영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
		HashMap<String, String> dic = new HashMap<String, String>();
		// 3개의 (key, value)쌍을 dic에 저장
		dic.put("baby", "아기");// baby는 key, 아기는 value
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		dic.put("one", "하나");

		// dic 컬렉션에 들어 있는 모든 (key, value) 쌍 출력
		Set<String> keys = dic.keySet();
		Iterator<String> it = keys.iterator();
//		while (it.hasNext()) {
//			String key = it.next();
//			String value = dic.get(key);
//			System.out.println("( " + key + ", " + value + " )");
//		}
		System.out.println("-----for-----");
		for(int i=0;i<dic.size();i++) {//size 요소의 개수
			String key = it.next();
			String value = dic.get(key);
			System.out.println("( " + key + ", " + value + " )");
		}
		// 영어 단어를 입력 받고 한글 단어 검색
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("찾고 싶은 단어 : ");
			String eng = scan.next();
			System.out.println(dic.get(eng));
		}
		scan.close();
	}
}
/*
HashMap<K,V> (java.util.HashMap) : 연관메모리
	- K는 키로 사용할 요소의 타입을, V는 값을 사용할 요소의 타입 지정
키(key)와 값(value)의 쌍으로 구성되는 요소를 다루는 컬렉션
	- 키와 값이 한 쌍으로 삽입됨
	- 키는 내부적으로 해시맵에 삽입되는 위치 결정에 사용
	- 값을 검색하기 위해서는 반드시 키 이용
삽입 및 검색이 빠른 특징
요소 삽입 : put() 메소드 / 요소 검색 : get() 메소드
HashMap<String, String> 생성, 요소 삽입, 요소 검색
HashMap<String, String> h = new HashMap<String, String>(); 
h.put("apple", "사과"); // "apple" 키와 "사과" 값의 쌍을 해시맵에 삽입
String kor = h.get("apple"); // "apple" 키로 값 검색. kor는 "사과“
HashMap<String, String>의 내부 구성과 put(), get() 메소드
	- HashMap<String, String> map = new HashMap<String, String>();
*/