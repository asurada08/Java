package day17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RandomThread extends Thread {
	Container contentPane;
	boolean flag = false;//스레드의 종료 명령을 표시하는 프래그 / true : 종료 지시
	
	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	void finish() {//스레드 종료 명령을 flag에 표시
		flag = true;
	}
	
	public void run() {
		while(true) {
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			JLabel label = new JLabel("JAVA");//새 레이블 생성
			label.setSize(80,30);
			label.setLocation(x, y);
			contentPane.add(label);
			contentPane.repaint();
			try {
				Thread.sleep(300);//0.3초 동안 잠을잔다
				if(flag==true) {
					contentPane.removeAll();
					label = new JLabel("finish");
					label.setSize(80,30);
					label.setLocation(100, 100);
					label.setForeground(Color.GREEN);
					contentPane.add(label);
					contentPane.repaint();
					return;//스레드 종료
				}
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class Ch13_05 extends JFrame {
	RandomThread th;
	
	public Ch13_05() {
		setTitle("ThreadFinishFlag 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				th.finish();//RandomThread 스레드 종료 명령
			}
		});
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c);//스레드 생성
		th.start();//스레드 동작시킴
	}
	public static void main(String[] args) {
		new Ch13_05();
	}

}
/*
flag를 이용한 종료
스레드 A가 스레드 B의 flag를 true로 만들면, 스레드 B가 스스로 종료하는 방식
 */