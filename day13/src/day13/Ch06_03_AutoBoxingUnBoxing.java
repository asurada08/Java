package day13;

public class Ch06_03_AutoBoxingUnBoxing {

	public static void main(String[] args) {
		int i = 10;
		Integer intObject = i;// auto boxing
		System.out.println("intObject = " + intObject);

		i = intObject + 10;// auto unboxing
		System.out.println("i = " + i);
		
		//WrapperClass로 변환
		i = 10;
		Integer i1 = new Integer(i);
		System.out.println("i1 = "+i1.intValue());
		
		i=i1+10;
		System.out.println("i = "+i);
		
	}

}
/*
Boxing unBoxing
박싱 : 기본 데이터 타입을 Wrapper 클래스 객체로 변환
언박싱 : Wrapper 클래스 객체를 기본 데이터 타입으로 변환
AutoBoxingUnBoxing
자동 박싱 : 기본타입의 값을 자동으로 Wrapper 객체로 변환
자동 언박싱 : Wrapper 객체를 자동으로 기본타입 값으로 변환 
*/