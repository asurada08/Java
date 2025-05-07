package DeamonThread;
/*
thread : 단일 프로그램에서 OS(VM)에 의해 호출될 수 있는 메소드 (주 스레드 : main() 메소드)
단일 스레드 환경에서는 main()이 종료되면 모든 thread 종료

다중스레드 환경에서는 모든 스레드가 종료해야 프로그램이 종료되며 
메인은 시작지점이지 종료점은 아니다
*/
class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("i : " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.getMessage();
			}
		}
	};// run
};// class

class MyThread2 implements Runnable {
	@Override
	public void run() {
		for (int j = 1; j <= 20; j++) {
			System.out.println("j : " + j);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.getMessage();
			}
		}
	};// run
};// class

public class ThreadEx02 {
	public static void main(String[] args) {
		System.out.println("main.....");
		MyThread th1 = new MyThread();
		th1.start();
		
		Thread th2 = new Thread(new MyThread2());//Runnable 바로 사용불가
		th2.start();
	}

}
