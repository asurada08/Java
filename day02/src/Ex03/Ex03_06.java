package Ex03;

public class Ex03_06 {

	public static void main(String[] args) {
		int a;//정수형 변수 a 선언
		float b;//실수형 변수 b 선언
		//(자료형) 캐스팅연산자 = 형변환연산자 (오른쪽에서 왼쪽으로 연산함)
		a = (int)123.45f;//강제 캐스팅 = 강제 형변환 (명시적인 형변환, 값 보존 안됨)
		//정수형 변수에 실수 대입, 바랍직하지 않음 / 오류 방지를 위하여 (int)를 붙여 정수로 변환
		b = 200;//실수형 변수에 정수를 대입, 바람직하지 않음(double)형이 됨
		//b=(float)200;//자동 캐스팅 = 묵시적인 형변환 (자동 형변환, 값 보존 됨)
		//b=200f;
		
		System.out.printf("a의 값 : %d \n", a);
		System.out.printf("b의 값 : %f \n", b);
	}

}
