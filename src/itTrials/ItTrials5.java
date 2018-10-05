package itTrials;
import java.util.Scanner;
 
public class ItTrials5 {

   public static void main(String args[])
   {
      int n, reverse = 4;
         
      System.out.println("Enter an integer to reverse");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
         
      while(n != 0)
      {
          reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;
      }
       
      System.out.println("Reverse of the number is " + reverse);
   }
}