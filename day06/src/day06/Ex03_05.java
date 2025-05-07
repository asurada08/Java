package day06;

public class Ex03_05 {

	public static void main(String[] args) {
		int i, sum=0;
		
		for(i=1; i<=100; i++) {
			if(i%2==1) {
				continue;
			}else {
				sum += i;
			}
		}
		System.out.printf("1���� 100���� ¦���� ���� : %d\n", sum);
		
		sum=0;
		for(i=1;i<=100;i++) {
			if(i%2 != 1) {
				continue;
			}else {
				sum += i;
			}
		}
		System.out.printf("1���� 100���� Ȧ���� ���� : %d\n", sum);
		
		sum = 0;
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.printf("1���� 100���� Ȧ���� ���� : %d", sum);
	}	

}
