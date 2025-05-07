//스택 자료 구조를 제네릭 클래스로 선언하고, String과 Integer형 스택을 사용하는 예를 보여라.
package day15;

class GStack<T> {//클래스 제너릭 : 정의할 시에는 타입을 일반화 시킴
	int tos;
	Object[] stck;

	public GStack() {
		tos = 0;
		stck = new Object[10];
	}
	//삽입
	public void push(T item) {// 매개변수 제너릭
		if (tos == 10) {//full이면 돌아가기
			return;
		}
		stck[tos] = item;//full이 아니면 삽입하기
		tos++;//삽입하고 자리위치 하나 증가
	}
	//삭제
	public T pop() {// 반환형 제너릭
		if (tos == 0) {//비어있으면 null 리턴
			return null;
		}
		tos--;//비어 있지 않으면 자리 위치 하나 빼기
		return (T) stck[tos];//값 꺼내기 == 삭제하기 / 반환되는 값 제너릭
	}
}//class

public class Ch07_09 {

	public static void main(String[] args) {
		//사용하는 타입을 구체화<T> => <String>
		GStack<String> stringStack = new GStack<String>();// string형 push
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");

		for (int i = 0; i < 3; i++) {
			System.out.println(stringStack.pop());
		}
		
		//사용하는 타입을 구체화<T> => <Integer>
		GStack<Integer> intStack = new GStack<Integer>();// int형 push
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);

		for (int i = 0; i < 3; i++) {
			System.out.println(intStack.pop());
		}
	}

}
/*
제네릭 만들기
클래스나 인터페이스 선언부에 일반화된 타입 추가
public class MyClass<T> {// 제네릭 클래스 MyClass선언 타입 매개변수 T(T 자리에 String, Integer 등 지정됨)
	T val; //val의 타입은 T(T 자리에 String, Integer 등 지정됨)
	void set(T a) {// T타입의 값 a를 val에 지정(T 자리에 String, Integer 등 지정됨)
		val = a; 
	}
	T get() {
		return val; T 타입의 값 val 리턴(T 자리에 String, Integer 등 지정됨)
	}
}
제네릭 클래스 레퍼런스 변수 선언
MyClass<String> s;
List<Integer> li;
Vector<String> vs;

제네릭 객체 생성 – 구체화(specialization)
제네릭 타입의 클래스에 구체적인 타입을 대입하여 객체 생성
컴파일러에 의해 이루어짐

타입 매개 변수에 기본 타입은 사용할 수 없음 객체가 와야함.
Vector<int> vi = new Vector<int>(); // 컴파일 오류. int는 사용 불가 Integer로 적어야함

타입 매개 변수
하나의 대문자를 타입 매개 변수로 사용
타입 매개변수가 나타내는 타입의 객체 생성 불가 : ex) T a = new T(); X
타입 매개 변수는 나중에 실제 타입으로 구체화 T로 선언 후 Integer 등으로 구체화
어떤 문자도 매개 변수로 사용 가능 (그래도 의미에 맞춰서 사용)
*/