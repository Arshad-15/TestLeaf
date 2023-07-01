package week1.day3;
import java.util.*;
public class SingleNumber {

	public static void main(String[] args) {
		int numb []= {11,11,2,3,2,4,6,5,4,6,5};



		Arrays.sort(numb);
		int leng= numb.length;

		for (int i=0; i<leng; i++) 
		{
			if (i==leng-1) 
			{
				System.out.println("Single Number is "+ numb[i]);
			}

			for(int j=i+1; j<leng; j++ ) {

				if (numb[i]==numb[j]) {
					i++;
					break;
				}
				else {

					System.out.println("Single Number is "+ numb[i]);
					break;
				}

			}


		
		}

	}

}


