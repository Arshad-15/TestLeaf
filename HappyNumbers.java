package week1.day3;

public class HappyNumbers {

	public static void main(String[] args) {
		int x= 10;
		int y = 0;
		int j= (x/10);
		int k= (x%10);
		
		for (int i=1; i<=x; i++) {
			j= (j*j);
			k= (k*k);
			y= j+k;
			j= (y/10);
			k= (y%10);
			
			if (y==1) {
				System.out.println("Given Number is Happy Number= "+x);
				break;
			}
		}
		if (y!=1)
		{
			System.out.println("Given Number is not Happy Number= "+x);
			
	    }
		}

	}


