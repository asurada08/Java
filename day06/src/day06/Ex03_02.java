package day06;
//do-while문을 이용하여 a’부터 z’까지 출력하는 프로그램을 작성하시오.
public class Ex03_02 {

	public static void main(String[] args) {
		char a='a';
		System.out.println("do-while");
		do {
			System.out.printf("%c ", a);
			a = (char)(a+1);
		}while(a<='z');
		System.out.println("");
		
		System.out.println("for");
		for(a='a';a <= 'z'; a++) {
			System.out.printf("%c ", a);
		}
		System.out.println("");
		
		System.out.println("while");
		a ='a';
		while(a <= 'z') {
			a++;
			System.out.printf("%c ",a-1);
		}
	}

}
