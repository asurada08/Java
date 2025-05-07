package day06;

import java.util.Scanner;

public class Test09_0409 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j, k, l;
		while (true) {
			System.out.print("알파벳을 어디까지 출력할까요 : ");
			char s = scan.next().toLowerCase().charAt(0);
			if (s == '/') {
				System.out.println("종료");
				break;
			}
			if ((s < 'a' && s > 'z') && (s < 'A' && s > 'Z')) {//이거 다시 확인
				System.out.println("정확한 값을 입력하세요");
			}
			k = s - 'a' + 1;
			for (i = 0; i <= k; i++) {
				l = 0;
				for (j = k - i; j > 0; j--) {
					System.out.print((char) ('a' + l));
					l++;
				}
				System.out.println("");
			}
		}
		scan.close();
	}

}
