package day06;

public class Test05_0409 {

	public static void main(String[] args) {
		double i;
		for(i=1; i<=15; i++) {
			System.out.printf("%5.0f", i);
			if(i/5==1) {
				System.out.println("");
				System.out.println("                        ★");
			}else if(i/10==1) {
				System.out.println("");
				System.out.println("   ☎");
			}
		}

	}

}
