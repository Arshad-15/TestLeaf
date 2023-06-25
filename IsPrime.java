package week1.day1;

public class IsPrime 
{

	public static void main(String[] args)
{
		int i =13;
		boolean Prime = true;
		for (int j=2; j<i; j++)
{
			if(j%i==0) {
				
				Prime=false;
				break;
						
			} 
   }
		
	if(Prime) {
		System.out.println(i +"is a prime numer");
	}
	else
	{
		System.out.println(i +"is not a prime number");
	}
	}

}
