//for-each문을 활용하는 사례를 보자
package day07;

public class Ex03_09 {
	enum Week {일, 월, 화, 수, 목, 금, 토}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };
		int sum = 0;

		// 아래 for-each에서 k는 num[0],num[1]...num[4]로 반복됨
		for (int k : num) {
			sum += k;
		}
		System.out.println("합은 : " + sum);
		System.out.println("for");
		sum = 0;
		for (int k = 0; k <= num.length; k++) {
			sum += k;
		}
		System.out.println("합은 : " + sum);
		// 아래 for-each에서 s는 name[0], name[1]...name[5]�� �ݺ���(�ּҰ��� ������)
		for (String s : names) {
			System.out.print(s + " ");
		}
		System.out.println("");
		System.out.println("for");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println("");
		// 아래 for-each문의 day는 일~토 값으로 반복됨
		for (Week day : Week.values()) {
			System.out.print(day + "요일 ");
		}
		System.out.println("");
	}
}
