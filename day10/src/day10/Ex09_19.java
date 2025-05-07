//스왑한거
package day10;

class myChar {//maChar 클래스 선언
	char x;
	char y;
}

public class Ex09_19 {
	static void func1(char x, char y) {
//		char imsi;
//		imsi = x;
//		x = y;
//		y = imsi;
		// ^사용
		x=(char)(x^y);
		y=(char)(x^y);
		x=(char)(x^y);
	}

	static void func2(myChar ch) {
		char imsi;
		imsi = ch.x;
		ch.x = ch.y;
		ch.y = imsi;
	}

	public static void main(String[] args) {
		char x = 'A', y = 'Z';
		System.out.printf("원래 값 : x=%c, y=%c\n", x, y);//원래 문자 출력
		func1(x, y);//값을 전달하여 func1()메소드를 호출
		System.out.printf("값을 전달한 후 : x=%c, y=%c\n", x, y);//func1()메소드를 호출한 후 문자를 출력
		//call by value

		myChar ch = new myChar();
		ch.x = 'A';
		ch.y = 'Z';
		System.out.printf("원래 값 : x=%c, y=%c\n", ch.x, ch.y);//원래 문자를 출력
		func2(ch);//주소를 전달하여 func2()메소드를 호출
		System.out.printf("주소를 전달 후 : x=%c, y=%c\n", ch.x, ch.y);//func2()메소드를 호출한 후 문자 출력
		//call by address
	}

}
