package day05;

import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		double sum = 0;
		int i=0;
		System.out.println("�� �Է� : ");
		/*while ((i=scan.nextInt())!=0) {
			sum += i;
			n++;
		}
		System.out.println("�Էµ� ���� ������ "+n+"���̸� ����� "+sum/n+"�Դϴ�");*/
		for(i=0;(i=scan.nextInt())!=0;) {
			sum += i;
			n++;
		}
		System.out.println("�Էµ� ���� ������ "+n+"���̸� ����� "+sum/n+"�Դϴ�");
	}

}
