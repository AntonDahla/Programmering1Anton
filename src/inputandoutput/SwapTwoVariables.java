package inputandoutput;

public class SwapTwoVariables {

	public static void main(String[] args) {
		  
		  int x = 4;
		  int y = 9;
		  x = x ^ y ^(x = y);
		 System.out.println("Efter vi bytt variablar så är X och y "
				
		              + y + " och " + x); 

	}

}
