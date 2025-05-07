/*
StringTokenizer : 문자열을 분리하기 위해 사용한다
문자를 구분할 때 사용하는 문자를 구분 문자라고 하고,
구분문자로 분리된 문자열을 토큰(token)이라고 한다
StringTokenizer(String str, String delim) >> java.util
String[] split(String regex, int limit) >> java.lang
*/
package day13;
import java.util.StringTokenizer;
public class Ch06_06_StringTokenizer {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
		//"홍길동/장화/홍련/콩쥐/팥쥐"를 '/'구분문자로 하여 분리
		//구분문자가 없으면 공백을 기본으로 한다.
		while(st.hasMoreTokens()) { //st에 토큰이 만큼 while문 반복
			System.out.println(st.nextToken());
		}
	}

}
/*
StringTokenizer 클래스
java.util.StringTokenizer
하나의 스트링을 구분 문자로 분리하여 토큰 형태로 파싱 : 
 스트링을 구분할 때 사용되는 문자들을 구분문자(delimeter)라고 함.
 ex) String query = "name=kitae&addr=seoul&age=21";
	 StringTokenizer st = new StringTokenizer(query, "&");
 위 예시 에는 &가 구분자
토큰 : 구분 문자로 분리된 스트링
String 클래스의 split()메소드를 이용하여 동일한 구현 가능
*/