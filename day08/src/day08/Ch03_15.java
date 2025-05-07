package day08;

//예외 (Exception)
import java.util.Scanner;

public class Ch03_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;

		System.out.print("나뉨수를 입력하시오 : ");
		dividend = scan.nextInt();
		System.out.print("나눗수를 입력하시오 : ");
		divisor = scan.nextInt();

		try {// 예외 검사 후 이상이 없으면 수행
				// 정수 / 0 or 정수 % 0 => 컴파일러 에러 없음. 실행시 에러 ArithmeticException 발생함
				// 정수 / 0.0 => 무한대 ArithmeticException 발생 안함
				// 정수 % 0.0 => NaN(not a number) 나옴 ArithmeticException 발생 안함

			System.out.printf("%d를 %d로 나누면 몫은 %d 입니다\n", dividend, divisor, dividend / divisor);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + "/ 0으로 나누었어요");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			System.out.println("항상수행");
		}
		scan.close();
	}

}
