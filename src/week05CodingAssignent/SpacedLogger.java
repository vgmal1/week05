package week05CodingAssignent;

public class SpacedLogger implements Logger {
	
	public void log(String str) {
		for (int i=0; i < str.length(); i++) {
			System.out.print(str.charAt(i)+ " ");
		}
		System.out.println();
	}
	
	public void error(String str) {
		System.out.print("ERROR: ");
		for (int i=0; i < str.length(); i++) {
			System.out.print(str.charAt(i)+ " ");
		}
	}

}


	