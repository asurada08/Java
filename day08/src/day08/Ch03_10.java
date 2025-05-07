//한 회사의 지난 3년간 분기별 매출의 총액과 연평균 매출을 구하는 프로그램을 작성하시오. 
package day08;

public class Ch03_10 {

	public static void main(String[] args) {
		int iArr[][] = { { 90, 90, 110, 110 }, { 120, 110, 100, 110 }, { 120, 140, 130, 150 } };
		double sum = 0;
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				sum += iArr[i][j];
			}
		}
		System.out.printf("지난 3년간 매출 총액 %.1f, 연 평균매출 %.1f 입니다", sum, (sum / iArr.length));
	}

}