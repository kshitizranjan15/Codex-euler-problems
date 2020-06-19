//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of sum?
import java.util.Scanner;
public class problem6 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,n,i,s1,s2,s3,r;
		s1=0;
		s2=0;
		s3=0;
		System.out.println("Enter The Value Of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			a=i*i;
			s1=s1+a;
		}
		for(i=1;i<=n;i++)
		{
			s2=s2+i;
			s3=s2*s2;
		}
         r=s3-s1;
         System.out.println("The difference between the sum of the squares of the first one hundred naturan numbers and the square of the sum is "+r);
	}

}
//input:-Enter The Value Of n
//100
//output:-The difference between the sum of the squares of the first one hundred naturan numbers and the square of the sum is 25164150
