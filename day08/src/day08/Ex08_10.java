package day08;

public class Ex08_10 {

	public static void main(String[] args) {
		int[][][] aa = { { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } },
				{ { 13, 14, 15, 16 }, { 17, 18, 19, 20 }, { 21, 22, 23, 24 } } };
		int cnt=1;
		System.out.println("for");
		for (int i[][] : aa) {//면
			System.out.printf("%d면\n", cnt++);
			for (int j[] : i) {//각 면.행
				for (int k : j) {//각 면행.열
					System.out.printf("%4d", k);
				}
				System.out.println("");
			}
			System.out.println("");
		}
		System.out.println("for-each");
		for (int i = 0; i < aa.length; i++) {
			System.out.printf("%d면\n",(i+1));
			for (int j = 0; j < aa[i].length; j++) {
				for (int k = 0; k < aa[i][j].length; k++) {
					System.out.printf("%4d", aa[i][j][k]);
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}