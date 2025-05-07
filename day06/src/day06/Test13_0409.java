package day06;
//입력 : 홍길동 90 80 70
//출력
//이름 : 홍길동
//총점 : 240
import java.util.Scanner;
public class Test13_0409 {

	public static void main(String[] args) {
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 국어 수학 영어 입력[공백구분] : ");
		String name = scan.next();
		int kor = scan.nextInt();
		int math = scan.nextInt();
		int eng = scan.nextInt();
		
		sum = kor+math+eng;
		System.out.println("이 름 : "+ name);
		System.out.println("총 점 : "+ sum);
		scan.close();
	}

}
