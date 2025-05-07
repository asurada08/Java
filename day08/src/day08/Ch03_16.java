package day08;

public class Ch03_16 {

	public static void main(String[] args) {
		String[] strNum = {"23", "12", "998", "3.141592"};
		try {
			for(int i = 0; i<strNum.length;i++) {
				int j = Integer.parseInt(strNum[i]);
				System.out.println("숫자로 변환된 값은 "+j);
			}
		}catch(NumberFormatException e) {
			System.out.println("정수로 변환할 수 없네요");
		}
		
	}

}
