package day03;

public class Ex02_07 {

	public static void main(String[] args) {
		System.out.println('a' > 'b');// f
		System.out.println(3 >= 2);// t
		System.out.println(-1 < 0);// t
		System.out.println(3.45 <= 2);// f
		System.out.println(3 == 2);// f
		System.out.println(3 != 2);// t
		System.out.println(!(3 != 2));// !t -> f
		System.out.println((3 > 2) && (3 > 4));// t && f -> f
		//왼쪽이 거짓이면 결과 거짓(왼쪽만 비교하고 끝남) : 축약형에 씀
		//System.out.println((3 != 2) || (-1 > 0));// t || f -> t
		//왼쪽이 참이면 결과 참(왼쪽만 비교하고 끝남) : 축약형에 씀
		System.out.println((3 != 2) ^ (-1 > 0));// t ^ f -> t
		//swap에서 사용(값 바꿀때)

		// 부호연산자 +(부호유지), -(부호변경)
		byte b = 10;
		byte c = (byte) -b;// 변수에 -를 붙이면 int형으로 변환 됨. 캐스팅 필요
		byte c1 = -100;
		byte d = (byte) (b + b);// byte, short, char 끼리 계산하면 int형으로 변환됨
		int i = ~b;// -11 /  ~ : 비트반전연산자 
		int i1 = ~b + 1;// b의 부호만 바꾸고 싶으면 ~b+1 // -b를 해도 됨 int형
		int i2 = -b;
		
		System.out.println("c :"+ c);
		System.out.println("c1 :"+ c1);
		System.out.println("d :"+ d);
		System.out.println("i = " + i);
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		// -부호연산자 : 산술(+, -, *, /) int형으로 변경됨
		// ~변수 / -변수 / 변수+변수 int형으로 인식
		// 상수일대는 -를 붙여도 상관 없음

		// char형과 short형, byte형 캐스팅 할 수 없음
		// char형의 범위 : 0 ~ 65535, 음수 X 음수가 저장되는 byte는 char에 자동변환 시킬수 없다
		byte by = 65;
		char c2 = (char) by;// (x) char c= (char)b (o)
		System.out.println("c2 = " + c2);
	}

}
