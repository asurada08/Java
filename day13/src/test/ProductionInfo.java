package test;

import java.util.Scanner;

public class ProductionInfo {
	static int productID = 0;
	static int numberOfProduct = 0;
	static Product[] p = new Product[3];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while (choice != 3) {
			int type;
			System.out.println("상품 추가(1), 모든 상품 조회(2), 끝내기(3)");
			choice = scan.nextInt();
			switch (choice) {
			case 1:// 상품추가(1)
				if (numberOfProduct > p.length) {// 상품수를 체크 > 상품
					System.out.println("더 이상 추가 할 수 없습니다.");
					break;
				}
				System.out.println("상품 종류 책(1), 음악CD(2), 회화책(3)");
				type = scan.nextInt();
				if (type < 1 || type > 3) {
					System.out.println("잘못된 상품 종류 입니다");
					break;
				}
				addProduct(type);// 상품 추가 메소드
			case 2:// 모든 상품 조회(2)
				for (int i = 0; i < numberOfProduct; i++) {
					p[i].showInfo();
				}
				break;
			case 3:// 끝내기(3)
				System.out.println("종료");
				break;
			default:
				System.out.println("잘못 입력 하였습니다");
				break;
			}// switch
		} // while
		scan.close();
	}// main

	public static void addProduct(int type) {
		Scanner scan = new Scanner(System.in);
		System.out.print("상품 설명 : ");
		String desc = scan.nextLine();

		System.out.print("생산자 : ");
		String maker = scan.nextLine();

		System.out.print("가격 : ");
		int price = scan.nextInt();
		switch (type) {
		case 1:// 책
			System.out.print("ISBN : ");
			int ISBN = scan.nextInt();

			System.out.print("책 제목 : ");
			String title = scan.nextLine();

			System.out.print("책저자 : ");
			String author = scan.nextLine();

			p[numberOfProduct] = new Book(productID++, desc, maker, price, ISBN, title, author);
			break;
		case 2:// 음악CD
			System.out.print("엘범재목 : ");
			String albumTitle = scan.nextLine();
			System.out.print("가수이름 : ");
			String artist = scan.nextLine();

			p[numberOfProduct] = new CompacDisc(productID++, desc, maker, price, albumTitle, artist);
			break;
		case 3:// 회화책
			System.out.print("ISBN : ");
			int ISBN2 = scan.nextInt();

			System.out.print("책 제목 : ");
			String title2 = scan.nextLine();

			System.out.print("책저자 : ");
			String author2 = scan.nextLine();

			System.out.println("언어 : ");
			String language = scan.nextLine();

			p[numberOfProduct] = new ConversationBook(productID++, desc, maker, price, ISBN2, title2, author2,
					language);
			break;
		default:
			System.out.println("잘못 입력 하였습니다");
			break;
		}// switch
		numberOfProduct++;
		scan.close();
	}// add
}// class
