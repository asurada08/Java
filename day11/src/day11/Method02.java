//call by value : 반환형O, 매개변수O 있는 기본값 전달
package day11;
 
import java.util.Scanner;

public class Method02 {
	public static int calc(int a, char b, int c) {
		int tot= 0;
		switch (b) {
		case '+':
			//System.out.printf("%d + %d = %d\n", a, c, a+c);
			tot = a+c;
			break;
		case '-':
			//System.out.printf("%d - %d = %d\n", a, c, a-c);
			tot = a-c;
			break;
		case '*':
			//System.out.printf("%d * %d = %d\n", a, c, a*c);
			tot = a*c;
			break;
		case '/':
			//System.out.printf("%d / %d = %d\n", a, c, a/c);
			tot=a/c;
			break;
		}
		return tot;
	}

	public static void main(String[] args) {
		int tot=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int a=scan.nextInt();
		System.out.print("+, -, *, / 중에 선택 : ");
		char b = scan.next().charAt(0);
		System.out.print("두번재 숫자 : ");
		int c=scan.nextInt();
		
		tot=calc(a,b,c);
		System.out.println("연산의 결과는 "+ tot);
		scan.close();
	}

}
