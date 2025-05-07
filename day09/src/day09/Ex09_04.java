package day09;
import java.util.Scanner;
public class Ex09_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = scan.nextLine();
		System.out.println("출력 문자열 : "+str);
		
		System.out.print("처음 나오는 Java 위치 : ");
		System.out.println(str.indexOf("Java"));
		System.out.print("마지막에 나오는 Java 위치 : ");
		System.out.println(str.lastIndexOf("Java"));
		scan.close();
	}

}
