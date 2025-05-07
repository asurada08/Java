//임의의 숫자가 들어있는 배열의 숫자 데이터들 중 짝수인 요소, 3의 배수인 요소만 골라서
//출력하는 프로그램을 구현한다.
//배열을 구성하는 임의의 숫자 = 4 7 9 1 3 2 5 6 8
package day07;

public class Test01_0411 {

	public static void main(String[] args) {
		int iArr[] = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };
		System.out.print("배열요소 : ");
		for (int i = 0; i < iArr.length; i++) {
			System.out.printf("%d ", iArr[i]);
		}
		System.out.println("");
		System.out.print("짝수요소 : ");
		for (int i = 0; i < iArr.length; i++) {
			if((iArr[i]%2)==0) {
				System.out.printf("%d ",iArr[i]);
			}
		}
		System.out.println("");
		System.out.print("3의배수요소 : ");
		for (int i = 0; i < iArr.length; i++) {
			if((iArr[i]%3)==0) {
				System.out.printf("%d ",iArr[i]);
			}
		}
	}

}
