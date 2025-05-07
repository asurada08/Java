package day06;

public class Test10_0409 {

	public static void main(String[] args) {
		System.out.println("for");
		int i, j = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 == 0 && i % 4 == 0) {
				System.out.printf("%d ", i);
				j += i;
			}
		}
		System.out.println("");
		System.out.printf("합 : %d", j);

		System.out.println("");
		System.out.println("while");
		i = 1;
		j = 0;
		while (i <= 100) {
			if (i % 2 == 0 && i % 3 == 0 && i % 4 == 0) {
				System.out.printf("%d ", i);
				j += i;
			}
			i++;
		}
		System.out.println("");
		System.out.printf("합 : %d", j);
		
		System.out.println("");
		System.out.println("do-while");
		i = 1;
		j = 0;
		do {
			if (i % 2 == 0 && i % 3 == 0 && i % 4 == 0) {
				System.out.printf("%d ", i);
				j += i;
			}
			i++;
		} while (i <= 100);
		System.out.println("");
		System.out.printf("합 : %d",j);
	}
}
