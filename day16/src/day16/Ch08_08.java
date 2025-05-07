package day16;

import java.io.File;

public class Ch08_08 {
	//디렉터리에 포함된 파일과 디렉터리의 이름
	//크기, 수정시간을 출력하는 메소드
	public static void dir(File fd) {
		String[] filenames = fd.list();
		for (String s : filenames) {
			File f = new File(fd, s);
			long t = f.lastModified();//마지막으로 수정된 시간
			System.out.print(s);
			System.out.print("\t파일크기 : "+f.length());//파일크기
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n", t, t, t, t);
		}
	}
	/*
	%t : 시각 전체 표현
	%tT : 시분초
	%tb : 달 축약형		Jan
	%tB : 달 전체 표시	January
	%td : 일 표시		1-31
	%ta : 요일 단축셩	Sun
	%tA : 요일 전체 표시 Sunday
	 */
	public static void main(String[] args) {
		File f1 = new File("src\\day16");//폴더
		File f2 = new File("src\\day16\\aaa.txt");//파일
		File f3 = new File("src\\day16");//폴더
		String res;
		if(f1.isFile())//파일 타입이면
			res = "파일";
		else //디렉터리 타입이면
			res = "디렉터리";
		System.out.println(f1.getPath() + " 은 " + res + " 입니다.");
		if(!f2.exists()) {//f2가 나타내는 파일이 존재하는지 검사
			if(!f2.mkdir())//존재하지 않으면 디렉터리 생성
				System.out.println("디렉터리 생성 실패");
		}
		if(f2.isFile())//파일 타입이면
			res = "파일";
		else //디렉터리 타입이면
			res = "디렉터리";
		System.out.println(f2.getPath() + " 은 " + res + " 입니다.");
		dir(f3);//파일과 디렉터리 화면에 출력
		//파일 이름 변경
		f2.renameTo(new File("src\\day16\\aaaa.txt"));
		dir(f3);
	}
}
/*
File 클래스(java.io.File) : 파일의 경로명을 다루는 클래스
	- 파일과 디렉터리 경로명의 추상적 표현
파일 이름 변경, 삭제, 디렉터리 생성,  크기 등 파일 관리
	- File 객체는 파일 읽고 쓰기 기능 없음
	- 파일 입출력은  파일 스트림 이용

*/