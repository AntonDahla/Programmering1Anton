package input;

import java.util.Scanner;

public class InputTest {
	
	
	public static void main(String[] args) {
		
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = inputScanner.nextLine();
		System.out.println("Hello " + name);
		
		System.out.print("Enter your age(5<age<120): ");
		int age = inputScanner.nextInt();
		
		
		
		if (age > 120) {
			System.out.println("You lying little rat");
			
		} else if(age < 5) {
			System.out.println("Sorry Sir, but you must be older! " + age);
			System.exit(0);
		} else {
			System.out.println("So your age is: " + age);
		}
		
		
		System.out.println("Enter your weight: ");
		double weight = inputScanner.nextDouble();
		
		
		
		if (weight > 500) {
			System.out.println("If that's true, you'd be dead by now.");
			
		} else if(weight < 5) {
			System.out.println("Really? And I'm George W Bush.. get out of here! " + weight);
			System.exit(0);
		} else {
			System.out.println("Oh, okay..trust me, that's a whole lot better than most people: " + weight);
		}
		
	}

}
