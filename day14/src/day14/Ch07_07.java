package day14;

import java.util.*;

class Student {
	int id;
	String tel;
	
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
}

public class Ch07_07 {

	public static void main(String[] args) {
		//학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		//3명의 학생 저장
		map.put("제임스", new Student(1, "010-1111-1111"));
		map.put("리차드", new Student(2, "010-2222-2222"));
		map.put("리오", new Student(3, "010-3333-3333"));
		
		System.out.println("HashMap 요소의 개수 : " + map.size());
		
		//모든 학생 출력. map에 들어있는 모든 (key, value) 쌍 출력
		//key 문자열을 가진 집합 Set 컬렉션 리턴
		Set<String> names = map.keySet();
		//key문자열을 순서대로 접근할 수 있는 Iterator 리턴
		Iterator<String> it = names.iterator();
		//while(it.hasNext()) {
		//	String name = it.next();
		//	Student student = map.get(name);
		//	System.out.println(name + " : " + student.id + " " + student.tel );
		//}
		for(int i = 0;i<map.size();i++) {
			String name = it.next();
			Student student = map.get(name);
			System.out.println(name + " : " + student.id + " " + student.tel );
		}
	}

}
