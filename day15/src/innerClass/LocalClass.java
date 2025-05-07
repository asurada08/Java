//3.Local class
//외부클래스의 메서드나 초기화블럭 안에 선언하여, 선언된 영역 내부에서만 사용 될 수 있다
package innerClass;

public class LocalClass {//외부 클래스
	int a = 100;

	// 메소드 정의
	public void innerTest(int k) {//메소드 위치에 변수는 final임.
		// final 생략가능(JDK1.8부터 가능해짐, 이전버전은 꼭 final를 써야함)
		int b = 200;// ==final int b = 200;
		final int c = k;
		class localInner {
			// 상수, 전역변수
			// 내부 클래스를 포함한 메서드 내에 정의된 지역변수 접근
			public void getData() {
				System.out.println("int a = " + a);
				// 지역변수 사용할 수 없는데, JDK1.8부터 상수 처리함.
				System.out.println("int b = " + b);
				System.out.println("final int c = " + c);// 재 할당(저장) 불가
				System.out.println("method = " + method());//일반 메소드 호출 가능
			}// getData()
		}// localInner
		localInner i = new localInner();// 로컬의 메서드 접근 위해 객체 생성
		i.getData();
	}// 내부 클래스를 감싼 innerTest()메소드 종료

	public int method() {
		int m = 2;
		return m;
	}

	public static void main(String[] args) {
		LocalClass outer = new LocalClass();// 외부 클래스 객체 생성
		outer.innerTest(1000);// 외부 클래스 메소드 호출
		//1번 처럼 만들면 안됨. 메소드 여서 클래스 객체 생성후 객체를 통해 메소드 접근
	}
}
