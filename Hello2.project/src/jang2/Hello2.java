package jang2;

public class Hello2 {
	// sum() 메소드 작성 //메소드 정의 == 메소드 원형
	public static int sum(int n, int m) {
		return n + m;
	}

	// main() 메소드에서 실행 시작
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i , 10);//sum() 메소드 호출
		a = '?';//단일 문자는 '' / 문자열은 "" 사용
		System.out.println(a);//문자 '?' 화면 출력
		System.out.println("Hello2");//"Hello2"문자열 화면 출력 
		System.out.println(s);//정수 s 값 화면 출력
	}
}
