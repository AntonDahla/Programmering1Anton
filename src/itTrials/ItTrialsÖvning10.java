package itTrials;

import java.util.*;
public class ItTrials÷vning10 {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first integer number: ");
        int x = in.nextInt();  
		System.out.print("Input the second integer number: ");
        int y = in.nextInt(); 
        System.out.print("The result is: "+calculate(x, y));
		System.out.printf("\n");
    }

  public static boolean calculate(int a, int s)
   {
	if(a == 15 || s == 15)
		return true;
	return ((a + s) == 15 || Math.abs(a - s) == 15);
   }
}