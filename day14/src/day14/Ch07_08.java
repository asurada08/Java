package day14;

import java.util.*;

public class Ch07_08 {
	static void printList(LinkedList<String> I) {
		Iterator<String> iterator = I.iterator();
		while (iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if (iterator.hasNext()) {
				separator = " -> ";
			} else {
				separator = "\n";
			}
			System.out.print(e + separator);
		}
	}

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		
		System.out.println("-----정렬 전-----");
		printList(myList);
		
		System.out.println("\n-----정렬 후-----");
		Collections.sort(myList);
		printList(myList);
		
		System.out.println("\n----이분검색------");
		int index = Collections.binarySearch(myList, "트랜스포머") + 1;
		System.out.println("트랜스포머 " + index + " 번째 요소입니다");
		
		System.out.println("\n-----역순정렬------");
		Collections.reverse(myList);
		printList(myList);
	}

}
/*
LinkedList<E> (java.util.LinkedList) : E에 요소로 사용할 타입 지정하여 구체와
List 인터페이스를 구현한 컬렉션 클래스
Vector, ArrayList 클래스와 매우 유사하게 작동
요소 객체들은 양방향으로 연결되어 관리됨
요소 객체는 맨 앞, 맨 뒤에 추가 가능
요소 객체는 인덱스를 이용하여 중간에 삽입 가능
맨 앞이나 맨 뒤에 요소를 추가하거나 삭제할 수 있어 스택이나 큐로 사용 가능
LinkedList<String>의 내부 구성과 put(), get() 메소드
	- LinkedList<String> l = new LinkedList<String>();

Collections 클래스 활용 (java.util 패키지 포함)
컬렉션에 대해 연산을 수행하고 결과로 컬렉션 리턴
모든 메소드는 static 타입
주요 메소드
	- 컬렉션에 포함된 요소들을 소팅하는 sort() 메소드
	- 요소의 순서를 반대로 하는 reverse() 메소드
	- 요소들의 최대, 최솟값을 찾아내는 max(), min() 메소드
	- 특정 값을 검색하는 binarySearch() 메소드 
*/