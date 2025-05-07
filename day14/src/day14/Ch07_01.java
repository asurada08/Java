/*
 ○ Enumeration 과 Iterator 인터페이스
 컬렉션 프레임워크(Collection Framework)에는 Enumeration 과 Iterator 라는 인터페이스가 있다.
 사전적인 의미로는 반복, 순환 등의 의미를 가지고 있으며 어떤 객체들의 모임이 있을때
 이 객체들을 어떤 순서에 의해 하나씩 접근하여 사용하기 위한 인터페이스라고 정리할 수 있다.
  	- java.util.Enumeration<E> 인터페이스
 	  이 인터페이스는 단지 두 개의 메소드만을 제공하며
 	  『hasMoreElements()』 메소드를 통해 인터페이스 안에
 	  다음 요소가 있는지에 대한 질의를 한다.
 	  만약 true가 반환되었다면 다음 인텍스 요소가 존재한다는 의미이며
 	  『nextElement()』메소드로 다음 요소를 꺼내어 사용하면 된다.
 	  ex) v 라는 벡터 자료구조에 저장된 모든 요소 출력
 	  for(Enumeration e = v.elements(); e.hasMoreElements;) {
 	  		System.out.println(e.nextElement());
 	  }
 	 
 	 - java.util.Iterator<E> 인터페이스
 	   Enumeration과 차이점은 단지 『remove()』메소드가 추가된 것 뿐이다.
 	   『hasNext()』와 『next()』메소드는 이름만 약간 다를뿐
 	   Enumeration 인터페이스의 『hasMoreElements()』와
 	   『nextElement()』와 정확히 일치하는 기능을 한다.
 	   Enumeration 대신 Iterator를 JAVA2에서 추가하여 사용하는 이유는
 	   Enumeration 인터페이스는 집합 내에서 요소를 제거할 방법이
 	   없기 때문에 이를 보완하기 위해서 나온 것이 Iterator라 할수 있다.
 	   hasNext() : 다음 위치에 요소(데이터)가 있으면 true를 반환한다 
 	   next() 	 : 다음 위치의 요소(데이터)를 반환한다.
 	   remove()  : 반복자(Iterator)에 의해 마지막 반환된 요소를 삭제한다.
 
- collection 인터페스 : 
 list(중복가능, 정렬 가능) - ArrayList, vector, stack, queue, linkedlist 
 set(중복불가능, 정렬불가능) - HashSet
- Map인터페이스(키,값) 한쌍 : (키중복불가능, 값 중복가능, 정렬X)- HashMap, HashTable 
*/
package day14;

import java.util.Iterator;
import java.util.Vector;

public class Ch07_01 {
	public static void main(String[] args) {
// 정수 값만 다루는 제네릭 벡터 생성
// 스레드 동기화(O), 다수의 스레드가 동시에 Vector에 접건가능(Thread Safe보장)
// 벡터는 (기본용량 10, 증가값) 동기화 지원, 인덱스 있음.
// <?> 모든 자료형이 제너릭 타입으로 들어 올 수 있다.==object
// <T extends 부모 class> 부모를 상속받은 객체만을 자료형으로 받겠다(상위클래스 제한)
// <? super 하위 class> 하위클래스가 상속받고 있는 상위 클래스 자료형으로 제한(하위클래스 제한)
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);// 5 삽입, 자동박싱
		v.add(4);// 4 삽입
		v.add(-1);// -1 삽입
		// 벡터 중간에 삽입하기
		v.add(2, 100);// 4와 -1 사이에 100 삽입
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());// 4 /size() 요소의 개수
		System.out.println("백터의 현재 용량 : " + v.capacity());// 10 /capacity() 백터의 용량
		// 모든요소 정수 출력하기
		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		// 벡터 속의 모든 정수 더하기
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
		System.out.println("-----------------------------");
		
		// 이더레이터(Iterator)를 통해 전체 출력
		// hasNext():다음 데이터요소가 있는지 여부 반환
		// next():다음 데이터요소수를 직접적으로 반환
		// Vectot, ArrayList, linkedList, Set과 같은 컬렉션에서 요소를 순차적으로 검색할때
		// 편리하게 사용하는 Interator<E>인터페이스다
		Iterator<Integer> it = v.iterator();
		int str;
		while (it.hasNext()) {
			str = it.next();
			System.out.println(str + " ");
		}
		// System.out.println(it.next());//재사용 불가
	}
}

/*
컬렉션(collection)의 개념 (배열은 삽입 삭제에 용이하지 않아 나옴)
컬랙션 : 요소(element)라고 불리는 가변 개수의 객체들의 모음
			- 객체들의 컨테이너라고도 불림
			- 요소의 개수에 따라 컬렉션은 자동 크기 조절
			- 컬렉션은 요소의 삽입, 삭제에 따른 요소의 이동 자동 관리
		고정 크기의 배열을 다루는 어려움 해소
		다양한 객체들의 삽입, 삭제, 검색 등을 관리하기 용이
컬렉션과 제네릭 : 컬렉션은 제네릭(generics) 기법으로 구현됨
				 컬렉션의 요소는 객체만 사용 가능
					-기본적으로 int, char, double 등의 기본 타입 사용 불가

제네릭 : 특정 타입만 다루지 않고, 여러 종류의 타입으로 변신할 수 있도록 클래스나 메소드를 일반화시키는 기법
<E> element, <K> key, <V> variable,<T> type, <N> number 등 : 타입 매개 변수
제네릭 클래스 사례
	- 제네릭 벡터 : Vector<E> / E에 특정 타입으로 구체화 / 
		   		   정수만 다루는 벡터 Vector<Integer> / 문자열만 다루는 벡터 Vector<String>
*/