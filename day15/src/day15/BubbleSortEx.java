package day15;

public class BubbleSortEx {

	public static void main(String[] args) {
		int[] a = { 9, 6, 7, 3, 5 };
		int i, j, temp;

		System.out.println("오름차순");
		System.out.print("Source Data : ");
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println("");
		for (i = 0; i < a.length - 1; i++) {
			for (j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.print("Sorted Data : ");
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println("\n내림차순");
		System.out.print("Source Data : ");
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println("");
		for (i = a.length - 1; i > 0; i--) {
			for (j = 0; j < i; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.print("Sorted Data : ");
		for (int n : a) {
			System.out.print(n + " ");
		}
		
		
	}

}
/*
버블정렬(Bubble Sort)
서로 이웃한 값들을 차례대로 비교하여 기준값(j)이 비교값(j+1)보다 크면 값을 교환
뒤에서 부터 정렬됨


*/
