package inputandoutput;

import java.util.Scanner;

public class SumAdditionMultiplySubtractDivideAndRemainder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		  System.out.print("Please enter your first integer: ");
		  int a = input.nextInt();
		  System.out.print("Please enter your second integer: ");
          int b = input.nextInt();
          System.out.println("The final products is: " + (a + b));
          System.out.println("The final products is: " + (a - b));
          System.out.println("The final products is: " + a * b);
          System.out.println("The final products is: " + a / b);
          System.out.println("The final products is: " + a % b);
	}

}
