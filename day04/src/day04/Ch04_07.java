package day04;

public class Ch04_07 {

	public static void main(String[] args) {
		//비트 논리곱 연산자 1 & 1 = 1 나머지 0
		System.out.printf("10 & 7 = %d\n", 10&7);//1010 ^ 0111 = 0010
		System.out.printf("123 & 456 = %d\n", 123&456);
		System.out.printf("0xffff & 0000 = %d\n", 0xffff&0000);
		System.out.println("");
		//비트 논리합 연산자 0 | 0 = 0 나머지 1
		System.out.printf("10 | 7 = %d\n", 10|7);
		System.out.printf("123 | 456 = %d\n", 123|456);
		System.out.printf("0xffff | 0000 = %d\n", 0xffff|0000);
		System.out.println("");
		//비트 배타적 논리합 연산자 1 ^ 0 = 1 / 0 ^ 1 = 1 나머지는 0
		System.out.printf("10 ^ 7 = %d\n", 10^7);
		System.out.printf("123 ^ 456 = %d\n", 123^456);
		System.out.printf("0xffff ^ 0000 = %d\n", 0xffff^0000);
		System.out.println("");

	}

}
