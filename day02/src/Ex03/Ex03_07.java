package Ex03;

public class Ex03_07 {
	public static void main(String[] args) {
		int a, b;//4byte
		float c, d;//4byte 명령어체계(부호, 지수부, 가수부, 소수점)
		
		a = 100;
		b = a;//a 값을 b에 대입
		
		c = 111.1f;
		d = c;//c 값을 d에 대입
		
		//변수(f큰변수)=작은변수 //자동캐스팅=자동형변환=묵시적인형변환
		//변수(i작은변수)=(작은변수타입)큰변수 //강제캐스팅
		
		//System.out.printf("a의 값 : %d \n",a);
		//System.out.printf("b의 값 : %d \n",b);
		System.out.printf("a, b의 값 : %d, %d \n", a, b);
		//System.out.printf("c의 값 : %5.1f \n",c);
		//System.out.printf("d의 값 : %5.1f \n",d);
		System.out.printf("c, d의 값 : %5.1f, %5.1f \n", c, d);
	}
}
