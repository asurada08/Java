package day04;

public class Ch04_01 {

	public static void main(String[] args) {
		int a, b, c, result1, mok, namuji;
		float result2;
		a = 2;
		b = 3;
		c = 4;
		
		result1 = a+b-c;
		System.out.printf("%d + %d - %d = %d\n", a, b, c, result1);
		
		result1 = a + b * c;
		System.out.printf("%d + %d * %d = %d\n", a, b, c, result1);
		
		result2 = a * b / (float)c;
		System.out.printf("%d * %d / %d = %f\n", a, b, c, result2);
		
		mok = c / b;
		System.out.printf("%d / %d 의 몫은 %d\n", c, b, mok);
		
		namuji = c % b;
		System.out.printf("%d / %d 의 나머지는 %d\n", c, b, namuji);
	}

}
