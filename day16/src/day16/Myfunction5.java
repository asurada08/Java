package day16;

@FunctionalInterface //annotation을 사용하여 컴파일러에게 함수형 인터페이스를 작성 알림
public interface Myfunction5<T> {// 제네릭 타입 T를 가진 함수형 인터페이스
	void print(T x);// 람다식으로 구현할 추상 메소드
}
