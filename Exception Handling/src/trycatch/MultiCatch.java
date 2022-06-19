package trycatch;

public class MultiCatch {
   public static void main(String[] args) {
	try {
		System.out.println(10/0);
	}
//	catch(Exception e){
		// child first then parent
//	}
//	catch(ArithmeticException e) {
		
//	}
    catch(ArithmeticException e) {}
}}// 2 catch block for same expn not allowed

