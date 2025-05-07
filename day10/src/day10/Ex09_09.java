package day10;

public class Ex09_09 {
	public Ex09_09() {
		System.out.println("디폴트 생성자...");// 원래는 이것 조차도 없어야 디폴트 생성자임
	}

	public Ex09_09(String string) {
		System.out.println("매개변수 있는 생성자...");// 원래는 이것 조차도 없어야 디폴트 생성자임
	}

	public static void main(String[] args) {
		// String 클래스는 new 연산자는 무저건 새로운 주소
		// new 연산자가 없고 값(내용)이 같으면 같은주소, 값(내용)이 다르면 다른주소
		// 하나는 new 연산자가 있고, 하나는 new연산자 없을때 값(내용)이 같으면
		// 같은주소(hashcode()) 오버라이딩했기 때문에 같은 주소값으로 나옴 실제 주소값은 다름.
		String str1 = "Java Programming";
		String str2 = "Java Programming";
		String str3 = new String("Java Programming");

		System.out.println("문자열1 : [ " + str1 + " ]");
		System.out.println("문자열2 : [ " + str2 + " ]");
		System.out.println("문자열3 : [ " + str3 + " ]\n");

		System.out.println("str1.hashCode() = " + str1.hashCode());
		System.out.println("str2.hashCode() = " + str2.hashCode());
		System.out.println("str3.hashCode() = " + str3.hashCode() + "\n");
		// 주소가 다르게 나오는게 정상이나 String은 내용이 같으면 오버라이딩해서 같은 주소값이 나옴
		System.out.println("문자열1==문자열2 결과 : " + (str1 == str2));// t
		// 실제 주소같고 hashCode값도 같다 t
		System.out.println("문자열1.equals(문자열2) 결과 : " + str1.equals(str2));// t
		// 내용비교 t
		System.out.println("문자열1==문자열3 결과 : " + (str1 == str3));// f
		// 내용은 같지만 실제 주소가 달라서 f / hashCode 값은 오버라이딩 되서 같게 나온다
		System.out.println("문자열1.equals(문자열3) 결과 : " + str1.equals(str3));// t
		// 주소는 다르지만 내용이 같아서 t

		Ex09_09 ex = new Ex09_09();
		Ex09_09 ex1 = new Ex09_09("ex1객체");
		System.out.println("ex.hashCode() = " + ex.hashCode());
		System.out.println("ex1.hashCode() = " + ex1.hashCode());
		System.out.println("ex == ex1 결과 : " + (ex == ex1)); 
		System.out.println("ex.equals(ex1) 결과 : " + ex.equals(ex1));
	}

}
