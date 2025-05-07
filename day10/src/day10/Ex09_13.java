package day10;
import java.util.Scanner;
public class Ex09_13 {
	//호출 : 클래스명.plus() 또는 plus() : 같은 클래스 내에서만 사용
	static int plus(int v1, int v2) {//클래스 멤버 메소드(정적 메소드)(메모리 공유)
		int result;
		result = v1 + v2;
		return result;
	}
	//호출 : 객체 생성후 호출
	//생성 : 클래스명 객체명 = new  클래스명;
	//사용 : 객체명.메소드명() or 객체명.필드명;
	public int non_plus(int v1, int v2) {//인스턴스 멤버 메소드(동적 메소드)(메모리 공유 불가)
		int result;
		result = v1 + v2;
		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum;
		System.out.print("정수1 : ");
		int num1 = scan.nextInt();
		System.out.print("정수2 : ");
		int num2 = scan.nextInt();
		sum = plus(num1, num2);//스테틱 메소드 일때
		System.out.printf("num1과 num2 plus()메소드 결과 : %d\n", sum);
		
		//객체 생성후 접근, 객체명.메소드명(값, 값);
		Ex09_13 p = new Ex09_13();
		sum = p.non_plus(num1, num2);
		System.out.printf("num1과 num2 plus()메소드 결과 : %d\n", sum);
		scan.close();
	}

}
