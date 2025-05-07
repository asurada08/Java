package test;

public class ConversationBook extends Book {
	public String language;

	public ConversationBook(int ProductID, String description, String maker, int price, int ISBN, String title,
			String author, String language) {
		super(ProductID, description, maker, price, ISBN, title, author);
		this.language = language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("---------------");
		System.out.println("언어 : " + language + "\n");
	}
}
