package week1.day1;

public class FibbinocciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		int max = 90;
		System.out.println(a);
		System.out.println(b);
		for (int i = a; i<=max; i++)
		
		{
		if (c<max) {
			c= a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		} 
				

	}

}
