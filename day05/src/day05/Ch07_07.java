package day05;

public class Ch07_07 {

	public static void main(String[] args) {
		//그냥 무한루프 계속 돌림
		int sum = 0;
		int i;
		
		/*for (;;) {
			for (i = 1; i <= 100; i++) {
				sum += i;
				if (sum > 2000) {
					System.out.printf("%d\n", sum);
					sum = 0;
					break;
				}
			}
			System.out.print("아직도 반복중...\n");
		}*/
		//sum이 2000이 됬을때 for문 전체를 나가게 하겠다
		A: for (;;) {
			for (i = 1; i <= 100; i++) {
				sum += i;
				if (sum > 2000) {
					System.out.printf("%d\n", sum);
					sum = 0;
					break A;
				}
			}
			System.out.print("아직도 반복중...\n");
		}
	}

}
