//처음 입력받은 인원수 만큼의 학생 이름과 전화번호를 입력받고 
//입력받은 내용을 전체 출력하는 프로그램을 구현한다.
//단, 배열을 활용하여 작성할 수 있도록 한다
//입력 
//인원수 : 3
//이름 전화번호 입력(1)[공백구분] : 전순우 010-1111-1111
//이름 전화번호 입력(2)[공백구분] : 이은비 010-2222-2222
//이름 전화번호 입력(3)[공백구분] : 곽경식 010-3333-3333
//출력
//전체 학생수 : 3
//이름 전화번호
//전순우 010-1111-1111
//이은비 010-2222-2222
//곽경식 010-3333-3333
package day07;

import java.util.Scanner;

public class Test04_0411 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 처리할 학생 수(명) : ");
		int persons = scan.nextInt();
		String name[] = new String[persons];
		String phonenum[] = new String[persons];
		for (int i = 0; i < persons; i++) {
			System.out.printf("이름 전화번호 입력(%d)[공백구분] : ", (i+1));
			name[i] = scan.next();
			phonenum[i] = scan.next();
		}
		System.out.printf("전체 학생 수 : %d\n", persons);
		System.out.println("이름  전화번호");
		for (int i = 0; i < persons; i++) {
			System.out.printf("%3s %3s\n", name[i], phonenum[i]);
		}
		scan.close();
	}

}
