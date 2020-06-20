//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class problem5 
{
	public static void main(String[] arg) { 
	      for(int i=20; i>=1; i+=20)
	      {
	    	  if(divisible(i))
	    	  {
	    		  System.out.println(i);
	    		  break;
	    	  }
	      }
		    } 
	public static boolean divisible(int x)
	{
		int count=0;
		for(int i=1; i<=20; i++)
		{
			if(x%i==0)
			{
				count++;
			}
		}
		if(count==20)
			return true;
		else 
			return false;
	}

}
//output:-232792560
