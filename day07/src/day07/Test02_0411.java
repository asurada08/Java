//char자료형의 배열에 알파벳 대문자를 채우고 채워진 배열의 전체 요소를 
//출력하는 프로그램을 구현한다
//단, char 자료형의 배열을 구성하는 과정에서
//반복문을 통해 초기화 시킬 수 있도록 한다.
//A, B, C, D, ... Z
package day07;

public class Test02_0411 {

	public static void main(String[] args) {
		char ch[] = new char[26];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=(char)(65+i);
			System.out.printf("%c ",ch[i]);
			if((i+1)%5==0) {
				System.out.println("");
			}
		}
	}

}
