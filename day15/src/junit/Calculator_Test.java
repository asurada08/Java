package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Calculator_Test {
	Calculator obj;
	//@Test가 붙어있는 메소드를 실행전 실행
	//객체 생성, 초기화에 사용, 반드시 public이여야 함

	@Before
	public void prepare() {//실행전 준비작업
		System.out.println("prepare...");
		obj = new Calculator();
	}
	@Test
	public void Testadd() {
		System.out.println("add...");
				//기대값, 실제로 반환값 (두값이 같아야 성공)
		assertEquals(2, obj.add(1, 1));//2
	}
	@Test
	public void Testsub() {
		System.out.println("sub...");
		assertEquals(0, obj.sub(1, 1));//0
	}
	@Test
	public void Testmul() {
		System.out.println("mul...");
		assertEquals(20, obj.mul(5, 4));//20
	}
	@Test
	public void Testdiv() {
		System.out.println("div...");
		assertEquals(1/4, obj.div(1, 4));//0.25
	}

}
