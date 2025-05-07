package day17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerRunnable1 implements Runnable {
	JLabel timerLabel;

	public TimerRunnable1(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	public void run() {
		int n = 0;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;// 예외가 발생하면 스레드 종료
			}
		}
	}
}

@SuppressWarnings("serial")
public class Ch13_04 extends JFrame {
	Thread th;

	public Ch13_04() {
		setTitle("ThreadInterrup 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable1 runnable = new TimerRunnable1(timerLabel);
		th = new Thread(runnable);//스레드 생성
		c.add(timerLabel);
		
		//버튼을 생성하고 Action 리스너 등록
		JButton btn = new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				th.interrupt();//타이머 스레드 강제종료
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);//버튼 비활성화
			}
		});
		c.add(btn);
		setSize(300,150);
		setVisible(true);
		
		th.start();//스레드 동작 시킴
	}

	public static void main(String[] args) {
		new Ch13_04();
	}

}
/*
스레드 상태 6 가지
NEW : 스레드가 생성되었지만 스레드가 아직 실행할 준비가 되지 않았음
RUNNABLE : 스레드가 JVM에 의해 실행되고 있거나 실행 준비되어 스케쥴링을 기다리는 상태
WAITING : 어떤 Object 객체에서 다른 스레드가 notify(), notifyAll()을 불러주기를 
		  기다리고 있는 상태. 스레드 동기화를 위해 사용
TIMED_WAITING : 스레드가 sleep(n) 호출로 인해 n 밀리초 동안 잠을 자고 있는 상태
BLOCK : 스레드가 I/O 작업을 요청하면 JVM이 자동으로 이 스레드를 BLOCK 상태로 만든다.
TERMINATED : 스레드가 종료한 상태
스레드 상태는 JVM에 의해 기록 관리됨

스레드 종료와 타 스레드 강제 종료
스스로 종료 : run() 메소드 리턴
타 스레드에서 강제 종료 : interrupt() 메소드 사용
*/