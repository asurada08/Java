//추상클래스, 객체생성 못한다. 
//자식이 추상메소드를 재정의 해야 자식을 통해 객체 생성할 수 있다.
package day12;

abstract class DObject1{
	public DObject1 next;
	
	public DObject1() {
		next = null;
	}//추상메소드 선언() body가 없다 == 구현부가 없다
	abstract public void draw(); //추상 메소드 선언
		
	}

public class Ch05_AbstractError extends DObject1 {//상속을 하고 자식이 객체 생성을 해야함.
	
	public static void main(String[] args) {
		//DObject1 obj;
		//obj = new DObject1(); 
		//컴파일 오류, 추상 클래스 DObject의 인스턴스를 생성할 수 없다.
		//재정의를 통해 에러를 벗어남
		Ch05_AbstractError obj = new Ch05_AbstractError();
		obj.draw();
	}
	@Override
	public void draw() {
		System.out.println("재정의 했음...");
		
	}

}
