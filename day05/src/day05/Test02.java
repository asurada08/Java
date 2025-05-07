package day05;

/*for문과 if문을 사용하여 1~127번 아스키코드의 10진수, 16진주 문자를 출력하시오 
 */


public class Test02 {

	public static void main(String[] args) {
		int i;
		System.out.println("--------------------");
		System.out.println("10진수  16진수  문자");
		System.out.println("--------------------");
		for (i = 0; i <= 127; i++) {
			if (i % 16 == 0) {
			}
			System.out.printf("%5d %5x %5c\n", i, i, i);
		}

	}

}
