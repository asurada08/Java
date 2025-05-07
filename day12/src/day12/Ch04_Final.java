package day12;

//클래스에 final 이 있으면 상속 불가
//public final
class Ch04_Final {// 부모클래스
	// final static String name="홍길동";//고정형 상수화된 변수(상수)
	String name = "홍길동";

	// public final
	void disp() {// 메소드에 final이 있으면 재정의 불가
		System.out.println("출력.....");
	}
}

class DerivedClass extends Ch04_Final {// 자식클래스
	DerivedClass d = new DerivedClass();

	@Override // 컴파일러가 이해하는 주석
	public void disp() {// 재정의 Overriding
		System.out.println("재정의 출력.....");
		d.name = "홍길순";// final이 있는 변수 재할당 불가 = 저장 불가
	}

}
