package day04;

public class Ch06_01 {

	public static void main(String[] args) {
		int i;
		System.out.println("for");
		for (i = 1; i <= 5; i++) {
			System.out.print(i + "번 " + "안녕하세요? 빙글빙글 for 문을 공부중입니다~ \n");
		}
		System.out.println("while");
		int j = 1;
		while (j <= 5) {
			System.out.print(j + "번 " + "안녕하세요? 빙글빙글 while 문을 공부중입니다~ \n");
			j++;
		}
		System.out.println("do-while");
		int k = 1;
		do {
			System.out.print(k + "번 " + "안녕하세요? 빙글빙글 do-while 문을 공부중입니다~ \n");
			k++;
		} while (k <= 5);

	}

}
