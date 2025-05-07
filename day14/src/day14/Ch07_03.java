package day14;

import java.util.*;
import java.util.stream.Stream;

public class Ch07_03 {

	public static void main(String[] args) {
		// 문자열만 삽입 가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();
		// 키보드로부터 4개의 이름 입력 받아 ArrayList에 삽입
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력 하세요 : ");
			String s = scan.next();// 키보드로부터 이름 입력
			a.add(s);// ArrayList 컬렉션에 삽입
		}
		// ArrayList에 들어 있는 모든 이름 출력
		for (int i = 0; i < a.size(); i++) {
			// ArrayList의 i번째 문자열 얻어오기
			String name = a.get(i);
			System.out.print(name + " ");
		}
		// Iterator로 변환
		System.out.println("\n-----Iterator로 변환------");
		Iterator<String> it = a.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
		// Stream 클래스 이용하기
		System.out.println("\n-----Stream 클래스 이용------");
		Stream<String> st = a.stream();
		st.forEach(i -> System.out.print(i + " "));

		// 가장 긴 이름 출력
		int longestIndex = 0;
		for (int i = 1; i < a.size(); i++) {
			if (a.get(longestIndex).length() < a.get(i).length()) {
				longestIndex = i;
			}
		}
		System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));
		scan.close();
	}

}
/*
ArrayList<E> : java.util.ArrayList, 가변 크기 배열을 구현한 클래스
	- <E>에서 E 대신 요소로 사용할 특정 타입으로 구체화
ArrayList에 삽입 가능한  것 : 객체, null / 기본 타입(Wrapper 객체로 만들든지, 자동박싱/언박싱 사용하든지)
ArrayList에 객체 삽입/삭제
	- 리스트의 맨 뒤에 객체 추가 : 공간이 모자라면 자동 늘림
	- 리스트의 중간에 객체 삽입 : 삽입된 뒤의 객체는 뒤로 하나씩 이동
	- 임의의 위치에 있는 객체 삭제 가능 : 객체 삭제 후 자동 자리 이동
벡터와 달리 자동으로 스레드 동기화 지원 않음
	- 다수 스레드가 동시에 ArrayList에 접근할 때 동기화시키지 않음
	- 개발자가 스레드 동기화 코드 작성
ArrayList<String> 컬렉션의 내부 구성 : ArrayList<String> = new ArrayList<String>();
동기화 X, 속도 빠르다, 안정성(신뢰성) 낮음
*/