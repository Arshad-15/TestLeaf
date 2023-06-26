package week1.day2;

public class Calculator {
	
	public int addThreeNumbers(int a,int b,int c) {
		return(a+b+c);
 }

	public float subTwoNumbers(int d,float e) {
		return(d-e);

	}
	
	public int divideTwoNumbers(int f, int g ) {
		return(f/g);

	}
	
	public static void main(String[] args) {
		Calculator sum = new Calculator();
		int addThreenumbers = sum.addThreeNumbers(5,6,9);
		System.out.println(addThreenumbers);
		
		System.out.println(sum.subTwoNumbers(9, 7));
		
		//int divideTwoNumbers = sum.divideTwoNumbers(20, 4);
		//System.out.println(divideTwoNumbers);
		
		System.out.println(sum.divideTwoNumbers(20, 7));
	}
	
}
