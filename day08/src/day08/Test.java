package day08;

public class Test {
	public static String toBinaryString(int value) {
	String str = Integer.toBinaryString(value);
	System.out.println(str);
	while(str.length()<32) {
		str="0"+str;
	}
	return str;
	}

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1+1;
		
		System.out.println(toBinaryString(v1)+"(십진수 : "+v1+" )");
		System.out.println(toBinaryString(v2)+"(십진수 : "+v2+" )");
		System.out.println(toBinaryString(v3)+"(십진수 : "+v3+" )");
		System.out.println("");
		
		int v4=-10;
		int v5=~v4;
		int v6=~v4+1;
		
		System.out.println(toBinaryString(v4)+"(십진수 : "+v4+" )");
		System.out.println(toBinaryString(v5)+"(십진수 : "+v5+" )");
		System.out.println(toBinaryString(v6)+"(십진수 : "+v6+" )");
		System.out.println("");
	}

}
//128(부호)	64	32	16	8	4	2	1
//						1	0	1	0 (10)
