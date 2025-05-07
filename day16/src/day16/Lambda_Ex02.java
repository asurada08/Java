package day16;

interface MyFunction2 {
	int calc(int x);
}

public class Lambda_Ex02 {

	public static void main(String[] args) {
		MyFunction2 square = x -> x * x;
		System.out.println(square.calc(2));

	}

}
