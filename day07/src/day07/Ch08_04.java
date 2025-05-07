package day07;

public class Ch08_04 {

	public static void main(String[] args) {
		int aa[] = { 100, 200, 300, 400, 0 };
		int bb[] = new int[] { 100, 200, 300 };
		int cc[];
		cc = new int[] { 100, 200 };
		int[] dd = new int[1];
		dd[0] = 100;
		for (int i = 0; i < aa.length; i++) {
			System.out.printf("aa[%d] ==> %d\t", i, aa[i]);
		}
		System.out.println("");
		for (int i = 0; i < bb.length; i++) {
			System.out.printf("bb[%d] ==> %d\t", i, bb[i]);
		}
		System.out.println("");
		for (int i = 0; i < cc.length; i++) {
			System.out.printf("cc[%d] ==> %d\t", i, cc[i]);
		}
		System.out.println("");
		for (int i = 0; i < dd.length; i++) {
			System.out.printf("dd[%d] ==> %d\t", i, dd[i]);
		}
		System.out.println("");
	}

}
