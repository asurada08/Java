package day17;

import java.awt.*;
import javax.swing.*;

class FlickeringLavel extends JLabel implements Runnable {
	private static final long serialVersionUID = 1L;
	public FlickeringLavel(String text) {
		super(text);//JLabel 생성자 호출
		setOpaque(true);//배경색 변경이 가능하도록 설정 false 투명 true 불투명
		
		Thread th = new Thread(this);
		th.start();
	}
	public void run() {
		int n = 0;
		while(true) {
			if(n==0) {
				setBackground(Color.RED);
			}else {
				setBackground(Color.GREEN);
			}
			if(n==0) {
				n = 1;
			}else {
				n = 0;
			}
			try {
				Thread.sleep(500);//0.5초 동안 잠을 잔다
			}catch (InterruptedException e) {
				return;
			}
		}
	}
}


public class Ch13_03 extends JFrame{
	private static final long serialVersionUID = 1L;
	public Ch13_03() {
		setTitle("FlickeringLavel 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//깜박이는 레이블 생성
		FlickeringLavel fLabel = new FlickeringLavel("깜빡");
		
		//깜빡이지 않는 레이블 생성
		JLabel label = new JLabel("안깜빡");
		
		//깜박이는 레이블 생성
		FlickeringLavel fLabel2 = new FlickeringLavel("여기도 깜빡");
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		//setSize(300,150);
		//setLocation(1300, 100);
		setBounds(1300, 100, 300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ch13_03();

	}

}
