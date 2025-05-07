package day14;

import java.util.*;

public class Ch07_04 {

	public static void main(String[] args) {
		// 정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);

		// iterator를 이용한 모든 정수 출력하기
		Iterator<Integer> it = v.iterator();// Iterator객체 얻기
		while (it.hasNext()) {
			int n = it.next();
			System.out.print(n + " ");
		}

		// Iterator를 이용하여 모든 정수 더하기
		int sum = 0;
		it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("\n벡터에 있는 정수 합 : " + sum);
	}

}
/*
컬렉션의 순차 검색을 위한 Iterator
Iterator<E> 인터페이스 : Vector<E>, ArrayList<E>, LinkedList<E>가 상속받는 인터페이스
	- 리스트 구조의 컬렉션에서 요소의 순차 검색을 위한 메소드 포함
Iterator<E> 인터페이스 메소드
boolean hasNext()	다음 반복에서 사용될 요소가 있으면 true 반환
E next()			다음 요소 반환
void remove()		마지막으로 반환된 요소 제거
iterator() 메소드
	- iterator()를 호출하면 Iterator 객체 반환
	- Iterator 객체를 이용하여 인덱스 없이 순차적 검색 가능
*/