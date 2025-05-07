package day11;

//call by address : 반환형 X 매개변수 O 배열
//주소 복사해서 전달하고 돌아와서 원래 변수에 변화 O
//-----여기는 disp-----
//0 0 0 0 0
//-----여기는 main-----
//0 0 0 0 0
public class Method05_address {
	public static void disp(int[] a) {
		System.out.println("-----여기는 disp-----");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			a[i] = i;
		}
	}

	public static void main(String[] args) {
		int[] a = new int[5];
		disp(a);
		System.out.println("\n-----여기는 main-----");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
