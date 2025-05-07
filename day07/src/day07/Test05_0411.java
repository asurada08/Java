package day07;

public class Test05_0411 {

	public static void main(String[] args) {
		int month[][] = new int[5][7];
		int day = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				month[i][j] = day;
				day++;
			}
		}
		System.out.println("\t\t  4월");
		System.out.print(" ");
		String week[] = { "일", "월", "화", "수", "목", "금", "토" };
		for (String s : week) {
			System.out.printf("%4s", s);
		}
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.printf("%5d", month[i][j]);
			}
			System.out.println("");
		}
	}
}
