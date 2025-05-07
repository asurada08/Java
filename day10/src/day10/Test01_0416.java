//1~45중에서 6개를 자동으로 뽑는 프로그램을 완성하시오
//출력 : 
//***로또 추첨을 시작 합니다***
//추첨한 번호는 : 6 7 29 39 16 35(랜덤이라 출력할때 마다 바뀜)
package day10;

public class Test01_0416 {

	public static void main(String[] args) {
		int[] ran = new int[6];
		System.out.println("*******로또 추첨을 시작 합니다*******");
		System.out.print("이번주 당첨 번호 : ");
		for (int i = 0; i < ran.length; i++) {
			ran[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (ran[i] == ran[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < ran.length; i++) {
			System.out.printf("%d ", ran[i]);
		}
	}
}