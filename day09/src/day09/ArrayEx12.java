package day09;
import java.util.Scanner;
public class ArrayEx12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String str1 = scan.next();
		String[] names = {"Kim", "Park", "Yi"};
		for(int i = 0; i<names.length;i++) {
			System.out.printf("name[%d] : %s\n",i,names[i]);
		}
		//string형에서 : equal()값 비교
		for(int i=0;i<names.length;i++) {
			if(str1.equalsIgnoreCase(names[i])) {
				System.out.printf("%s 와 %s 는 같다\n",str1, names[i]);
			}else {
				System.out.printf("%s 와 %s 는 다르다\n",str1, names[i]);
			}
		}
		String tmp = names[2];//배열 names의 세번째 요소를 tmp에 저장
		System.out.println("tmp : "+tmp);
		names[0]= "Yu";//배열 names의 첫번째 요소를 "Yu"로 변경
		for(String str : names) {
			System.out.println(str);
		}
		scan.close();
	}

}
