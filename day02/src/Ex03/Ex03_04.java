package Ex03;

public class Ex03_04 {

	public static void main(String[] args) {
		System.out.printf("%d\n", 123);
		System.out.printf("%5d%n", 123);//오른쪽 중심으로 찍고 나머지 공백
		System.out.printf("%-5d%n", 123);//왼쪽중심으로 찍고 나머지 공백
		System.out.printf("%05d%n", 123);
		System.out.printf("%10f%n", 123.45);
		System.out.printf("%7.1f%n", 123.45);
		System.out.printf("%7.3f%n", 123.45);
		System.out.printf("%s%n","Hi~Java");
		System.out.printf("%10s%n","Hi~Java");
		System.out.printf("%-10s%n","Hi~Java");
		System.out.printf("%b%n",false);
		System.out.printf("%B%n",false);
		System.out.printf("%e\n", 123.123);//지수로 표현 정수.XXXX +e자리수, -e자리수
		System.out.printf("%g\n", 123.1238);//소수 미만 3자리까지 출력 4자리에서 반올림
		System.out.printf("%d\n", -123);//-123 으로 출력
		System.out.printf("-%d\n", 123);//-123 으로 출력
		System.out.printf("%(d\n", -123);//음수를 (123)으로 표현
	}

}
