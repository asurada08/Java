package day04;

//500에서 1000까지 홀수의 합
public class Ch06_04 {

	public static void main(String[] args) {
		int sum = 0, i;
		for (i = 501; i <= 1000; i += 2) {
			sum += i;
		}
		System.out.println("500에서 1000까지 홀수의 합 : " + sum);

		int total, sum1, sum2;
		total = sum1 = sum2 = 0;
		for (i = 500; i <= 1000; i++) {
			total += i;
			if (i % 2 == 0) {
				sum1 += i;
			}else if(i % 2 != 0) {
				sum2 += i;
			}
			
		}
		System.out.println("전체 합 : "+total);
		System.out.println("짝수 합 : "+sum1);
		System.out.println("홀수 합 : "+sum2);
	}

}
