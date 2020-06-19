import java.math.BigInteger;
import java.util.Scanner;

//FIND THE SUM OF THE DIGITS IN THE NUMBER 100! 
public class problem20
 {

	public static void main  (String[]args) 
	
	{
		Scanner sc=new Scanner(System.in);
		
		BigInteger fact=BigInteger.valueOf(1);
		
		for(long i=1; i<=100; i++)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("The value of 100! is "+fact);
		
		
		BigInteger sum=BigInteger.valueOf(0);
		BigInteger zer=BigInteger.valueOf(0);
		while(!fact.equals(zer))
		{
			sum=sum.add(fact.remainder(BigInteger.valueOf(10)));
			fact=fact.divide(BigInteger.valueOf(10));
			
			
		}
		System.out.println(sum);
		
             
		

	}

}
//outputs:-
//The value of 100! is 93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000
//648
