package day14;
import java.util.Iterator;
import java.util.Vector;
class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")"; 
	}
}
public class Ch07_02 {
	public static void main(String[] args) {
		//Point 객체를 요소로만 가지는 벡터 생성
		Vector<Point> v = new Vector<Point>();
		//3개의 point 객체 삽입
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		//벡터에 있는 Point 객체 모두 검색하여 출력
		for(int i=0;i<v.size();i++) {//size 요소의 개수
			Point p = v.get(i);//벡터에서 i번째 Point 객체 얻어내기
			System.out.println(p);//p.toString()을 이용하여 객체 p 출력
		}
		//Iterator 이용
		System.out.println("----------------");
		System.out.println("Iterator 이용");
		Iterator<Point> it = v.iterator();//Iterator it = v.iterator(); 제너릭을 적용시키면
		Point str;
		while (it.hasNext()) {
			str = it.next();//str = (Point)it.next(); 캐스팅이 필요 없고 error 방지
			System.out.println(str + " ");
		}
	}

}
/*
Vector<E> (java.util.Vector) - 동기화 O, 속도 느림, 안정성 있음. 정렬 가능
	-<E>에서 E 대신 요소로 사용할 특정 타입으로 구체화
여러 객체들을 삽입, 삭제, 검색하는 컨테이너 클래스
	- 배열의 길이 제한 극복(기본 사이즈 10)
	- 원소의 개수가 넘쳐나면 자동으로 길이 조절
Vector에 삽입 가능한  것
	- 객체, null / 기본 타입(Wrapper 객체로 만들든지, 자동박싱/언박싱 사용하든지)
Vector에 객체 삽입
	- 벡터의 맨 뒤에 객체 추가 : 공간이 모자라면 자동 늘림
	- 벡터 중간에 객체 삽입 : 삽입된 뒤의 객체는 뒤로 하나씩 이동
Vector에서 객체 삭제
	-임의의 위치에 있는 객체 삭제 가능 : 객체 삭제 후 자동 자리 이동
*/