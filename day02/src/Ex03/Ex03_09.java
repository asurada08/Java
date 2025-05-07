package Ex03;

public class Ex03_09 {

	public static void main(String[] args) {
		int a = 100, b = 200;
		float c;
		c = a / b;

		System.out.printf("c의 값 : %f\n", c);

		float d = 0.1234567890123456789012345f;// float 7자리 이후 반올림
		double f = 0.1234567890123456789012345;// double 18자리 이후 반올림

		System.out.printf("d의 값 : %26.25f\n", d);
		System.out.printf("f의 값 : %26.25f\n", f);
	}

}
