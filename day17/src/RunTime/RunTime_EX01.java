package RunTime;

public class RunTime_EX01 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		long fr = rt.freeMemory();
		System.out.println("freeMemory = "+fr/1024+"kb");
		long fr2 = rt.totalMemory();
		System.out.println("totalMemory = "+fr2/1024+"kb");
		try {
			rt.exec("C:/Windows/System32/notepad.exe");
			rt.exec("C:/Windows/System32/mspaint.exe");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
