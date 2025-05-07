package day07;

public class ArrayBase {

	public static void main(String[] args) {
		boolean boolA[] = new boolean[5];

		byte byteA[] = new byte[5];
		short shortA[] = new short[5];
		char charA[] = new char[5];
		int intA[] = new int[5];
		long longA[] = new long[5];

		float floatA[] = new float[5];
		double doubleA[] = new double[5];
		String strA[] = new String[5];
		ArrayBase[] arraybase = new ArrayBase[5];

		// 반복해서 초기값 출력
		for (int i = 0; i < boolA.length; i++) {
			System.out.print("boolean = " + boolA[i] + " ");
		}
		System.out.println("");
		System.out.println("for-each");
		
		for (boolean i : boolA) {
			System.out.print("boolean = " + i +" ");
		}
		System.out.println("");
		for (int i = 0; i < byteA.length; i++) {
			System.out.print("byte= " + byteA[i] + ", ");
		}
		System.out.println("");
		for (int i = 0; i < charA.length; i++) {
			System.out.print("char= " + charA[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < shortA.length; i++) {
			System.out.print("short= " + shortA[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < intA.length; i++) {
			System.out.print("int= " + intA[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < longA.length; i++) {
			System.out.print("long= " + longA[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < floatA.length; i++) {
			System.out.print("float= " + floatA[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < doubleA.length; i++) {
			System.out.print("double= " + doubleA[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < strA.length; i++) {
			System.out.print("String= " + strA[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < arraybase.length; i++) {
			System.out.print("ArrayBase= " + arraybase[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < intA.length; i++) {
			System.out.printf("int[%d]=%d ", i, intA[i]);
		}
		System.out.println("");
		System.out.println("for-each");
		int index=0;
		int intArr[]= {1, 2, 3, 4, 5};
		for(int i : intArr) {
			System.out.printf("int[%d]=%d ", index++, i);
		}
	}

}
