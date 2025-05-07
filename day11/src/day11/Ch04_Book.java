package day11;

public class Ch04_Book {
	String title;
	String author;
	int ISBN;
	//생성자의 오버로딩 : 다양한 기능을(작업을) 하기 위해서 사용한다
	//					 보다 간결해 진다. 상속과는 관계가 없다.
	public Ch04_Book(String title, String author, int ISBN) {
		//super(); // 부모객체 자신
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	public Ch04_Book(String title, int ISBN) {
		this(title, "Anonymous", ISBN);
	}
	public Ch04_Book() {
		this(null, null, 0);//첫줄에 와야함.
		System.out.println("생성자가 호출되었음");
	}
	public static void disp(Ch04_Book javaBook) {
		System.out.println("책 제목 : " + javaBook.title);
		System.out.println("잭 저자 : " + javaBook.author);
		System.out.println("ISBN : " + javaBook.ISBN);
		System.out.println("---------------------");
	}
	public static void main(String[] args) {
		Ch04_Book javaBook = new Ch04_Book("Java JDK", "황기태", 3333);
		disp(javaBook);
		Ch04_Book holybible = new Ch04_Book("Holy Bible", 1);
		disp(holybible);
		Ch04_Book emptyBook = new Ch04_Book();
		disp(emptyBook);
		
	}

}
