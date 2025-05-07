//Thread를 상속받아 1초 단위의 타이머 만들기
package day17;

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
	JLabel timerLabel;

	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;//레이블 초기화
	}//스레드 코드
	//run()이 종료하면 스레드 종료
	public void run() {
		int n = 0;

		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}//run
}

@SuppressWarnings("serial")
public class Ch13_01 extends JFrame {
	public Ch13_01() {//프레임 세팅
		setTitle("ThreadTimerEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		// 타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		// 타이머 스레드로 사용할 객체 생성
		// 타이머 값을 출력할 레이블 컴포넌트를 생성자에 전달
		TimerThread th = new TimerThread(timerLabel);
		c.add(timerLabel);

		setSize(300, 150);
		setVisible(true);

		th.start();//스레드 실행
	}

	public static void main(String[] args) {
		new Ch13_01();//프레임 생성

	}

}
/*
멀티태스킹 : 하나의 응용프로그램이 여러 개의 작업(태스크)을 동시에 처리
스레드(thread) 개념과 실(thread) : 마치 바늘이 하나의 실(thread)을 가지고 
								  바느질하는 것과 자바의 스레드는 일맥 상통함
스레드와 멀티스레딩
스레드 : 프로그램 코드를 이동하면서 실행하는 하나의 제어
자바의 멀티태스킹 : 멀티스레딩만 가능 / 하나의 응용프로그램은 여러 개의 스레드로 구성 가능
	- 자바에 프로세스 개념은 존재하지 않고, 스레드 개념만 존재
	- 스레드는 실행 단위 / 스케쥴링 단위
	- 스레드 사이의 통신에 따른 오버헤드가 크지 않음
자바 스레드
자바 가상 기계(JVM)에 의해 스케쥴되는 실행 단위의 코드 블럭
스레드의 생명 주기는 JVM에 의해 관리됨 : JVM은 스레드 단위로 스케쥴링
JVM과 멀티스레드의 관계
하나의 JVM은 하나의 자바 응용프로그램만 실행 
	- 자바 응용프로그램이 시작/종료될 때 JVM이 함께 실행/종료됨
하나의 응용프로그램은 하나 이상의 스레드로 구성 가능
자바 스레드와 JVM
각 스레드의 스레드 코드는 응용프로그램 내에 존재함 (JVM이 스레드를 관리함)
	- 스레드가 몇 개인지? / 스레드 코드의 위치가 어디인지? / 스레드의 우선순의는 얼마인지? 등 
스레드 만들기
스레드 실행을 위해 개발자가 하는 작업 : 스레드 코드 작성
	- JVM에게 스레드를 생성하고 스레드 코드를 실행하도록 요청
자바에서 스레드 만드는 2 가지 방법
	- java.lang.Thread 클래스를 이용하는 경우
	- java.lang.Runnable 인터페이스를 이용하는 경우
Thread 클래스를 이용한 스레드 생성
스레드 클래스 작성 : Thread 클래스 상속. 새 클래스 작성
스레드 코드 작성 : run() 메소드 오버라이딩
	- run() 메소드를 스레드 코드라고 부름 / run() 메소드에서 스레드 실행 시작
class TimerThread extends Thread {//클래스 작성 
	public void run() { // run() 오버라이딩
	}
}
스레드 객체 생성 : TimerThread th = new TimerThread(); 
스레드 시작 start() 메소드 호출 : th.start();
	- 스레드로 작동 시작 / JVM에 의해 스케쥴되기 시작함
*/
