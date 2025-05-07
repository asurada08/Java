package Ex03;

public class Ex02_02 {

	public static void main(String[] args) {
		byte b = 127;//-128 ~ 127
		int i = 100;
		byte c = (byte)(127+1);
		System.out.println(c);
		
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);
		System.out.println((byte)(b+i));//127+100=227
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
		//정수%정수 -> 정수(나머지)
		//제수%피제수 -> 전부 정수여야함.
		//정수/정수 -> 정수(몫)
		//실수/정수 -> 실수
	}
}
