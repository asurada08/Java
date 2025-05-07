package Ex03;

public class Ex03_03 {

	public static void main(String[] args) {
		System.out.printf("%d / %d = %f %n", 100, 200, 0.5);
		//서식 지정문자의 갯수와 실제 출력 하려는 값의 수가 같아야함
		//서식 지정문자의 갯수가 > 실제 출력 하려는 값으 갯수 : 에러
		//서식 지정문자의 갯수가 < 실제 출력 하려는 값으 갯수 : 에러는 없지만 값이 출력되지 않음
		System.out.printf("%c %c \n", 'a', 'K');
		System.out.printf("%s %s %n", "IT CookBook", "JAVA");

	}

}
