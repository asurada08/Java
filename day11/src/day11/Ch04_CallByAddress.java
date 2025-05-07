
package day11;

class MyInt {
	int val;

	MyInt(int i) {
		val = i;
	}
}

class Person {
	public String name;
	public int age;

	public Person(String s) {
		name = s;
	}

	public void setAge(MyInt i) {
		age = i.val;
		i.val++;
		System.out.println("매개 변수 값 : " + i.val);
	}

}

public class Ch04_CallByAddress {

	public static void main(String[] args) {
		Person aPerson = new Person("홍길동");
		MyInt a = new MyInt(33);//a는 33으로 했지만 setAge에 ++ 때문에 값이 변함. 
		aPerson.setAge(a);// 주소값으로 이동하기 때문에 값에 변화가 있음
		System.out.println("호출한 인자 값 : " + a.val);
	}

}
