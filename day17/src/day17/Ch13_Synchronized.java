//synchronized 사용 예 : 집계판 사례를 코딩
//kitae와 hyosoo가 각각 10번씩 add()를 호출하였으며 
//동기화가 잘 이루어져서 최종 누적 점수 sum이 200이 됨
package day17;

import javax.sql.rowset.spi.SyncFactory;

public class Ch13_Synchronized {
	public static void main(String[] args) {
		SyncObject obj = new SyncObject();
		Thread th1 = new WorkerThread("Kitea", obj);
		Thread th2 = new WorkerThread("hyosoo", obj);
		th1.start();
		th2.start();
	}
}

class SyncObject {
	int sum = 0;

	synchronized void add() { // synchronized 이 없으면 th1, th2가 충돌함
	//synchronized 메소드
	//void add() {
		//synchronized(this){// synchronized 코드블럭
	
		int n = sum;
		//Thread.currentThread().yield();
		//스레드의 실행 속도라 너무 빠르기 때문에 충돌 발생이 쉽지 않다
		//그래서 고의로 add()메소드에 대한 충돌을 쉽게 발생시키기 위해 다른 스레드에
		//양보하도록 하였음
		Thread.currentThread().yield();
		n += 10;//10씩 증가
		sum = n;//증가한 값을 집계 sum에 저장
		System.out.println(Thread.currentThread().getName() + ":" + sum);
	}
	//}
	int getSum() {
		return sum;
	}
}
//학생을 시뮬레이션 하는 스레드 클래스
class WorkerThread extends Thread {
	SyncObject sObj;

	WorkerThread(String name, SyncObject sObj) {
		super(name);
		this.sObj = sObj;
	}

	public void run() {
		int i = 0;
		while (i < 10) {
			sObj.add();
			i++;
		}
	}
}
/*
synchronized 코드 블럭
void execute(){
	//다른 코드들
	//다른 코드들
	synchronized(this){ // synchronized는 이렇게도 쓸수 있다.
		int n = getCurrentSum();
		n += 10;
		setCurrentSum(n);
	}
	//
	//
}
 */

/*
스레드 동기화(Thread Synchronization)
멀티스레드 프로그램 작성시 주의점 : 다수의 스레드가 공유 데이터에 동시에 접근하는 경우
	- 공유 데이터의 값에 예상치 못한 결과 발생 가능
스레드 동기화 : 멀티스레드의 공유 데이터의 동시 접근 문제 해결책
	- 공유데이타를 접근하고자 하는 모든 스레드의 한 줄 세우기
	- 한 스레드가 공유 데이터에 대한 작업을 끝낼 때까지 다른 스레드가 공유 데이터에 
	  접근하지 못하도록 함
synchronized 키워드 : 한 스레드만이 독점적으로 실행되어야 하는 부분(동기화 코드)을 표시
	- 임계 영역(ciritical section) 표기 키워드
synchronized 키워드 사용 가능한 부분 : 메소드 전체 혹은 코드 블럭 
synchronized 부분이 실행될 때 : 실행 스레드는 모니터 소유
	- 모니터란 해당 객체를 독점적으로 사용할 수 있는 권한
 모니터를 소유한 스레드가 모니터를 내놓을 때까지 다른 스레드는 대기

SyncObject 객체에 대한 스레드의 동시 접근
위의 예제에서 th1 스레드 / th2 스레드가 add()에 접근을 함. 
*/

/*
동기화 : 여려명이 접근하는것을 방지하기 위한 방법
입계영역 : 멀티 스레드에 의해 공유자원이 참조될 수 있는 코드의 범위를 말한다
		  멀티 스레드 프로그램에서 임계영역을 처리하는 경우 심각한 문제가 발생할 수 있다
		  이러한 상황을 해결할 수 있는 방법이 동기화를 이용하는 것 이다
		  동기화를 처리하기 위해 모든 객체 락(LOCK)을 포함 시킨다
		  
LOCK : 공유객체에 여러 스레드가 동시에 접근하지 못하도록 하기 위한 것으로 모든 객체가
	   힙 영역에 생성될 때 자동으로 만들어 진다
	   잘못 동기화 시키면 DEAD LOCK(교착상태)에 걸림

DEAD LOCK(교착상태 = 병목현상) : 두개 이상의 스레드가 만족하지 못하는 상태로 
								계속 기다릴 때 발생한다

동기화 방법
1.메소드 기반 : 될 수 있으면 사용하지 마세요. 속도 덜어짐.
 - public Synchronized void SynchronizedEx(){
	//임계영역 코딩
  }
2.동기화 블럭 기반 : 동기화 기준을 다양화 할 수 있다
 - public void nomalMethod(){
 	공유객체가 객체 자신이면 this를 넣을 수 있다
	동기화의 대상을 알리는 용도로 사용
	
	메소드가 호출된 인스턴스 자신의 열쇠(Synchronized)를 대상으로 동기화를 진행하는 문장
	Synchronized(동기화 할 객체 또는 클래스명){
	임계영역 코딩
	}
*/