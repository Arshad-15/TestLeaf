package week1.day3;

public class SquareRoot {

	public static void main(String[] args) {

		int X = 17;
		int i;
		for (i = 1; i < X; ++i) {
			int p = i * i;
			if (p == X) {
				// perfect square
				System.out.println(i);
				break;
			}
			 if (p > X) { 
				// found left part of decimal return
				System.out.println(i-1);
				break;
			}
		}

	}

}
