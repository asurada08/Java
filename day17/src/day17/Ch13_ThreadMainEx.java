package day17;

public class Ch13_ThreadMainEx {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("현재 스레드 이름 = " + name);
		System.out.println("현재 스레드 ID = " + id);
		System.out.println("현재 스레드 우선순위값  = " + priority);
		System.out.println("현재 스레드 상태 = " + s);
	}
}
/*
스레드 우선 순위와 스케쥴링
스레드의 우선 순위
최대값 = 10(MAX_PRIORITY) / 최소값 = 1(MIN_PRIORITY) / 보통값 = 5(NORMAL_PRIORITY)
스레드 우선 순위는 응용프로그램에서 변경 가능
void setPriority(int priority) / int getPriority()
main() 스레드의 우선 순위 값은 초기에 5
스레드는 부모 스레드와 동일한 우선순위 값을 가지고 탄생
JVM의 스케쥴링 정책 : 철저한 우선 순위 기반
	- 가장 높은 우선 순위의 스레드가 우선적으로 스케쥴링
	- 동일한 우선 순위의 스레드는 돌아가면서 스케쥴링(라운드 로빈).

main() 메소드
JVM에 의해 자동으로 스레드화
자바 스레드 : main 스레드
main() 함수가 스레드 코드로 사용
*/