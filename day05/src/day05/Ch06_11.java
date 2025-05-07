package day05;

public class Ch06_11 {

	public static void main(String[] args) {
		// 무한루프에 돌게 되는 for문
		// 조건이 없어서 무한루프 돔
		int i;
		i = 0;
		for (;;) {
			System.out.printf("%d \n", i);
			i++;//증감문 생략시 에러는 안뜨지만 i초기값이 계속 찍힘
		}
	}

}
