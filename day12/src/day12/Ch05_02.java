package day12;

class Person{
	int age;
	public String name;
	protected int height;
	private int weight;
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

public class Ch05_02 extends Person{
	void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		setWeight(99);
		System.out.println("age : "+age);
		System.out.println("name : "+name);
		System.out.println("height : "+height);
		System.out.println("weight : "+getWeight());
	}
	
	public static void main(String[] args) {
		Ch05_02 s = new Ch05_02();
		s.set();
		System.out.println("--------------------");
		System.out.println("age : "+s.age);
		System.out.println("name : "+s.name);
		System.out.println("height : "+s.height);
		System.out.println("weight : "+s.getWeight());
		
	}

}
