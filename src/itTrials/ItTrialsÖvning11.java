package itTrials;

import java.util.*;
 public class ItTrials÷vning11 {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
		int a = in.nextInt(); 
		System.out.print("The number of prime numbers: "+countPrimes(a));
		System.out.printf("\n");
	}

       public static int countPrimes(int y)
    {
        if(y <= 0 || y == 1 || y == 2) 
			return 0;
        else if(y == 3) 
			return 1;
        BitSet set = new BitSet();
        y = y - 1;
        int s = (int)Math.sqrt(y);
        int ctr = y;
        for(int p = 2; p <= s; p ++)
        {
            if(!set.get(p))
            {
                for(int q = 2; (p * q) <= y; q ++)
                {
                    if(!set.get(p * q))
                    {
                        ctr --;
                        set.set(p * q);
                    }
                }
            }
        }
        return ctr - 1;
    }        
 }