package day12;

class CurrencyConverter{
	int value=0;//인스턴스 멤버변수
	public double toDollar2(double won) {//non-static
		value =0;
		//this.value=2; //no-error 굳이 this 쓸 필요 없음
		System.out.println("여기는 일반 메소드...");
		return won/rate;//스택틱, 일반필드, this 모두 접근 가능
	}
	private static double rate;//한국 원화에 대한 환율 //스책틱멤버변수=클래스
	public static double toDollar(double won) {
		//value=2; (X) //인스턴스 필드 접근 불가
		//this.balue=2; (X) //this 객체 자신을 가리키는 키워드 사용불가
		return won/rate;//한국 원화를 달러로 변환
	}
	public static double toKWR(double dollar) {
		return dollar*rate;//달러를 한국 원화로 변환
	}
	public static void setRate(double r) {
		//this.rate=rate;//this 사용불가
		rate= r;//환율 설정 KWR/$1
	}
}

public class Ch04_08 {

	public static void main(String[] args) {
		CurrencyConverter.setRate(1378);//미국 달러 환율 설정
		System.out.println("백만원은 "+CurrencyConverter.toDollar(1000000)+"달러 입니다.");
		System.out.println("백달러는 "+CurrencyConverter.toKWR(100)+"원 입니다.");
		//System.out.println("백만원은 "+CurrencyConverter.toDollar2(1000000)+"달러 입니다.");
		//non-static 이라 접근 안됨?
	}

}
