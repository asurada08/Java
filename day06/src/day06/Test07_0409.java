//369�������� �غ���. 1-99������ ������ Ű����κ��� �Է¹ް� ������ 3,6,9�� 
//�ϳ��� �ִ� ��� "�ڼ�¦"�� ����ϰ� �ΰ��� �ִ� ��� "�ڼ�¦¦" �� ����Ͻÿ�. 
//��) Ű����� �Էµ� ���� 13�� ��� --> "�ڼ�¦" 36�� ��� -->  "�ڼ�¦¦"�� ����Ͻÿ�
package day06;

import java.util.Scanner;

public class Test07_0409 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� : 0");
		int a, b, c = 0;
		while (true) {
			int num = 0;
			a = b = c = 0; 
			System.out.print("���ڸ� �Է��ϼ���(1~99����) : ");
			num = scan.nextInt();
			if (num == 0) {
				System.out.println("����");
				break;
			}
			if (num >= 1 && num <= 99) {
				a = num / 10;
				b = num % 10;
				if (a == 3 || a == 6 || a == 9) {
					c++;
				}
				if (b == 3 || b == 6 || b == 9) {
					c++;
				}
				if (c == 2) {
					System.out.println("�ڼ�¦¦");
				} else if (c == 1) {
					System.out.println("�ڼ�¦");
				} else {
					System.out.println("3, 6, 9�� �����");
				}
			} else {
				System.out.println("�Է� ������ ���");
			}

		}
		scan.close();

	}

}
