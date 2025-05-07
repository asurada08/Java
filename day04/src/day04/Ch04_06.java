package day04;

public class Ch04_06 {

	public static void main(String[] args) {
		int num1 = 100, num2 = -200;
		boolean a = (num1 != 0); //100 != 0 = t
		boolean b = (num2 != 0); //-200 != 0 = t
		
		System.out.printf("상수의 AND 연산 : %s\n", a&&b);//t && t = t
		System.out.printf("상수의 OR 연산 : %s\n", a||b);//t || t = t
		System.out.printf("상수의 NOT 연산 : %s\n", !a); //!t = f
	}

}
