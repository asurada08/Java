package day12;

class SuperObject {
	protected String name;

	public void paint() {
		draw();
	}

	public void draw() {
		System.out.println("Super Object");
	}
}

public class Ch05_SubObject extends SuperObject {
	@Override
	public void draw() {//동적바딘딩 업캐스팅 했을때만 일어남(상속일때만 일어남)
		System.out.println("Sub Object");
		this.name = "자식...";
		super.name = "부모...";//4행으로
		super.draw();//10행으로
		System.out.println("Sub Draw()..." + name);
	}

	public static void main(String[] args) {
		SuperObject b = new Ch05_SubObject();
		b.paint();

	}

}
/*
super는 서브클래스에서 슈퍼 클래스의 멤버를 접근할 때 사용되는 슈퍼클래스 타입의 레퍼런스.
상속관계에 있는 서브 클래스에서만 사용됨
오버라이딩된 슈퍼 클래스의 메소드 호출 시 사용
*/