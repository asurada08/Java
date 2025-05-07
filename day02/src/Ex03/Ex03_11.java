package Ex03;

public class Ex03_11 {

	public static void main(String[] args) {
		int a, b;
		char c, d;
		
		a = 0xF90A;//정수형 변수 a에 16진수 0xF90A 대입 
		b = 0x50;//정수형 변수 b에 16진수 0x50 대입
		System.out.printf("a : %c\n",a);//정수형 변수 a를 문자형으로 출력
		System.out.printf("b : %c\n",b);//정수형 변수 b를 문자형으로 출력
		c = (char)(b+1);//문자형 변수 c에 b+1값을 대입 / int형 b를 강제 캐스팅함
		System.out.printf("c : %c\n",c);//문자형 변수 c를 문자형으로 출력
		d = '#';//문자형 변수 d에 #을 대입
		System.out.printf("%c의 ASCII값은 %d 입니다\n",d ,(int)d);//문자형 변수 d를 두가지 형태로 출력
		
		boolean boo1, boo2;//불린형 변수 2개 선언
		boo1 = true;//boo1 변수에 true를 대입
		System.out.printf("boo1 : %s\n", boo1);//boo1변수 출력
		boo2 = (10 == 20);//boo2 변수에 10과 20을 비교한 결과를 대입
		//비교연산==관계연산==등가연산
		//우선순위 : 1. <, >, <=, >= / 2. ==, != 
		System.out.printf("boo2 : %s\n", boo2);//boo2 변수 출력
		
		String str1 = "IT CookBook 입니다.";//str1 문자열 변수를 선언하고 동시에 값을 입력
		String str2 = "10";//str2문자열 변수를 선언하고 10을 대입
		String str3 = "20";//str3문자열 변수를 선언하고 20을 대입
		
		str1 = "Java 입니다";//str1 문자열 변수에 값을 대입
		
		System.out.printf("str1 : %s\n", str1);//str1을 출력
		System.out.printf("str2+str3 : %s\n", str2+str3);//str2+str3을 출력
		//참조형 - 실행시 힙메모리에 영역확보 : String str1 = new String("10");
		//가장 빈번히 사용하기 때문에 편리하게 쓸 수 있도록 객체 만드는것을 허용함
		
		String str4 = "이    름 :";
		String str5 = "홍길동";
		String str6 = "전화번호 :";
		String str7 = "02-222-3333";
		String str8 = "주    소 :";
		String str9 = "서울 강남구 역삼동";
		System.out.printf("%s %s\n", str4, str5);
		System.out.printf("%s %s\n", str6, str7);
		System.out.printf("%s %s\n", str8, str9);
	}

}
