package throwkeyword;

public class CaseStudy {
	// 	static ArithmeticException e = new ArithmeticException();
	 	static ArithmeticException e;
	 	
        public static void main(String[] args) {
        	throw e;
}
}
/* 1. if e refers null then we get nullpointerExpn otherwise AE
   2. After throw statement we not allowed to write any statement 
   3. throw allowed for only throwable types

*/