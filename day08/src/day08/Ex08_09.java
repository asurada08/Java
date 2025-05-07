package day08;

import java.util.Scanner;

public class Ex08_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, col;
		System.out.print("행의 갯수 : ");
		row = scan.nextInt();
		System.out.print("열의 갯수 : ");
		col = scan.nextInt();
		int aa[][] = new int[row][col];
		System.out.printf("aa[0][0]부터 aa[%d][%d]까지 출력\n", row, col);
		int cnt=1;
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {
				aa[i][j]=cnt;
				cnt++;
				System.out.printf("%3d", aa[i][j]);
			}
			System.out.println("");
		}
		System.out.println("for-each");
		cnt=1;
		for(int i[] : aa) {
			for(int j:i) {
				j=cnt++;
				System.out.printf("%3d",j);
			}
			System.out.println("");
		}
		scan.close();
	}

}