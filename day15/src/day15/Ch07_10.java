package day15;

public class Ch07_10 {
	public static <T> GStack<T> reverse(GStack<T> a) {
		GStack<T> s = new GStack<T>();
		while (true) {
			T tmp;
			tmp = a.pop();// 원래 스택에서 요소 하나를 꺼냄
			if (tmp == null) {// 스택이 비어있음
				break;
			} else {
				s.push(tmp);// 새 스택에 요소를 삽입
			}
		}
		return s;// 새 스택을 반환
	}

	public static void main(String[] args) {
		// Double 타입의 GStack 생성
		GStack<Double> gs = new GStack<Double>();

		// 5개의 요소를 스택에 push
//		System.out.print("push : ");
		for (int i = 0; i < 5; i++) {
			gs.push(new Double(i));
//			System.out.print(gs.pop() + " ");
		}
		gs = reverse(gs);
		System.out.print("\nreverse : ");
		for (int i = 0; i < 5; i++) {
			System.out.print(gs.pop() + " ");
		}
	}
}
/*
제네릭과 배열
제네릭에서 배열의 제한 : 제네릭 클래스 또는 인터페이스의 배열을 허용하지 않음
제네릭 타입의 배열도 허용되지 않음 : 앞 예제에서는 Object 타입으로 배열 생성 후 
								  실제 사용할 때 타입 캐스팅
	- return (T)stck[tos]; // 타입 매개 변수 T타입으로 캐스팅
타입 매개변수의 배열에 레퍼런스는 허용
	- public void myArray(T[] a) {....}

제네릭 메소드
제네릭 메소드 선언 가능
class GenericMethodEx {
	static <T> void toStack(T[] a, GStack<T> gs) {
		for (int i = 0; i < a.length; i++) {
			gs.push(a[i]);
		}
	}
}
제네릭 메소드를 호출할 때는 컴파일러가 메소드의 인자를 통해 
이미 타입을 알고 있으므로 타입을 명시하지 않아도 됨
	- String[] sa = new String[100];
	- GStack<String> gss = new GStack<String>();
	- GenericMethodEx.toStack(sa, gss); // 타입 매개 변수 T를 String 으로 유추함
 		* sa는 String[], gss는 GStack<String> 타입이므로 T를 String으로 유추

제네릭의 장점
컬렉션과 같은 컨테이너 클래스에 유연성을 해치지 않으며 type-awareness를 첨가
메소드에 type-awareness 첨가
컴파일 시에 타입이 결정되어 보다 안전한 프로그래밍 가능
개발 시 다운캐스팅(타입 캐스팅) 절차 불필요
런타임 타입 충돌 문제 방지
ClassCastException 방지
*/