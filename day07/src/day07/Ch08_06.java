package day07;

public class Ch08_06 {

	public static void main(String[] args) {
		int aa[] = { 10, 20, 30, 40, 50 };
		int count, size;

		count = aa.length;
		size = count * Integer.BYTES;
		int i = Integer.SIZE;
		int i1 = Integer.MAX_VALUE;
		int i2 = Integer.MIN_VALUE;
		
		System.out.printf("배열 aa[]의 요소의 개수는 \n", count);
		System.out.printf("배열 aa[]의 요소의 전체 크기는\n", size);
		System.out.printf("배열 aa[]의 요소의 사이즈는\n", i);
		System.out.printf("배열 aa[]의 요소의 MAX_VALUE는 %d\n", i1);
		System.out.printf("배열 aa[]의 요소의 MIN_VALUE는 %d\n", i2);

	}

}
