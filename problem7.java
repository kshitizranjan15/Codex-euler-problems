//Find the sum of all primes below two million.
public class problem7 {

	public static void main(String[] args) {
		int nofprime=1;
		int num=1;
		while(nofprime<10001)
		{
			num+=2;
			if(isPrime(num))
				nofprime++;
		}
		System.out.println(num);
	}
	public static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
		else if(num==2)
			return true;
		else if(num%2==0)
			return false;
		else {
			int count=3;
			while(count*count<=num)
			{
				if(num%count==0)
					return false;
				count+=2;
			}
			return true;
		}
	}
}
//output:-104743
