package test;

public class CompacDisc extends Product {
	private String albumTitle;
	private String artist;

	public CompacDisc(int ProductID, String description, String maker, int price, String albumTitle, String artist) {
		super(ProductID, description, maker, price);
		this.albumTitle = albumTitle;
		this.artist = artist;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("---------------");
		System.out.println("엘범재목 : " + albumTitle);
		System.out.println("가수이름 : " + artist + "\n");

	}
}
