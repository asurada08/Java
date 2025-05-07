package day09;

public class ArrayEX04 {

	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		//char는 배열명을 출력하면 모든 값들을 출력한다. 해시주소값 아님
		System.out.println(abc);//ABCD
		System.out.println(num);//0123456789

		// 배열 abc와 num을 붙여서 하나의 배열 result로 만든다
		char[] result = new char[abc.length + num.length];
		//원본배열, 원본배열의시작위치, 사본배열, 사본배열의시작위치, 원본배열길이만큼 복사
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);//3번인덱스에서 끝까지
		System.out.println(result);//ABCD0123456789

		// 배열 abc을 배열 num 첫번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);//ABCD56789

		// number의 인덱스 6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);//ABCD45ABC9
	}

}
