/*
StringBuffer는 String 객체가 한번 만들어진 문자열을 수정 할 수 없는 것과 달리
StringBuffer객체는 내부에 문자열을 저장하는 가변크기의 버퍼를 갖고 있는점이 다르다
내부에 문자열을 저장하는 크기의 버퍼를 갖고 있기 때문에 생성 후 문자열 값을 바꿀 수 있다
내부 버퍼의 크기는 자동 조절된다(기본 16바이트)
간단한 문자열은 String 사용.
긴 문자열이나, 문자열 작업이 많으면 StringBuffer 사용
StringBuffer : 동기화 지원(O), 안정적인 값 보장, 속도 떨어짐
StringBuilder : 동기화 지원 (X), 안정적이지 않다, 속도 빠름
 */
package day13;

public class Ch06_05_StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode());
		sb.append(" is pencil");//문자열 덧붙이기
		System.out.println(sb);
		
		sb.insert(7, " my");//문자열 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your");//문자열 대치
		System.out.println(sb);
		
		sb.setLength(5);//스트링 버퍼 내 문자열 길이 설정
		System.out.println(sb);
		System.out.println(sb.hashCode());
		//주소값이 달라지지 않게 하기 위해 StringBuffer 사용
	}

}
/*
StringBuffer 클래스
java.lang.StringBuffer
스트링과 달리 객체 생성 후 스트링 값 변경 가능
append와 insert 메소드를 통해 스트링 조작
StringBuffer 객체의 크기는 스트링 길이에 따라 가변적
생성자 : StringBuffer sb = new StringBuffer("java");
*/