package day11;

public class Ch04_02 {
	int base;//number1 : 2 / number2 : 3
	int exp;//number1 : 3 / number2 : 4

	int getValue() {
		int res = 1;
		for (int i = 0; i < exp; i++) {//number1 : 0~3(3번) / number2 : 0~4(4번)
			res = res * base;//number1 : 1*2*2*2 / number2 : 1*3*3*3*3
		}
		return res;//number1 : 8 / number2 : 81
	}

	public static void main(String[] args) {
		Ch04_02 number1 = new Ch04_02();
		number1.base = 2;
		number1.exp = 3;
		Ch04_02 number2 = new Ch04_02();
		number2.base = 3;
		number2.exp = 4;

		System.out.println("2의 3승 = " + number1.getValue());
		System.out.println("3의 4승 = " + number2.getValue());
	}

}
/*
클래스 MyExp를 작성하라. 
MyExp는 지수값을 표현하는 클래스로서 두 개의 정수형 멤버 필드 base와 exp를 가진다. 
23의 경우 base는 2이며, exp는 3이 된다. base와 exp는 양의 정수만을 가지는 것으로 가정한다.
또한 MyExp는 정수값을 리턴하는 getValue()라는 멤버 메소드를 제공한다. 
getValue()는 base와 exp 값으로부터 지수를 계산하여 정수 값으로 리턴한다. 
예를 들어 MyExp객체의 base 필드가 2이고 exp가 3이라면 getValue()는 8을 리턴한다.
*/