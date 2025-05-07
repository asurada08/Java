//객체 배열 생성
package day11;

import java.util.Scanner;

class Goods {
	//private 객체명.name = "홍길동";(X) / 객체명.setName("홍길동");(O) : 정보은닉=캡슐화
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;

	Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}

	//public Goods() {
	//	System.out.println("디폴트");
	//}
	//getter()정의
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

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}
}

public class Ch04_03 {

	public static void main(String[] args) {
		Goods[] goodsArray;// 객체배열 생성
		goodsArray = new Goods[3];// Goods 클래스 타입으로 객체배열 생성
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < goodsArray.length; i++) {
			String name = scan.next();
			int price = scan.nextInt();
			int n = scan.nextInt();
			int sold = scan.nextInt();
			goodsArray[i] = new Goods(name, price, n, sold);
			//goodsArray[i] = new Goods();
			//setter 저장
			//goodsArray[i].setName(name);
			//goodsArray[i].setPrice(price);
			//goodsArray[i].setNumberOfStock(n);
			//goodsArray[i].setSold(sold);
			//멤버를 통해 저장(직접저장 안됨) 
			// : private으로 선언했기때문에 다른 클래스의 멤버를 직접접근 안됨
			//
			
		}
		for (int i = 0; i < goodsArray.length; i++) {
			// 클래스가 달라서 직접접근이 안됨
			// (Goods 클래스 내부 멤버 private 이여서 get.XXX로 접근해야함.)
			System.out.print(goodsArray[i].getName() + " ");
			System.out.print(goodsArray[i].getPrice() + " ");
			System.out.print(goodsArray[i].getNumberOfStock() + " ");
			System.out.println(goodsArray[i].getSold() + " ");
		}
		scan.close();

	}

}
