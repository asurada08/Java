package day04;

public class Ch04_08 {

	public static void main(String[] args) {
		byte a = 'A', b;
		byte mask = 0x0f; // 마스크값(00001111) 설정
		System.out.printf("%X & %X = %X\n", a, mask, a&mask);
		System.out.printf("%X | %X = %X\n", a, mask, a|mask);
		
		mask = 'a'-'A'; // a와 A의 차는 32(32를 mask에 넣음) 
		b = (byte)(a^mask);//A^32 = a
		System.out.printf("%c ^ %d = %c\n", a, mask, b);
		a = (byte)(b^mask);//a^32 = A
		System.out.printf("%c ^ %d = %c\n", b, mask, a);
	}

}
