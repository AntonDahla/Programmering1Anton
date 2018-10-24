package inputandoutput;


public class BinaryNumbers {

	public static void main(String[] args) {
	         
		  int x = 0b10;
		  int y = 0b11; 
		  int z = x+y;
		
		  
		 System.out.println(x + "+" + y + "=" + z);
		 
		 System.out.println(Integer.toBinaryString(x) + "+" + Integer.toBinaryString(y)
		        + "=" + Integer.toBinaryString(z));
	}
		 	 


}
