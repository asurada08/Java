package day11;

class Persons{
	public String name;
	public int age;
	
	public Persons(String s) {
		name = s;
	}
	public void setAge(int n) {
		n++;
		age = n;
		System.out.println("매개 변수 값 : "+n);
	}
}

public class Ch04_CallByValue {

	public static void main(String[] args) {
		Persons aPerson = new Persons("홍길동");
		int a = 33;
		
		aPerson.setAge(a);//값의 변화가 없음 값을 복사해서 쓰기때문에
		System.out.println("호출한 인자 값 : "+a);

	}

}