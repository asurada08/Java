package DeamonThread;

public class DeamonExample extends Thread {

	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true);
		ast.start();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.getStackTrace();
		}
		System.out.println("메인 스레드 종료");
	}
}
/*
스레드 활용 : Thread class를 상속받아서 구현하기
스레드 활용 : main부터 실행되고 Sub 실행
스레드 종류
 - User Thread : main의 종료와 상관없이 thread가 계속 실행됨
   [setDeamon(false)]와 같다
 - Deamon Thread : main의 종료시 thread 종료 (Deamon : 보조 스레드)
   ex) gc, [setDeamon(true)]와 같다
   프로그램이 완료되었지만 스레드가 여전히 실행 중 일때 JVM이 종료되지 않도록 하는 스레드,
   JVM이 스스로 필요에 의해 사용하는 것.
   
 * Thread.activeCount(); // 현재 실행중인 thread의 갯수
 * 스레드의 스케줄 방식
   - 선점형 스레드 스케줄링 방식 : 스레드의 우선권을 가지고 우선순위가 높은 스레드를 먼저
   								 수행시키는 방식
   - 비선점형 스레드 스케줄링 방식 : 실행중인 스레드가 CPU 사용권을 다른 스레드에
    							   넘길 때까지 기다리는 방식
  
 * JVM은 우선순위에 따른 선점형 스레드 스케줄링 방식을 사용한다
 * 우선순위가 빠르다고 해서 먼저 수행되지는 않는다. 작업량에 따라 결정됨. 우선순위는 참고
 * 멀티 스레드가 수행될 때 어떤 스레드가 먼저 수행될지는 스레드 스케줄러가 결정하게 된다
*/