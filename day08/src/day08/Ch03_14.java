package day08;

public class Ch03_14 {

	public static void main(String[] args) {
		double sum = 0.0;
		for (int i = 0; i < args.length; i++) {
			sum += Double.parseDouble(args[i]);
		}
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %d\n", sum/args.length);
	}

}
