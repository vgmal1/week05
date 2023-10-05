package week05CodingAssignent;

public class App {

	public static void main(String[] args) {
		
		//Instantiate AsteriskLogger Class
		AsteriskLogger al = new AsteriskLogger();
		al.log("Hello");
		//Print a space to keep output easily readable
		System.out.println();
		al.error("Hello");
		
		
		//Instantiate SpacedLogger Class
		SpacedLogger sl = new SpacedLogger();
		sl.log("test");
		//Print a space to keep output easily readable
		System.out.println();
		sl.error("test");

	}

}
