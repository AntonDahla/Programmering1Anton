package variableridentifierare;

public class DoubleNumber {
	
	
	
	public static void main(String[] args) {
		 double doubleNumber = 11.0;
		 int integerNumber = 11;
		 
		 
		 boolean equal = doubleNumber == integerNumber;
		 System.out.println(equal);
		 System.out.println(doubleNumber == integerNumber);
		 
		 if (doubleNumber == integerNumber) {
			 System.out.println("double == integer");
		 } else { 
			 System.out.println("double != integer");
		 }
	}

}
