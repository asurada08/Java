package day08;

public class Ch03_11 {

	public static void main(String[] args) {
		int iArr[][] = new int[4][];// {{},{},{},{}}; 이것도 가능
		iArr[0] = new int[3];
		iArr[1] = new int[2];
		iArr[2] = new int[5];
		iArr[3] = new int[4];

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = (i + 1) * 10 + j;
				System.out.printf("%3d", iArr[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		int cnt = 0;
		int iArr1[][] = { {}, {}, {}, {} };
		iArr1[0]=new int[4];
		iArr1[1]=new int[1];
		iArr1[2]=new int[1];
		iArr1[3]=new int[4];
		for(int i=0;i<iArr1.length;i++) {
			for(int j=0;j<iArr1[i].length;j++) {
				iArr1[i][j]=cnt;
				cnt++;
				System.out.printf("%2d",iArr1[i][j]);
			}
			System.out.println("");
		}
	}

}
