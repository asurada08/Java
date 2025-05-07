/*
추상클래스(abstract)는
선언만있고 정의가 없는 하나 이상의 추상 메소드를 갖는 클래스로 
하위 클래스에서 오버라이딩(Overriding)할 것으로 예상되는
메소드에 대해 메모리 낭비 없이 미리 호출 꼐획을 세워두기 위해 만든다

형식 및 구조
[접근제어지시자]abstract class 클래스명 {
	[접근제어지시자]abstract 자료형 메소드명([매개변수],[...]);
}
특징
클래스가 적어도 하나의 추상 메소드를 포함할 때
그 클래스는 클래스에 앞에 abstract 키워드를 붙여
추상 클래스로 명시해야 하며 추상 클래스로 선언한 경우에는
불완전한 형태의 클래스이므로 객체를 생성할 수 없다
추상메소드가 존재하지 않는 추상 클래스 마저도 객체를 생성할 수 없다
즉 추상 클래스는 독립적으로 존재할 수 없기 때문에
상속을 위해서만 존재하며 추상 클래스에서 상속받은 하위 클래스에서는
반드시 추상 메소드를 오버라이딩(overriding)해야 한다

abstract 키워드는
클래스와 메소드에서만 사용할 수 있으며 멤버 변수나 로컬 변수에서는 사용불가하다  
 */

package day12;

public class Ch05_06GoodCalc extends Ch05_06Calculator {
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	@Override
	public int subtract(int a, int b) {
		return a-b;
	}
	
	@Override
	public double average(int[] a) {
		double sum=0;
		for(int i =0;i<a.length;i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	public static void main(String[] args) {
		Ch05_06Calculator c = new Ch05_06GoodCalc();//자동캐스팅, 업캐스팅
		System.out.println("c.add : "+c.add(2, 3));
		System.out.println("c.add : "+c.subtract(2, 3));
		System.out.println("c.add : "+c.average(new int[] {2,3,4}));
	}

}
