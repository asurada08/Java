//데몬스레드 예제
package DeamonThread;

class ThreadSub extends Thread {
	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
};// class

public class ThreadEx {
	public static void main(String[] args) {
		ThreadSub ts = new ThreadSub();
		// Deamon Thread --> main이 종료 하면 모든 thread 종료
		// ts.setDaemon(true);//main이 끝나면 모두 종료

		// user Thread --> main의 종료와 무관하게 thread 계속 수행
		ts.setDaemon(false);// main과 무관하게 남아있는 thread 수행
		System.out.println(Thread.activeCount());// 실행중인 thread 갯수 / main 1개
		System.out.println("thread 초기상태 확인 " + ts.isDaemon());
		ts.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("main : " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}
}