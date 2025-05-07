package day12;

class Person2 {
}

class Student2 extends Person2 {
}

class Researcher2 extends Person2 {
}

class Professor2 extends Researcher2 {
}

public class Ch05_03InstanceofEx {

	public static void main(String[] args) {
		Person2 jee = new Student2();//업캐스팅
		Person2 kim = new Professor2();//업캐스팅
		Person2 lee = new Researcher2();//업캐스팅
		// 객체 instanceof 클래스 타입 / 클래스로 부터 만들어진 객체이면 true
		if (jee instanceof Student2) {// jee는 Student2 타입으로 true
			System.out.println("jee는 Student2 타입");
		}
		if (jee instanceof Researcher2) {// jee는 Researcher 타입이 아니므로 false
			System.out.println("jee는 Researcher2 타입");
		}
		if (kim instanceof Student2) { // kim은 Student 타입이 아니므로 false
			System.out.println("kim은 Student2 타입");
		}
		if (kim instanceof Professor2) { // kim은 Professor 타입이므로 true
			System.out.println("kim은 Professor2 타입");
		}
		if (kim instanceof Researcher2) { // kim은 Researcher 타입이기도 하므로 true
			System.out.println("kim은 Researcher2 타입");
		}
		if (kim instanceof Person2) { // kim은 Person 타입이기도 하므로 true
			System.out.println("kim은 Person2 타입");
		}
		if (lee instanceof Professor2) { // lee는 Professor 타입이 아니므로 false
			System.out.println("lee는 Professor2 타입");
		}
		if ("java" instanceof String) { // "java"는 String 타입의 인스턴스이므로 true
			System.out.println("\"java\"는 String 타입");
		}
		// 다형성
		aa(jee);// Person2 = jee(jee=new Student2()); 과 같다
		aa(kim);
		aa(lee);

	};// main

	public static void aa(Person2 p) {//부모타입으로 객체를 받아 옴
		if (p instanceof Student2) {
			System.out.println("p는 Student2 타입");
			Student2 s = (Student2) p;// 다운캐스팅
		} else if (p instanceof Professor2) {
			System.out.println("p는 Professor2 타입");
			Professor2 s = (Professor2) p;// 다운캐스팅
		} else {
			System.out.println("p는 Researcher2 타입");
			Researcher2 s = (Researcher2) p;// 다운캐스팅
		}

	}

}
//instanceof boolean형 객체 타입을 구별