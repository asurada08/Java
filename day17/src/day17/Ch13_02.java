//Runnable인터페이스를 구현하여 1초 단위 타이머 만들기
package day17;

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

@SuppressWarnings("serial")
public class Ch13_02 extends JFrame{
	public Ch13_02() {
		setTitle("RunnableTimerEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable); 
		
		c.add(timerLabel); 
		setSize(300,150);
		setVisible(true);
		th.start(); 
	}
	public static void main(String[] args) {
		new Ch13_02();
	}
}
/*
스레드 주의 사항
run() 메소드가 종료하면 스레드는 종료한다.
	- 스레드가 계속 존재하게 하려면 run() 메소드 내에 무한 루프가 실행되어야 한다.
한번 종료한 스레드는 다시 시작시킬 수 없다.
	- 스레드 객체를 생성하여 다시 스레드로 등록하여야 한다.
한 스레드에서 다른 스레드를 강제 종료할 수 있다.

Runnable 인터페이스로 스레드 만들기 (클래스는 다중 상속이 되지 않아 Runnable 사용) 
스레드 클래스 작성 : Runnable 인터페이스 구현하는 새 클래스 작성
스레드 코드 작성 run() : 메소드 오버라이딩
	- run() 메소드를 스레드 코드라고 부름 / run() 메소드에서 스레드 실행 시작
스레드 객체 생성
스레드 시작 : start()메소드 호출
class TimerRunnable implements Runnable {//스레드 클래스 작성
	public void run() { // run() 메소드 오버라이딩
	}
}
Thread th = new Thread(new TimerRunnable());//스래드 객체 생성
th.start();//스레드 시작
*/