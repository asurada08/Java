package day11;

public class Ch04_Person {
	int age;
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		Ch04_Person[] pa = new Ch04_Person[10];
		for (int i=0; i<pa.length;i++) {
			pa[i]= new Ch04_Person();
			//pa[i].age = 30+i;
			pa[i].setAge(30+i);
		}
		for(int i=0;i<pa.length;i++) {
			//System.out.println(pa[i].age + " ");
			System.out.println("나이 : "+pa[i].getAge());
		}
	}

}
