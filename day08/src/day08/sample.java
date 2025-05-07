package day08;
import java.util.Scanner;
public class sample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		scan.close();
	}

}
/*
  오류인 경우
  1.nextInt()
  2.nextLine()
 -----------------------
  1.next()
  2.nextLine()
  
  오류가 아닌경우
  1.nextLine()
  2.nextInt()
  ----------------------
  1.nextInt()
  2.next()
  
  - 정수부터 입력 후 문자열 extLine()으로 입력 받으려면 문장으로 입력 받아 
  	형 변환해 사용해야 에러가 없다
  	ex) int i = Integer.parseInt(스캔.nextLine())
  		String s = 스캔.nextLine()
  
  
 
 */