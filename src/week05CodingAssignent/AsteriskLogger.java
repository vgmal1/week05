package week05CodingAssignent;

public class AsteriskLogger implements Logger{
	
	public void log(String str) {
		System.out.println("***" + str + "***");
	}
	
	public void error(String str) {
		System.out.println("******************" + "\n***ERROR: " + str + "***\n" + "******************");
	}
}
