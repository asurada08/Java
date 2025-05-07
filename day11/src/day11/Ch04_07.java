package day11;

class Sample{
	public int a;
	private int b;//정보은닉 setter(), getter()로 접근해야함
	int c;
	public int getB() {
		return b;
	}
	public void setB(int value) {
		b = value;
	}
}

public class Ch04_07 {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		//aclass.b = 10;
		//private 이여서 오류남 : 
		//Unresolved compilation problem aClass cannot be resolved to a variable
		//수정
		aClass.setB(10);
		aClass.c = 10;
		
		System.out.println("aClass.a : "+ aClass.a);
		System.out.println("aClass.getB : "+ aClass.getB());
		System.out.println("aClass.c : "+ aClass.c);
	}

}
