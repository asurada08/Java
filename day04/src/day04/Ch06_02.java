package day04;

public class Ch06_02 {

	public static void main(String[] args) {
		int i;
		for (i = 5; i > 0; i--) {
			System.out.print(i + "번 " + "안녕하세요? 빙글빙글 for 문을 공부중입니다~\n");
		}
		System.out.println("");
		i = 5;
		while (i > 0) {
			System.out.print(i + "번 " + "안녕하세요? 빙글빙글 while 문을 공부중입니다~ \n");
			i--;
		}
		System.out.println("");
		i = 5;
		do {
			System.out.print(i + "번 " + "안녕하세요? 빙글빙글 do-while 문을 공부중입니다~ \n");
			i--;
		} while (i > 0);

	}

}
