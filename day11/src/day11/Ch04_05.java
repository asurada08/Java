package day11;

public class Ch04_05 {
	String title;
	String author;
	int ISBN;
	static int value = 30000;

	public Ch04_05(String title, String author, int ISBN, int value) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.value = value;
	}

	public Ch04_05() {
		System.out.println("디폴트 생성자");
	}

	public static void disp(Ch04_05 javaBook) {
		System.out.println("책 제목 : " + javaBook.title);
		System.out.println("잭 저자 : " + javaBook.author);
		System.out.println("ISBN : " + javaBook.ISBN);
		System.out.println("책 가격 : " + javaBook.value);
		System.out.println("매개변수 있는 생성자");
		System.out.println("");
	}
	public void setTitle(String title) {
		this.title = title;		
	}
	public void setAuthor(String author) {
		this.author = author;		
	}
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public static void main(String[] args) {
		Ch04_05 javaBook = new Ch04_05("Java JDK", "제임스", 3333, 25000);
		disp(javaBook);
		// 객체 생성하고 초기화 하고 출력
		// 멤버로 초기화
		
		
		// 객체 생성하고 초기화 하고 출력
		// setter() 초기화
		Ch04_05 javaBook1 = new Ch04_05();
		javaBook1.setTitle("ABCDEFG");
		javaBook1.setAuthor("리처드");
		javaBook1.setISBN(3693);
		javaBook1.setValue(15000);
		disp(javaBook1);

	}

}
