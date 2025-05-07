package day13;

public class Ch06_07_MathEx {

	public static void main(String[] args) {
		double a = -2.78987434;
		//절대값 구하기
		System.out.println(Math.abs(a));//절대값
		System.out.println(Math.ceil(a));//지정된 실수보다 크거나 같은 수 중에서 가장 작은 정수를 실수 타입으로 반환
		System.out.println("ceil(2.4) : " + Math.ceil(2.4));//3.0 무조건 올림
		System.out.println(Math.floor(a));//지정된 실수보다 작거나 같은 수 중에서 가장 큰 정수를 실수 타입으로  반환
		System.out.println("floor(2.5) : " + Math.floor(2.5));//2.0 무조건 내림
		System.out.println(Math.sqrt(9.0));//제곱근을 반환
		System.out.println(Math.exp(1.5));//e^a 값 반환 a자리에 1.5 e 는 2.718281...
		System.out.println(Math.rint(3.141592));//지정된 실수와 가장 근접한 정수를 실수 타입으로  반환
		
		//1~45 사이 난수 발생
		System.out.print("이번주 행운의 번호는 : ");
		for(int i = 0; i<6; i++) {
			System.out.print(Math.round(1+Math.random()*44) + " ");//round 반올림
		}
		System.out.println("입니다");
	}

}
/*
Math 클래스
java.lang.Math
기본적인 산술 연산을 수행하는 메소드 제공
모든 멤버 메소드는 static으로 정의
 - 객체를 만들어서 사용할 필요 없음.
메소드 : abs, cos, sin, tan, exp, ceil, floor, max, min random, rint, round, sqrt
난수 발생 : static double random()
 - 0.0 이상 1.0 미만의 임의의 double 값을 반환
java.util의 Random 클래스를 이용하면 좀 더 다양한 형태로 난수 발생 가능
*/