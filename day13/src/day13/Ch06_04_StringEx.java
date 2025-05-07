package day13;

import java.text.DecimalFormat;

/*
스트링 리터널과 new String()에 의해 생성된 스티링 객체는 자바에서 서로 다르게 다루어진다
스트링 리터널은 자바 내부에서 리터널 테이블로 특별히 관리하고,
동일한 스트링 리터널은 공유해서 사용한다
new String()으로 생성된 스트링은 new를 이용하여 생성되어 
다른 객체와 동일하게 힙 메모리에 생성된다
*/
public class Ch06_04_StringEx {

	public static void main(String[] args) {
		String a = new String(" abcd");
		String b = new String(",efg");
		System.out.println("변경전 a : " +a.hashCode());
		
		// 문자열 연결
		a = a.concat(b);
		System.out.println("변경후 a : " +a.hashCode());
		System.out.println("a.concat(b) : " + a);
		// 공백 제거
		a = a.trim();
		System.out.println("a.trim() : " + a);
		
		//문자열 대치
		a = a.replace("ab", "12");
		System.out.println("a.replace() : " + a);
		
		//문자열 분리
		String s[] = a.split(",");
		for(int i = 0;i<s.length;i++) {
			System.out.println("분리된 " + i + "번 문자열 : " + s[i]);
		}
		//서브스트링
		a = a.substring(3);
		System.out.println("a.substring(3) : " + a);
		
		//문자열의 문자
		char c = a.charAt(2);
		System.out.println("a.charAt(2) : " + c);
		System.out.println("---------------");
		//문제
		String name = "홍길동";
		//홍길동님 안녕하세요 출력
		name = name.concat("님 안녕하세요");
		System.out.println(name);
		//charAt()을 사용해서 '길'을 출력
		char ch = name.charAt(1);
		System.out.println(ch);
		//홍길동님 안녕하세요 에서 substring()을 사용해서 '홍길동' 출력 
		name = name.substring(0,3);
		System.out.println(name);
		//indexOf() '동'만 출력
		System.out.println(name.indexOf("동"));
		//split() 사용 공백으로 분리해서 for문 돌려 출력
		String[] str = name.split(" ");
		for(int i=0;i<str.length;i++) {
			System.out.println("str["+"]= " + str[i]);
		}
		
		//s1, s2를 비교해서 "같다". "s1 크다", "s2 크다" 중에 하나를 출력하세요
		String s1 = "abc";
		String s2 = "aBC";
		int result = s1.compareTo(s2);
		if(result == 0) {
			System.out.println("같다");
		}else if(result < 0) {
			System.out.println("s2 크다");
		}else {
			System.out.println("s1 크다");
		}
		
		//formet 사용하기
		int n = 123456789;
		System.out.println(n);
		System.out.println("formet 이용해서, 출력하기 = "+String.format("%,d", n));
		DecimalFormat d = new DecimalFormat("####,###.0");//d는 ####,###.0 모양으로 출력해줘
		System.out.println(d.format(22222.123));//22222.123 =>22,222.1 출력됨
	}

}
