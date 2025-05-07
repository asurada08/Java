package day04;

public class Ex03_01 {
//for문을 이용하여 1부터 10까지 덧셈을 표시하고 합을 구하시오.
	public static void main(String[] args) {
		int i, j;
		for(j=0, i=1; i<=10; i++) {
			j += i;
			System.out.print(i);
			if(i==10) {
				System.out.print("=");
				System.out.print(j);
			} else {
				System.out.print("+");
			}
		}
	}

}