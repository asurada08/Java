//예외 관련
package day08;

public class Ch03_17 {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;

		double z = x / y;
		double z1 = x % y;
		
		System.out.println(z);
		System.out.println(z1);
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z1));
		
		System.out.println(z+2);//연산 안됨 (infinite)
		System.out.println(z1+2);//연산 안됨 (NaN)
		
		if(Double.isInfinite(z)) {
			z=0;
			System.out.println(z+2);
		}
		if(Double.isNaN(z1)) {
			z1=0;
			System.out.println(z1+2);
		}
			
	}

}
