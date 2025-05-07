package day16;

interface MyFunction3 {//함수형 인터페이스
	void print();//람다식으로 구현할 추상 메소드
}

public class Lambda_Ex03 {

	public static void main(String[] args) {
		MyFunction3 f = () -> {//람다식 작성
			System.out.println("hello");
		};
		
		f.print();//람다식 호출
		
		f = () -> System.out.println("안녕"); //람다식 작성
		
		f.print();//람다식 호출
	}

}
