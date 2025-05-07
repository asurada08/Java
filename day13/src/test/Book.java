package test;

public class Book extends Product {
	private int ISBN;// isbn번호
	private String title;// 책 제목
	private String author;// 저자

	public Book(int ProductID, String description, String maker, int price, int ISBN, String title, String author) {
		super(ProductID, description, maker, price);
		// 멤버초기화
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("---------------");
		System.out.println("ISBN : " + ISBN);
		System.out.println("책제목 : " + title);
		System.out.println("책저자 : " + author + "\n");

	}
}
