package day16;

public class Lambda_Ex05  {

	public static void main(String[] args) {
		Myfunction5<String> f1 = (x) -> System.out.println(x.toString());
		f1.print("ABC");// String 객체를 람다식에 넘겨준다

		Myfunction5<Integer> f2 = (x) -> System.out.println(x.toString());
		f2.print(Integer.valueOf(100));// Integer 객체를 람다식에 넘겨준다
	}
}
