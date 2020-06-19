//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
import java.util.Scanner;
public class problem5 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,n,a;
		n=1000000000;
		for(i=2;i<n;i++)
		{
			if(i%2==0 && i%3==0 && i%4==0 && i%5==0 && i%6==0 && i%7==0 && i%8==0 && i%9==0 && i%10==0 && i%11==0 && i%12==0 && i%13==0 && i%14==0 && i%15==0 && i%16==0 && i%17==0 && i%18==0 && i%19==0 && i%20==0)
			{
				System.out.println(i);
				break;
			}
			
		}
		
		
	}

}
//output:-232792560
