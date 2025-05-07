package day06;

public class Ex03_04 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 9; i++) {
			System.out.println("");
			for (j = 2; j <= 9; j++) {
				System.out.printf("%3d * %d = %2d", j, i, j * i);
			}
		}
		System.out.println("");
		System.out.println("");
		for (i = 2; i <= 9; i++) {
			System.out.println(i+"��");
			for (j = 1; j <= 9; j++) {
				System.out.printf("%3d * %d = %2d", i, j, i*j);
			}
			System.out.println("");
		}
	}

}
