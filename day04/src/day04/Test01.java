package day04;

public class Test01 {
//값 바꾸기=swap
//빈컵=z 콜라=x 사이다=y x, y 값을 바꿔라
//^를 써서 x, y 값 바꿔라
	public static void main(String[] args) {
		int x = 2, y = 3, z;
		System.out.printf("초기값 : x=%d, y=%d\n", x, y);
		
		z=x;
		x=y;
		y=z;
		System.out.printf("바꾼후 : x=%d, y=%d\n", x, y);
		
		x = 2;
		y = 3;
		System.out.printf("초기값 : x=%d, y=%d\n", x, y);
		x = x^y;//0010 ^ 0011 = 0001(x)
		y = x^y;//0001 ^ 0011 = 0010(y)
		x = x^y;//0001 ^ 0010 = 0011(x)
		System.out.printf("바꾼후 : x=%d, y=%d\n", x, y);
	}

}
