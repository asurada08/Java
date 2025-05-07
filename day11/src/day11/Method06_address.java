package day11;

//call by address : 반환값 O 매개변수 O 배열
//주소 복사해서 전달하고 돌아와서 원래 변수에 변화 O
//-----여기는 disp-----
//0 1 2 3 4
//-----여기는 main-----
//5 6 7
public class Method06_address {
	//disp() 프로토타입 정의
	public static int[] disp(int[] a) {
		System.out.println("-----여기는 disp-----");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+i+" ");
		}
		int m[]= {5, 6, 7};
		return m;
	}

	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = disp(a);
		System.out.println("\n-----여기는 main-----");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}