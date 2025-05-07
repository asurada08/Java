package day08;

public class Ch03_13 {
//public(다른 클래스에서 메소드 접근 허용) / static(객체 생성 전부터 호출 가능)
//void(리턴 값 없음) / string[](문자열 배열) / args(인자)
	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<args.length;i++) {
			int n = Integer.parseInt(args[i]);
			sum += n;
		}
		System.out.println("sum = "+sum);
	}

}
