/*
Map - HashMap	 : 동기화 X, 속도 ↑, 멀티 스레드 환경이 아니라면 적용 (안정성 떨어짐)
	- HashTable	 : 동기화 O, 속도 ↓, 멀티 스레드 환경에서 적용 (안전성 보장)
	공통 : 정렬 안됨
	정렬된 결과를 보고 싶으면 TreeMap을 사용해야함
 */
package day14;

import java.util.*;

public class Ch07_06 {

	public static void main(String[] args) {
		//사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		//5개의 점수 저장
		javaScore.put("제임스", 85);
		javaScore.put("리차드", 50);
		javaScore.put("리오", 0);
		javaScore.put("에반", 0);
		javaScore.put("브레드", 100);
		
		System.out.println("HashMap의 요소 개수 : " + javaScore.size());
		
		//모든 사람의 점수 출력
		//javaScore에 들어 있는 모든 (key, value) 쌍 출력
		//key 문자열을 가진 집합 Set컬렉션 리턴
		//Set<String> keys = javaScore.keySet();
		Set set = javaScore.entrySet();//Map.Entry 사용
				
		//key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		//Iterator<String> keys = javaScore.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Map.Entry e = (Map.Entry)it.next();//Map.Entry 사용
			System.out.println("이름 : " + e.getKey() + ", 점수 : "+ e.getValue());
		}
//		for(int i = 0; i<javaScore.size();i++) {
//			String name = it.next();
//			int score = javaScore.get(name);
//			System.out.println(name + " : " + score);
//		}
		set = javaScore.keySet();
		System.out.println("참가자 명단 : " + set );
		
		Collection values = javaScore.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고 점수 : " + Collections.max(values));
		System.out.println("최저 점수 : " + Collections.min(values));
		
	}

}
