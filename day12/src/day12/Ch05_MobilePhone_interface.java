package day12;

public interface Ch05_MobilePhone_interface {
	public boolean sendCall();
	public boolean receiveCall();
	public boolean sendSMS();
	public boolean receiveSMS();
}
/*
추상 클래스 : 
일반 메소드 포함 가능
상수, 변수 포함 가능
모든 서브 클래스에 공통된 메소드가 있는 경우는 추상 클래스가 적합

인터페이스 :
모든 메소드가 추상 메소드
상수만 포함 가능
다중 상속 지원
*/