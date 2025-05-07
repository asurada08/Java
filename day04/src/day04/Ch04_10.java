package day04;

public class Ch04_10 {

	public static void main(String[] args) {
		// 시프트 연산자
		// 왼쪽 시프트
		int a = 10;
		System.out.printf("%d를 왼쪽 1회 시프트 하면 %d 이다.\n", a, a << 1);
		System.out.printf("%d를 왼쪽 2회 시프트 하면 %d 이다.\n", a, a << 2);
		System.out.printf("%d를 왼쪽 3회 시프트 하면 %d 이다.\n", a, a << 3);
		System.out.println("");
		// 오른쪽 시프트
		int b = 10;
		System.out.printf("%d를 오른쪽 1회 시프트 하면 %d 이다.\n", b, b >> 1);
		System.out.printf("%d를 오른쪽 2회 시프트 하면 %d 이다.\n", b, b >> 2);
		System.out.printf("%d를 오른쪽 3회 시프트 하면 %d 이다.\n", b, b >> 3);
		System.out.printf("%d를 오른쪽 4회 시프트 하면 %d 이다.\n", b, b >> 4);
		System.out.println("");

		// 왼쪽, 오른쪽 시프트 연산자 반복 수행 출력
		int c = 100, result;
		int i;

		for (i = 1; i <= 5; i++) {
			result = c << i;
			System.out.printf("%d << %d = %d\n", c, i, result);
		}
		System.out.println(i);
		for (i = 1; i <= 5; i++) {
			result = c >> i;
			System.out.printf("%d >> %d = %d\n", c, i, result);
		}
		System.out.println(i);
	}
}