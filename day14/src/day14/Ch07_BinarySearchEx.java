package day14;

//이분검색:조건이 반드시 검색전에 오름차순으로 정렬이 되어 있어야 함.
//중간위치를 기준으로 찾음
public class Ch07_BinarySearchEx {

	public static void main(String[] args) {
		int arr[] = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int low = 0;// 맨처음 위치
		int high = arr.length;// 맨끝 위치
		int mid;// 중간위치
		int index = -1;// 못 찾을 때
		int sd = 70;// 찾을 값

		System.out.println("arr.length의 값 : " + arr.length);
		System.out.println("high의 값 : " + (arr.length - 1));
		System.out.println("(low+high)/2=mid의 값 : " + ((low + high) / 2) + "\n");

		while (low <= high) {
			mid = (low + high) / 2;
			if (sd == arr[mid]) {
				index = mid;
				break;
			} else if (sd > arr[mid]) {// 찾는 값 > 중간 위치 값
				low = mid + 1;// 찾는 값이 크면 중간위치 + 1 만큼 최소위치 넣어줌
			} else {
				high = mid - 1;// 찾는 값이 작으면 중간위치 - 1 만큼 최대위치 넣어줌
			}
		} // while
		if (index == -1) {
			System.out.println("찾기 실패");
		} else {//찾았다
			System.out.println("검색한 70값의 index : " + index);
		}
	}
}
