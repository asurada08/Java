package day06;

public class Test01_0409 {

	public static void main(String[] args) {
		int i;
		System.out.println("\t4월\t");
		System.out.println("  일 월 화 수 목 금 토 ");
		for (i = 2; i <= 31; i++) {
			if (i < 3) {
				System.out.print("   ");
			}
			System.out.printf("%3d", i - 1);
			if (i % 7 == 0) {
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("\t4월\t");
		System.out.println("  일 월 화 수 목 금 토 ");
		i = 2;
		while (i <= 31) {
			if (i < 3) {
				System.out.print("   ");
			}
			System.out.printf("%3d", i - 1);
			if (i % 7 == 0) {
				System.out.println("");
			}
			i++;
		}
		System.out.println("");
		System.out.println("");
		System.out.println("\t4월\t");
		System.out.println("  일 월 화 수 목 금 토 ");
		i = 2;
		do {
			if (i < 3) {
				System.out.print("   ");
			}
			System.out.printf("%3d", i - 1);
			if (i % 7 == 0) {
				System.out.println("");
			}
			i++;
		}while(i <= 31);
	}
}
