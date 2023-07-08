package JavaAssigments;

import java.util.Arrays;

public class FindFirstMissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {2,1,4,6,8,7};
		int len=arr.length;
		Arrays.sort(arr);
		for(int i=1; i<=arr[len-1];i++) {
			if(arr[i-1]!=i) {
				System.out.println("Missing numbers are"+ " "+i);
				break;
			}
		}

	}

}
