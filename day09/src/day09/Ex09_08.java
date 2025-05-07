package day09;

public class Ex09_08 {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "Java IT CookBook";
		String str3 = "J";
		
		System.out.println("문자열1 : [" + str1 + "]");
		System.out.println("문자열2 : [" + str2 + "]");

		System.out.println(((int)str1.charAt(5)+", "+str1.charAt(5)));//80,p
		System.out.println(((int)str2.charAt(5)+", "+str2.charAt(5)));//73,i
		
		System.out.println(str2.compareTo(str1));//-7 (p==i) 73-80 의미 문자열의길이 차이값 
		System.out.println(str1.compareTo(str2));//7 (i==p) 80-73 의미 문자열의길이 차이값
		System.out.println(str3.compareTo("J"));//0 (J==J)
		
		System.out.println(str1.contains("Java"));//true
		
	}

}
