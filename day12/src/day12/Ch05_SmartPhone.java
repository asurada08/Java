package day12;

public class Ch05_SmartPhone extends Ch05_PDA implements Ch05_MobilePhone_interface, Ch05_MP3_interface {
	
	@Override // PDA
	public int calculater(int x, int y) {
		return x + y;
	}

	public void scheduler() {
		System.out.println("일정관리");
	}

	public void application() {
		System.out.println("응용프로그램 설치/삭제");
	}

	@Override
	public boolean sendCall() {
		System.out.println("전화걸기");
		return false;
	}

	@Override
	public boolean receiveCall() {
		System.out.println("전화받기");
		return false;
	}

	@Override
	public boolean sendSMS() {
		System.out.println("메세지 전송");
		return false;
	}

	@Override
	public boolean receiveSMS() {
		System.out.println("메세지 받기");
		return false;
	}

	@Override
	public void play() {
		System.out.println("재생");
	}

	@Override
	public void stop() {
		System.out.println("정지");
	}

	public static void main(String[] args) {
		Ch05_SmartPhone p = new Ch05_SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.calculater(10, 20));
		p.scheduler();
		p.application();
		p.stop();

	}
}
/*
인터페이스 : 모든 메소드가 추상메소드인 클래그 
인터페이스는 상수와 메소드만 갖고 필드는 없다.
인터페이스 특징 : 메소드 선언에 abstract 키워드 사용하지 않아도 됨
인터페이스의 메소드 속성 - public, static, final으로 가정되므로 키워드 생략 가능
객체 생성 불가
레퍼런스 변수 타입으로 사용가능
인터페이스의 필요성 : 다중상속 구현 가능(클래스는 다중상속 불가)
인터페이스만 정의하고 구현을 분리하여, 작업자가 다양한 구현을 할 수 있음
인터페이스 구현 : implements 키워드 사용, 여러개의 인터페이스 동시 구현 가능, 상속과 구현이 동시에 가능
*/
/*
추상클래스 : 일반 메소드 포함 가능, 상수/변수 포함 가능, 모든 서브클래스에 공통된 메소드가 있는 경우 추상클래스가 적합
인터페이스 : 모든 메소드가 추상 메소드, 상수만 포함가능, 다중상속 지원
*/