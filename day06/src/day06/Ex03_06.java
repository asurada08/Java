package day06;

import java.util.Scanner;
public class Ex03_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			if (scan.nextInt()==-1)
				break;
			num++;
		}
		System.out.println("�Էµ� ���� ������ " + num);
		scan.close();
	}

}
