package day08;

public class Ex08_11 {

	public static void main(String[] args) {
		// 연산의 중간값, 결과값, 되부름함수에서 사용. 한쪽이 막혀있는 구조, 0주소 방식
		// 후입선출법(LIFO)
		// 삽입(push), 삭제(pop)
		char[] stack = new char[5];
		int top = 0;

		if (top >= 5) {
			System.out.println("만차");
		} else {
			// 스택에 자료 삽입(push)
			stack[top] = 'a';// 먼저 자료 저장후 나중에 자리 증가
			System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
			top++;
			stack[top] = 'b';
			System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
			top++;
			stack[top] = 'c';
			System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
			top++;
		} // 삽입

		System.out.println("");
		if (top <= 0) {
			System.out.println("텅텅");
		} else {
			// 스택에 자료 삭제(pop)
			top--;
			System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
			stack[top] = ' ';
			top--;
			System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
			stack[top] = ' ';
			top--;
			System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
			stack[top] = ' ';
		} // 삭제
	}

}
