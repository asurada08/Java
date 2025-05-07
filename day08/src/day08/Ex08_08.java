package day08;

public class Ex08_08 {

	public static void main(String[] args) {
		int[][] aa = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		System.out.println("aa[0][0]부터 aa[2][3]까지 출력(for)");
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {
				System.out.printf("%3d", aa[i][j]);
			}
			System.out.println("");
		}
		System.out.println("aa[0][0]부터 aa[2][3]까지 출력(for-each)");
		int row=0, col=0, n=1;
		for (int i[] : aa) {//행의 시작주소 저장
			col=0;//행이 변경되면 열 초기화
			for(int j:i) {//해당 행중에서 열에 값 저장 [0,0][0,1][0,2][0,3]...[2,3]
				j=n++;//aa[row][col]=n++;
				System.out.printf("aa[%d][%d] = %2d ", row, col, j);
				col++;
			}
			row++;
			System.out.println("");
		}
	}

}
