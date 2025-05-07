//wait(), notify()를 이용한 바 채우기
package day17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyLabel extends JLabel {
	int barSize = 0;
	int maxBarSize;

	MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);//키를 눌러 보라색으로 적용
		//키를 눌렀을때 길이 구하기
		int width = (int) ((double) (this.getWidth())) / maxBarSize * barSize;
		if (width == 0) {//크기가 0이기때문에 바를 그릴 필요 없음
			return;
		}
		g.fillRect(0, 0, width, this.getHeight());//구한 넓이 높이 만큼 그리기
	}
	//바 크기 증가
	synchronized void fill() {
		if (barSize == maxBarSize) {
			try {
				wait();
			} catch (InterruptedException e) {
				return;
			}
		}
		barSize++;// 바 크기 증가
		repaint();// 바 다시 그리기
		notify();//
	}

	synchronized void consume() {
		if (barSize == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				return;
			}
		}
		barSize--;
		repaint();// 바 다시 그리기
		notify();
	}
}

class ConsumerThread extends Thread {
	MyLabel bar;

	ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}

	public void run() {
		while (true) {
			try {
				sleep(200);
				bar.consume();
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class Ch13_06 extends JFrame {
	MyLabel bar = new MyLabel(100);

	Ch13_06(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20, 50);
		bar.setSize(300, 20);
		c.add(bar);

		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				bar.fill();
			}
		});
		setSize(350, 200);
		setVisible(true);

		c.requestFocus();
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
	}

	public static void main(String[] args) {
		new Ch13_06("아무키나 빨리 눌러 바 채우기");

	}

}
/*
wait(), notify(), notifyAll()
동기화 객체 : 두 개 이상의 스레드 사이에 동기화 작업에 사용되는 객체
동기화 메소드 : synchronized 블럭 내에서만 사용되어야 함
wait() : 다른 스레드가 notify()를 불러줄 때까지 기다린다.
notify() : wait()를 호출로 인해 대기중인 스레드를 깨우고 RUNNABLE 상태로 한다.
2개 이상의 스레드가 대기중이라도 오직 한 개의 스레드만 깨워 RUNNABLE 상태로 한다.
notifyAll() : wait()를 호출로 인해 대기중인 모든 스레드를 깨우고 이들을 모두 
			  RUNNABLE 상태로 한다.
동기화 메소드는 Object의 메소드이다. : 모든 객체(Thread 객체 포함)가 동기화 객체가 될 수 있다.
*/