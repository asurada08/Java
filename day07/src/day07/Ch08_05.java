package day07;

public class Ch08_05 {

	public static void main(String[] args) {
		int aa[] = new int[100];
		int[] bb = new int[100];
		System.out.println("aa[i] : ");
		for (int i = 0; i < 100; i++) {
			aa[i] = i * 2;
			System.out.printf("%d ", aa[i]);
			if ((i + 1) % 5 == 0) {
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println("bb[i] : ");
		for (int i = 0; i < 100; i++) {
			bb[i] = aa[99 - i];
			System.out.printf("%d ", bb[i]);
			if ((i + 1) % 5 == 0) {
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.printf("bb[0]는 %d, bb[99]는 %d 입력됨", bb[0], bb[99]);
	}

}
