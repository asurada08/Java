package day05;

public class Ch07_01 {

	public static void main(String[] args) {
		int i, sum=0;
		i=1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("while 1부터 10까지 합 : "+sum);
		
		sum=0;
		for(i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("for 1부터 10까지 합 : "+sum);
		
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		} while (i <= 10);
		System.out.println("do-while 1부터 10까지 합 : "+sum);
	}

}
