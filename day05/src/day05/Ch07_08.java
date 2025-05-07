package day05;

public class Ch07_08 {

	public static void main(String[] args) {
		int sum = 0, i;

		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.printf("1부터 100까지 합은 %d 입니다\n", sum);
		if (sum > 5000) {
			return;
		}
		System.out.printf("프로그램의 끝입니다.");
	}
}
