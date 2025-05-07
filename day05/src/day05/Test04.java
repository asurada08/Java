//키보드로 3개 수를 입력받고 100~200사이의 수를 입력받아 4의배수(입력받은 배수)를 
//압력받아 합을 구하시오

package day05;
import java.util.Scanner;
public class Test04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, x, sum, i;
		sum = 0;
		
		System.out.println("100~200 사이의 수를 입력하세요");
		System.out.print("합계의 시작값 : ");
		num1 = scan.nextInt();
		System.out.print("합계의 끝값 : ");
		num2 = scan.nextInt();
		System.out.print("배수 : ");
		x = scan.nextInt();
		
		for(i=num1; i<=num2; i++) {
			if (num1 >= 100 || num1 <= 200 || num2 >= 100 || num2 <= 200) {
				System.out.println("100 ~ 200 사이의 수를 입력하세요");
				break;
			}
			if(i % x != 0) {
				continue;
			}
			sum += i;
		}
		System.out.printf("%d 부터 %d 까지 %d 배수의 합은 : %d\n", num1, num2, x, sum);
		scan.close();
		
	}

}
