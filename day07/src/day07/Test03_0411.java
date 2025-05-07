//사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아 입력받은 수 중에서
//가장 큰 수를 출력하는 프로그램을 작성한다
//단, 배을 활용하여 구현할 수 잇도록 한다
//입력할 데이터 개수는 9
package day07;

import java.util.Scanner;

public class Test03_0411 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();//배열 크기
		int max = 0;
		int iArr[] = new int[num];
		System.out.printf("임의의 정수 %d개를 입력[공백구분] : ", num);
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = scan.nextInt();
			if (iArr[i] > max) {
				max = iArr[i];
			}
		}
		System.out.printf("가장 큰 수는 : %d", max);
		scan.close();
	}

}
