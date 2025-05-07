package day05;

public class Ch07_05 {

	public static void main(String[] args) {
		int sum = 0, i;
		for (i = 1; i < 100; i++) {
			sum += i;

			if (sum > 1000) {
				break;
			}
		}
		System.out.println("1~100의 합에서 최초로 1000이 넘는 위치는 : "+i);
	}

}
