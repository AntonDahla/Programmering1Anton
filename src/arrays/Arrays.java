package arrays;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		 int[] intArray = new int[15];
		 //En lista med sammasatta datatyper 
	     
		 System.out.println(intArray[1]);
            
		 intArray[0] = 12312;
		 intArray[1] = 12312;
		 intArray[2] = 12312;
		 intArray[3] = 12312;
		 intArray[4] = 12312;

		 //ArrayList
         ArrayList arraylist = new ArrayList();	
 	   
	     System.out.println(intArray[0]);
	     System.out.println(intArray[1]);

	      
	     int[] intArray2 = { 215, 548 , 4547, 459, 666 };
	     
	     System.out.println(intArray2[0]);
	     System.out.println(intArray2[1]);
	     System.out.println(intArray2[3]);
	     
	     //Beräknar längden på intArray2 
	     System.out.println(intArray2.length);

	     //ArrayList
	     ArrayList arrayList = new ArrayList();
	     arrayList.add(1234);
	     arrayList.add(5678);
	     arrayList.add(9101112);
	     arrayList.add(13141516);
	     
	     System.out.println("Size:" + arrayList.size());
	     System.out.println("Get:" + arrayList.get(0));
	     
	     
	     for (int i = 0; i < intArray.length; i++) {
	    	System.out.println("Loop(Index: " + i + ", Value: "+ intArray[i] + ")");
	    	
	     }
	     
	     System.out.println("Size:" + arrayList.size());


         
        		 
	     }          		 
	}



