package trycatch;

public class ControlFlow {
    public static void main(String[] args) {
		System.out.println("stmnt1");
	//	System.out.println("stmnt2");
		System.out.println("stmnt3");
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("stmnt4");
		}
		    System.out.println("stmnt5");
		
	}
}
