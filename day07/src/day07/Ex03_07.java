//키보드에서 입력 받은 정수 5개를 배열에 저장하고 제일 큰 수를 화면에 출력하는 프로그램을 작성하시오.  
package day07;

import java.util.Scanner;

public class Ex03_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[5];
		int max, min, sum, avg; 
		max = sum = avg = 0;
		min = 999;
		System.out.println("정수 5개 입력하세요");
		for (int i = 0; i < 5; i++) {
			intArray[i] = scan.nextInt();
			System.out.println("intArray[i] 는 : "+intArray[i]+" ");
			sum += intArray[i];
			if (intArray[i] > max) {
				max = intArray[i];
			}
			if(intArray[i]<min) {
				min = intArray[i];
			}
		}
		avg = sum/intArray.length;
		System.out.print("입력된 수에서 가장 큰 수는 " + max + "입니다\n");
		System.out.print("입력된 수에서 가장 작은 수는" + min + "입니다\n");
		System.out.print("입력된 수의 합은 "+sum+"입니다\n");
		System.out.print("입력된 수의 평균은 "+avg+"입니다\n");
		scan.close();
	}

}
