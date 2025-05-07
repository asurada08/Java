package day08;

import java.util.Scanner;

public class TestZ_0412 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, col, cnt;
		System.out.print("행의 갯수 : ");
		row = scan.nextInt();
		System.out.print("열의 갯수 : ");
		col = scan.nextInt();
		int iArr[][] = new int[row][col];
		cnt = 1;
		for (int i = 0; i < iArr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < col; j++) {
					iArr[i][j] = cnt++;
				}
			} else {
				for (int j = col - 1; j >= 0; j--) {
					iArr[i][j] = cnt++;
				}
			}
		}
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%3d", iArr[i][j]);
			}
			System.out.println("");
		}
		scan.close();
	}

}
