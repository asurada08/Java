package day11;

public class Ch04_overloading {
	// 메소드 오버로딩(oberloading)==메소드 중복
	// 메소드명이 같아야 하고, 매개변수의 갯수 or 타입이 달라야 한다.
	// 메소드 이름을 기준으로 왼쪽은 무관, 오른쪽은 매개변수의 갯수 or 타입이 달라야 한다.(시그니처)
	// 하나의 메소드명으로 다양한 작업을 할 수 있다. 상속 X
	public int getSum(int i, int j) {
		return i + j;
	}

	public int getSum(int i, int j, int k) {
		return i + j + k;
	}

	public double getSum(double i, double j) {
		return i + j;
	}

	public static void main(String[] args) {
		Ch04_overloading a = new Ch04_overloading();
		int i = a.getSum(10, 5);
		int j = a.getSum(10, 20, 30);
		double k = a.getSum(10.1, 11.1);
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);

	}

}
