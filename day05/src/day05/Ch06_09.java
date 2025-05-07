package day05;

public class Ch06_09 {

	public static void main(String[] args) {
		int i, j;

		for(i = 2; i<=9;i++) {
			System.out.printf("     %d단    ",i);
		}
		System.out.println("");
		for (i = 1; i <= 9; i++) {
			for (j = 2; j <= 9; j++) {
				System.out.printf("%3d * %d = %2d", j, i, j * i);
			}
			System.out.printf("\n");
		}
		System.out.println("");
		int m, n;
		for (m = 2; m <= 9; m++) {
			System.out.printf("%d단", m);
			for (n = 1; n <= 9; n++) {
				System.out.printf("%3d * %d = %2d", m, n, m * n);
			}
			System.out.println("");
		}
	}

}
