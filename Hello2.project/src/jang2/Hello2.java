package jang2;

public class Hello2 {
	// sum() �޼ҵ� �ۼ� //�޼ҵ� ���� == �޼ҵ� ����
	public static int sum(int n, int m) {
		return n + m;
	}

	// main() �޼ҵ忡�� ���� ����
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i , 10);//sum() �޼ҵ� ȣ��
		a = '?';//���� ���ڴ� '' / ���ڿ��� "" ���
		System.out.println(a);//���� '?' ȭ�� ���
		System.out.println("Hello2");//"Hello2"���ڿ� ȭ�� ��� 
		System.out.println(s);//���� s �� ȭ�� ���
	}
}
