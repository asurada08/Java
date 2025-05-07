package test;

public class Product {
	// 필드생성
	private int productID;
	private String description;
	private String maker;
	private int price;

	public Product(int productID, String description, String maker, int price) {
		// 초기화
		this.productID = productID;
		this.description = description;
		this.maker = maker;
		this.price = price;
	}

	// getter(), setter() 생성
	public void setProductID(int productID) {
		this.productID = productID;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getProductID() {
		return productID;
	}

	public String getDescription() {
		return description;
	}

	public String getMaker() {
		return maker;
	}

	public int getPrice() {
		return price;
	}

	public void showInfo() {
		System.out.println("---------------");
		System.out.println("상품ID : " + productID);
		System.out.println("상품설명 : " + description);
		System.out.println("생산자 : " + maker);
		System.out.println("상품가격 : " + price + "\n");
	}
}
