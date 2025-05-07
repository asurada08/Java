package day12;
class Person3{
	String phone;
	public void setPhone(String phone) {
		this.phone = phone+" 부모";
	}
	public String getPhone() {
		return phone;
	}
}
class Professor extends Person3{
	public String getPhone() {
		return "professor : "+ super.getPhone();
	}
	@Override
	public void setPhone(String phone) {
		this.phone=phone+" 자식";
	}
}
public class Ch05_05 {

	public static void main(String[] args) {
		Professor a = new Professor();
		a.setPhone("010-1234-5678");
		System.out.println("a.getPhone : "+a.getPhone());
		//super.getPhone()은 아래 p,getPhone()과 달리 동적바인딩이 일어나지 않는다
		Person3 p = a;//업캐스팅 자식껄 호출한다.
		System.out.println("p.getPhone : "+p.getPhone());
		//동적바인딩에 의헤 professor의 getPhone() 호출 
	}

}
/*
메소드 오버로딩 :		같은 클래스나 상속 관계에서 동일한 이름의 메소드 중복 작성
				 	동일한 클래스 내 또는 상속관계에서 사용가능
				 	이름이 같은 여러 개의 메소드를 중복 정의하여 사용의 편리성을 향상(목적)
				 	메소드 이름은 반드시 동일함. 메소드의 인자의 개수나 인자의 타입이 달라야 성립(조건)
				 	정적 바인딩. 컴파일 시에 중복된 메소드 중 호출되는 메소드 결정(바인딩)
메소드 오버라이딩 : 	서브 클래스에서 슈퍼 클래스에 있는 메소드와 동일한 이름의 메소드 재작성
					상속관계에서만 사용 가능
					슈퍼 클래스에 구현된 메소드를 무시하고 서브 클래스에서 새로운 기능의 메소드를 재정의 하고자 함(목적)
					메소드의 이름, 인자의 타입, 인자의 개수, 인자의 리턴 타입 등이 모두 동일하여야 성립(조건)
					동적 바인딩. 실행 시간에 오버라이딩된 메소드 찾아 호출(바인딩)
*/