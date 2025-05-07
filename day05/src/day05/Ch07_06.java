package day05;

public class Ch07_06 {

	public static void main(String[] args) {
		int sum = 0, i;

		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				continue;
			}
			sum += i;

		}
		System.out.println("1~100까지 합(3의 배수 제외) : " + sum);
	}
}
