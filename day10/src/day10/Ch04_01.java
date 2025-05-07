package day10;

public class Ch04_01 {
	// 명서적 초기화
	String name = "삼성";
	int price = 3000;
	int numberOfStock = 3;
	int sold = 3;
	public Ch04_01() {
		System.out.println("디폴트");
		System.out.println("");
	}

	public Ch04_01(String name, int price, int numberOfStock, int sold) {
		//멤버변수 초기화
		this.name = name;//호출한 객체 자신
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	};

	public static void disp(Ch04_01 camera) {
		//직접접근, 값 출력, 값 인출
		System.out.println("상품이름 : " + camera.name);
		System.out.println("상품가격 : " + camera.price);
		System.out.println("재고수량 : " + camera.numberOfStock);
		System.out.println("팔린수량 : " + camera.sold);
		System.out.println("");
	};

	// setter() 멤버변수값 초기화
	private void setName(String name) {
		this.name = name;
	}
	private void setPrice(int price) {
		this.price = price;
	}
	private void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}
	private void setSold(int sold) {
		this.sold = sold;
	}
	//getter() 간접출력
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getNumberOfStock() {
		return numberOfStock;
	}
	public int getSold() {
		return sold;
	}
	public static void main(String[] args) {
		//Ch04_01 camera1 = new Ch04_01();
		
		// 1. 객체 생성하면서 멤버변수를 초기화
		Ch04_01 camera = new Ch04_01("LG", 30000, 3, 30);
		// 직접 출력, 인출
		disp(camera);// call by address==reference 주소 전달 방식

		// Ch04_01 camera = new Ch04_01();
		// 2.직접접근, 초기화, 설정, 저장
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;
//		System.out.println("상품이름 : "+camera.name);
//		System.out.println("상품가격 : "+camera.price);
//		System.out.println("재고수량 : "+camera.numberOfStock);
//		System.out.println("팔린수량 : "+camera.sold);
		disp(camera);
		System.out.println("");

		// 3. 간접저장 setter() 메소드를 이용해서 멤버변수의 값을 초기화
		camera.setName("Nikon2");
		camera.setPrice(40000);
		camera.setNumberOfStock(1);
		camera.setSold(0);
		//출력
		disp(camera);
		//간접출력 getter()
		System.out.println("상품이름 : "+camera.getName());
		System.out.println("상품가격 : "+camera.getPrice());
		System.out.println("재고수량 : "+camera.getNumberOfStock());
		System.out.println("판매수량 : "+camera.getSold());
	}
}
/*
 * 상품 하나를 표현하는 클래스 Goods를 작성하라. 상품은 String 타입의 name, int 타입의 price,
 * numberOfStock, sold 등 네 개의 필드를 갖는다. Goods 클래스 내에 main() 메소드를 작성하여 Goods 객체를
 * 하나 생성하고 이 객체에 대한 레퍼런스 변수 명을 camera로 하라. 그리고 나서 camera의 상품 이름(name 필드)을
 * “Nikon”, 값(price)을 400000, 재고 갯수(numberOfStock)를 30, 팔린 개수(sold)를 50으로 설정하라.
 * 그리고 설정된 이들 값을 화면에 출력하라.
 */