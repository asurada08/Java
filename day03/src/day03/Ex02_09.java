package day03;

public class Ex02_09 {

	public static void main(String[] args) {
		int a = 3, b = 5;
		System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));
		if (a>b) {
			System.out.println("두 수의 차는 " + (a-b));
		}else if(a == b) {
			System.out.println("두 수는 같습니다");
		}else {
			System.out.println("두 수의 차는 " + (b-a));
		}
		
	}

}
