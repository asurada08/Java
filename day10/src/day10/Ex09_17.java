//값의 전달(call by value) - 값 자체를 메소드에 넘겨주는 방법
package day10;

public class Ex09_17 {
	static void func1(int a) {//형식 매개 변수
		a = a + 1;
		System.out.printf("전달 받은 a : %d\n", a);
	}
	public static void main(String[] args) {
		int a = 10;
		
		func1(a);//실 매개값
		//call by value 방식 : 값 전달 방식
		//값만 복사해서 처리하기 때문에 원래 변수에 값의 변화가 없다
		//기본형은 모두 값 전달 방식이다
		System.out.printf("func1() 실행 후 a : %d\n", a);

	}

}
//복사한 값이 내용으로 오고간 것이라 결과값의 변화가 없다