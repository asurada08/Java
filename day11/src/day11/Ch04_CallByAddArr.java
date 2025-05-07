package day11;

public class Ch04_CallByAddArr {

	static void increase(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
			System.out.print(array[i]+" ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };

		increase(a);//배열의 시작주소 넘김

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
