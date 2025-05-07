package day12;

public abstract class Ch05_06Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}
/*
추상클래스 필요성 : 
계층적 상속 관계를 갖는 클래스 구조를 만들떄
설계부와 구현부의 분리
 - 부모클래스에서 개념적 특징을 정의(설계부)
 - 자식클래스에서 구체적인 행위 구현(구현부)
추상클래스의 상속 : 
추상클래스를 상속 받아 추상메소드를 구현하지 않으면 서브클래스도 추상클래스가 된다.
서브클래스에서 추상메소드를 구현하면 서브 클래스는 추상클래스가 되지 않음.
*/