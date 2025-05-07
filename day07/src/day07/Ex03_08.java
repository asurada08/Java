//배열의 length 필드를 이용하여 배열 크기만큼 키보드에서 정수를 입력 받고 평균을 구하는 프로그램을 작성하시오
package day07;

import java.util.Scanner;

public class Ex03_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1�� ���
		int intArray[]; // ����
		intArray = new int[5];// ����
		intArray[0] = 100;// �ʱ�ȭ

		// 2�� ���
		// int intArray[]= new int[5];//����, ����
		// intArray[0] = 100;//�ʱ�ȭ

		// 3�� ���
		// int intArray[]; //����
		// intArray = new int[]{10, 20, 30, 40, 50};//�ʱ�ȭ

		// 4�� ���
		// int intArray[]={10, 20, 30, 40, 50}//����, ����, �ʱ�ȭ
		double sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
			sum += intArray[i];
		}
		System.out.print("배열 원소의 평균은 " + sum / intArray.length + "입니다");
		scan.close();
	}

}
/*
 * �⺻�� �迭��(����Ʈ�ʱ�ȭ) : ����(byte, short, int, long)�� 0���� �ʱ�ȭ �Ǽ�(float,
 * double)�� 0.0���� �ʱ�ȭ char�� \u0000(����)���� �ʱ�ȭ ��(boolean)�� false��
 * �ʱ�ȭ ������ �迭��(����Ʈ�ʱ�ȭ) : null�� �ʱ�ȭ
 *
 * �迭 ����, ����, �ʱ�ȭ 1. int a[]; //���� a = new int[ũ��]; //���� a[0] = ��;
 * //�ʱ�ȭ
 *
 * 2. int a[] = new int[ũ��]; //����, ���� a[0] = ��; //�ʱ�ȭ
 *
 * 3. int a[]; //���� a = new int[]{��}; //����, �ʱ�ȭ
 *
 * 4. int a[] = {��}; //����, ����, �ʱ�ȭ
 */
