package day08;

import java.util.Scanner;

public class Ex08_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] stack = new char[5];
		int top = 0;

		char carName = 'a';// 자동차 이름은 a 부터 시작한다
		int select = 0;// 사용자가 선택한 작업을 입력할 변수를 선언

		while (select != 3) {// 3이 아니면 while문 반복
			System.out.printf("1.자동차 넣기 2.자동차 빼기 3.끝 : ");
			select = scan.nextInt();// 사용자가 선택하는 값
			switch (select) {
			case 1:// 삽입 가능한지 여부
				if (top >= 5) {// 삽입 불가
					System.out.println("만차 입니다\n");
				} else {// 삽입 가능
					stack[top] = carName++;
					System.out.printf("%c 차가 터널에 들어감\n", stack[top]);
					top++;// 위치 증가
				}
				break;
			case 2:// 삭제 가능한지 여부
				if (top <= 0) {// 삭제 불가
					System.out.println("텅 비었습니다\n");
				} else {// 삭제 가능
					top--;// 위치 감소
					System.out.printf("%c 차가 터널에서 빠짐\n", stack[top]);
					stack[top] = ' ';// 값 없에기
				}
				break;
			case 3:// 종료
				System.out.printf("현재 터널에 %d대 있음\n", top);
				System.out.printf("종료\n");
				break;
			default:
				System.out.println("정확한 값을 입력하세요~\n");
			}
		}
		scan.close();
	}

}
