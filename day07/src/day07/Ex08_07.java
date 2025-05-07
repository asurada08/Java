//드뎌 2차원 배열
package day07;

public class Ex08_07 {

	public static void main(String[] args) {
		int[][] aa = new int[3][4];

		aa[0][0] = 1;
		aa[0][1] = 2;
		aa[0][2] = 3;
		aa[0][3] = 4;
		aa[1][0] = 5;
		aa[1][1] = 6;
		aa[1][2] = 7;
		aa[1][3] = 8;
		aa[2][0] = 9;
		aa[2][1] = 10;
		aa[2][2] = 11;
		aa[2][3] = 12;

		System.out.println("aa[0][0]부터 aa[2][3]까지 출력");

		System.out.printf("%3d %3d %3d %3d\n", aa[0][0], aa[0][1], aa[0][2], aa[0][3]);
		System.out.printf("%3d %3d %3d %3d\n", aa[1][0], aa[1][1], aa[1][2], aa[1][3]);
		System.out.printf("%3d %3d %3d %3d\n", aa[2][0], aa[2][1], aa[2][2], aa[2][3]);

		int bb[][] = new int[3][4];
		int num = 1;
		System.out.println("bb[0][0]부터 bb[2][3]까지 출력");
		for (int i = 0; i < bb.length; i++) {
			for (int j = 0; j < bb[i].length; j++) {
				bb[i][j] = num;
				num++;
				System.out.printf("%3d ", bb[i][j]);
			}
			System.out.println("");
		}
		System.out.println("bb[0][0]부터 bb[2][3]까지 출력(for-each)");
		for(int i[] :bb) {
			for(int j:i) {
				System.out.printf("%3d ",j);
			}
			System.out.println("");
		}

	}

}
