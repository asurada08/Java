package day15;

public class SelectSortEx {

	public static void main(String[] args) {
		int[] a = {52, 42 ,12, 62, 50};
		int i, j, temp;
		System.out.println("오름차순");
		System.out.print("Source Data : ");
		for(int n : a) {
			System.out.print(n + " ");
		}
		System.out.println("");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				if(a[i]>a[j]) {//오름차순 : 작은값에서 점점 더 큰값으로
					//자리 바꾸기 swapping
					temp = a[i]; //a[i]=a[i]^a[j];
					a[i] = a[j]; //a[j]=a[i]^a[j];
					a[j] = temp; //a[i]=a[i]^a[j];
				}
			}
		}
		System.out.print("Sorted Data : ");
		for (int n : a) {
			System.out.print(n + " ");
		}
		
		System.out.print("\n내림차순");
		System.out.print("\nSource Data : ");
		for(int n : a) {
			System.out.print(n + " ");
		}
		System.out.println("");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				if(a[i]<a[j]) {//오름차순 : 작은값에서 점점 더 큰값으로
					//자리 바꾸기 swapping
					temp = a[i]; //a[i]=a[i]^a[j];
					a[i] = a[j]; //a[j]=a[i]^a[j];
					a[j] = temp; //a[i]=a[i]^a[j];
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
정렬 : 데이터를 순서대로 나열(오름차순, 내림차순)
정렬의 목적 : 가독성을 높이기 위함 -> 보기 좋게 검색하기 위함
정렬의 종류 : 선택정렬, 버블정렬, 삽입정렬, 힙정렬, 쉘정렬...
[결과]
Source Data : 52 42 12 62 50 
Sorted Data : 12 42 50 52 62
*/