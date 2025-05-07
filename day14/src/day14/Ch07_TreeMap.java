package day14;

import java.util.*;

public class Ch07_TreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> score = new TreeMap<Integer, String>();
		
		score.put(80, "제임스");
		score.put(75, "리차드");
		score.put(10, "에반");
		score.put(5, "리오");
		score.put(100, "브레드");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = score.firstEntry();
		System.out.println("가장 낮은 점수 : "+entry.getKey()+", "+entry.getValue());
		entry = score.lastEntry();
		System.out.println("가장 높은 점수 : "+entry.getKey()+", "+entry.getValue());
		entry = score.lowerEntry(95);
		System.out.println("95점 아래 점수 : "+entry.getKey()+", "+entry.getValue());
		entry = score.higherEntry(95);
		System.out.println("95점 위의 점수 : "+entry.getKey()+", "+entry.getValue());
		entry = score.floorEntry(95);
		System.out.println("95점 이거나 바로 아래 점수 : "+entry.getKey()+", "+entry.getValue());
		entry = score.ceilingEntry(95);
		System.out.println("95점 이거나 바로 위의 점수 : "+entry.getKey()+", "+entry.getValue()+"\n");
		
		while(!score.isEmpty()) {
			entry = score.pollFirstEntry();//삭제
			System.out.println(entry.getKey() + ", " + entry.getValue() + " (남은 객체 수) " + score.size());
			
		}
	}

}
