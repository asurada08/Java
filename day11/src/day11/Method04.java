package day11;

public class Method04 {

	public static void disp() {// call by value : 반환형 X 매개변수 X 메소드 전달
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
	}
	public static int returnCall() {//call by value : 반환형 O 매개변수 X 메소드
		int sum=0;
		for (int i = 0; i < 10; i++) {
			sum += i;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		disp();
		int r = returnCall();//call by value : 반환형O, 매개변수X 메소드
		System.out.println("\n1~10 까지 합 : "+r);
	}
}
