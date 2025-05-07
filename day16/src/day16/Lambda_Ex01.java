package day16;

interface MyFunction{
	int calc(int x, int y);
}

public class Lambda_Ex01 {
	public static void main(String[] args) {
		MyFunction add = (x, y) -> {return x + y;};
		MyFunction min = (x, y) -> x - y;//return 생략
		
		System.out.println(add.calc(1, 2));//합 구하기
		System.out.println(min.calc(1, 2));//차 구하기
	}
}
/*
람다식 : 일반 함수를 간략하게 쓰기 위해 쓰는 방법
 -> 람다는 이름 없는 함수, 람다식, 람다함수 로 불림.
 ex) (매개변수리스트) -> {함수바디}
 매개변수리스트 : 매개변수가 하나인 경우 괄호 생략가능
 -> : 매개변수를 전달 함수바디에 작성된 코드 실행
 함수바디 : 일반적으로 ({}) 형태 한문장인 경우 중괄호 생략 가능 return 있으면 중괄호 필수
 (int age) -> {System.out.println("나이는 " + age);} 
	or (age) -> {System.out.println("나이는 " + age);} 
 	or age -> System.out.println("나이는 " + age); 
 (int x, int y) -> {System.out.println(x+y);} 매개변수로 두 정수를 받아 함을 출력하는 람다식
 	or (x, y) -> System.out.println(x+y);
 (x, y) -> {retrun x+y;} 리턴이 있으면 중괄호 필수
 (x, y) -> x+y; 리턴도 생략해서 작성 가능
 이런 식으로 표현
*/