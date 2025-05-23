package day11;

public class Ch04_04 {
	static void replaceSpace(char a[]) {
		//char a[] = new char[]{'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		//배열에 ' ' 공백을 ','로 변환
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				a[i] = ',';
			}
		}
	}

	static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}

}
