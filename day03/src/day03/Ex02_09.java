package day03;

public class Ex02_09 {

	public static void main(String[] args) {
		int a = 3, b = 5;
		System.out.println("�� ���� ���� " + ((a>b)?(a-b):(b-a)));
		if (a>b) {
			System.out.println("�� ���� ���� " + (a-b));
		}else if(a == b) {
			System.out.println("�� ���� �����ϴ�");
		}else {
			System.out.println("�� ���� ���� " + (b-a));
		}
		
	}

}
