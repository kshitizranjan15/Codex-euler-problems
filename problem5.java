//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class problem5
{
	public static void main(String[] arg) { 
	      int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; 
	      System.out.println(lcm(arr)); 	} 

		public static long lcm(int[] array){ 
		        long lcm = 1; 
		        int r = 2; 
		          
		        while (true) { 
		            int counter = 0; 
		            boolean loop = false; 
		              
		            for (int i = 0; i < array.length; i++) { 
		  
		                if (array[i] == 0) { 
		                    return 0; 
		                } 
		               
		                if (array[i] == 1) { 
		                    counter++; 
		                }  
		                if (array[i] % r == 0) { 
		                    loop = true; 
		                    array[i] = array[i] / r; 
		                } 
		            } 
		            if (loop) { 
		                lcm = lcm * r; 
		            } 
		            else { 
		                r++; 
		            }  
		            if (counter == array.length) { 
		                return lcm; 
		            } 
		        } 
		    } 

}
//output:-232792560
