//1. 패키지=폴더 선언
package jang2;
//2. import
/*3. class 선언
	접근지정자 class 클래스명 {
		//1. 멤버필드 = 멤버변수 = 속성;
		접근지정자 지정자 자료타입 변수명 = 초기값;

		//2. 메소드 선언
		접근지정자 (지정자) 반환형 메소드명
		public void 메소드명() {
			처리문장;
			}
		}*/
public class CircleArea {
	//멤버변수 : 기본 초기값이 있음. 생략해도 됨. 여기에 작성할 상황일때는 작성해야함.
	//클래스가 실행이 되려면 꼭 main()을 찾음 = 프로그램 = 클래스의 시작단
	//class에 final이 들어가면 상속 불가
	//static : 지정어 / 메모리 공유(의미)
	//final : 재할당, 재저장, 재정의 불가
	public static void main(String[] args) {
		final double PI = 3.14;// 원주율을 상수로 선언 / final : 지정어
		double radius = 10;// 원의 반지름
		double circleArea = 0;// 원의 면적

		circleArea = radius * radius * PI;// 원의 면적 계산

		// 원의 면적을 화면에 출력한다
		System.out.print("원의 면적 = ");
		System.out.println(circleArea);
	}
}
// ctrl+shift+c 한줄 주석
// ctrl+shift+/ or ctrl+shift+\ 여러줄 주석
// ctrl+shift+f or ctrl+i 정렬