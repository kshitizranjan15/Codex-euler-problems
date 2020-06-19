//Find The largest palindrome made from the product of two 3-digit numbers.
public class problem4
 {

	public static void main(String[] args)
	{
		int max=1;;
		int m=1;
		int l=0;
		int n=0;
		for(int i=999; i>=100 ;i--)
		{
			for(int j=999; j>=100; j--)
			{
				int rev=0;
				max= i * j;
				int temp=max;
				while(max!=0)
				{
				int d= max % 10;
				rev= rev * 10 + d;
				max/=10;
				}
                if(temp == rev && rev>m)
                {
                	m=rev;
                	l=i;
                	n=j;
				
                }
                
			}
			
		}
         	 System.out.println(l+"*"+n+"="+m);    
	}
           
}
//output:-993*913=906609
