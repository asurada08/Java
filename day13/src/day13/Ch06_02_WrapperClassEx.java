package day13;

public class Ch06_02_WrapperClassEx {

	public static void main(String[] args) {
		Integer i = new Integer(10);//기본형을 객체로 변환 / 굳이 이렇게 하지마라 경고뜸
		char c = '4';
		Double d = new Double(3.1234566);//기본형을 객체로 변환 / 굳이 이렇게 하지마라 경고뜸
		System.out.println(Character.toLowerCase('A'));//a 소문자로 변환
		if(Character.isDigit(c)) {
			System.out.println(Character.getNumericValue(c));
		}
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.toHexString(28));
		System.out.println(i.doubleValue());
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("44.13e-6"));
	}

}
/*
Wrapper 클래스 용도 :
기본 데이터 타입을 사용할 수 없고 객체만 사용하는 컬렉션에 
기본 데이터 타입을 Wrapper 클래스로 만들어서 사용

컬렉션 : 데이터의 집합, 그룹을 의미
Collection 인터페이스는 List, Set, Queue로 크게 3가지 상위 인터페이스로 분류할 수 있다.

Wrapper 클래스 생성 :
기본 데이터 값을 인자로 Wrapper 클래스 생성자 호출
ex) Integer i = new Integer(10);
데이터 값을 나타네는 문자열을 생성자 인자로 사용(Boolean, short, byte, integer, long, double, float 경우)
ex) Boolean b = new Boolean("false")
float는 double 타입의 값을 생성자의 인자로 사용
ex) Float f = new Float((double)3.14);

가장 많이 사용하는 Integer 클래스의 주요 메소드
메소드										설명
static int bitCount(int i)					이진수 표현에서 1을 개수를 반환
float floatValue()							float 타입으로 변환된 값 반환
int intValue()								int 타입으로 변환된 값 반환
long longValue()							long 타입으로 변환된 값 반환
short shortValue()							short 타입으로 변환된 값 반환
static int parseInt(String s)				스트링을 10진 정수로 변환된 값 반환
static int parseInt(String s, int radix)	스트링을 지정된 진법의 정수로 변환된 값 반환
static Sting toBinaryString(int i)			이진수 표현으로 변환된 스트링 반환
static Sting toHexString(int i)				16진수 표현으로 변환된 스트링 반환
static Sting toOctalString(int i)			8진수 표현으로 변환된 스트링 반환
static Sting toString(int i)				정수를 스트링으로 변환하여 반환

Wrapper 객체로부터 기본 데이터 타입 알아내기
Integer i = new Integer(10);
int ii = i.intValue();//ii=10
Character c = new Character('c');
char cc = c.charValue();//c='c'

문자열을 기본 데이터 타입으로 변환
int i = Integer.parseInt("123")// i = 123
Boolean b =Boolean.parseBoolean("true") // b=true

기본 데이터 타입을 문자열로 변환
String s1 = Integer.toString(123); // 정수 123을 문자열 “123” 으로 변환
String s2 = Integer.toHexString(123); // 정수 123을 16진수의 문자열 “7b”로 변환
String s3 = Float.toString(3.141592f); // 실수 3.141592를 문자열 “3.141592”로 변환
String s4 = Charater.toString( a ); // 문자 ‘a’를 문자열 “a”로 변환
String s5 = Boolean.toString(true); // 불린 값 true를 문자열 “true”로 변환

Wrapper Class : 기본형을 객체로, 객체를 기본형으로 변환하는 클래스들
1. 기본형을 객체로 변환할때		: 기본형클래스 객체명 = new 기본형클래스(기본값);
2. 기본형으로 변환할때			: 기본형 변수 = 객체명.기본형Value();
3. 스트링을 기본형으로 변환할때 	: 기본형 변수 = 기본형 클래스.parse기본형("스트링");
4. 기본형을 스트링으로 변환할때	: String 변수 = 기본형클래스.toString();
5. 객체로 변환					: 기본형클래스 = 기본형클래스.valueOf(숫자 또는 스트링);

*/