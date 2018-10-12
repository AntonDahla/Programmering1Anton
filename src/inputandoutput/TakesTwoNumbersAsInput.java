package inputandoutput;

import java.util.Scanner;

public class TakesTwoNumbersAsInput {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		 System.out.print("Enter an integer: ");
		 int x = input.nextInt();
		 System.out.println("And a new one: ");
		 int a = input.nextInt();
		 System.out.println("The final products is: " + x * a);
		 
	}

}
