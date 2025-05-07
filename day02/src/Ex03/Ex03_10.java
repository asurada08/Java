package Ex03;

public class Ex03_10 {

	public static void main(String[] args) {
		char ch = 'a';
		char ch1 = 97;
		System.out.printf("ch : %c\n", ch);
		System.out.printf("ch1 : %c\n", ch1);

		char a, b, c, d, e;// ������ ���� 5�� ����
		//������ �ϰų�, ��ȣ�� ���̸� int�� ��ȯ��
		a = 'A';// ������ ���� a�� A�� ����
		System.out.printf("a : %c\n", a);// ������ ���� a�� ������ ���
		System.out.printf("a : %d\n", (int) a);// ������ ���� a�� ������ ���

		b = 'a';// ������ ���� b�� a�� ����
		c = (char) (b + 1);// ������ ���� b�� 1�� ���Ͽ� ������ ���� c�� ���� ����� char�� ĳ����
		System.out.printf("b : %c\n", b);
		System.out.printf("c : %c\n", c);

		d = 90;// ������ ���� d�� ���� 90�� ����
		System.out.printf("d : %c\n", d);

		d = '가';// ������ ���� d�� ���� ����
		e = (char) (d + 1);// ������ ���� e�� 1�� ���Ͽ� ������ ���� e�� ���� ����� char�� ĳ����
		System.out.printf("d : %c\n", d);
		System.out.printf("d : %d\n", (int) d);
		System.out.printf("e : %c\n", e);
	}

}
