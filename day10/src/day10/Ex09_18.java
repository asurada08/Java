//주소(참조)의 전달
package day10;

class myInt {//myInt 클래스 선언
	int a;
}
//call by reference == call by address : 주소 전달방식 : 참조형에 해당함
//호출하고 처리한 후에 기억장소 변화가 있다
public class Ex09_18 {
	static void func1(myInt m) {//실인자(parameter)
		m.a = m.a + 1;//클래스 객체의 정수형 변수 a에 1을 대입
		System.out.printf("전달 받은 a : %d\n", m.a);//a값을 출력
	}

	public static void main(String[] args) {
		myInt m = new myInt();
		m.a = 10;//클래스 객체의 정수형변수 a를 10으로 초기화

		func1(m);//형식인자(argument)
		//메소드 호출 시 클래스 객체 m을 전달
		System.out.printf("func1() 실행 후 a : %d\n", m.a);//메소드 호출 후의 a값을 출력

	}

}
//주소값으로 내용이 오고 가기 때문에 결과값이 다르다. 