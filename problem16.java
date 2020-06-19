//What is the sum of the digits of the number 2^1000 ?
public class problem16
 {

	public static void main(String[] args) 
	{
		int sum=0;
		int x=(int)Math.pow(2,1000);
		System.out.println(x);
      int NoOfDigit=(int)Math.log10(x) + 1;
      System.out.println(NoOfDigit);
      int temp=x;
      while(temp>0)
      {
    	  int lastdigit= temp%10;
    	  temp/=10;
    	  sum=sum + lastdigit;
    	  
      }
      System.out.println("The sum of digits of "+x+" is "+sum);
	}

}
//outputs:-
//2147483647
//10
//The sum of digits of 2147483647 is 46
