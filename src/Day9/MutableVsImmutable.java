package Day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		int a[]= {10,50,80,60,20};
		int[] b=a;
		 Arrays.sort(a);
		 System.out.println(Arrays.toString(a));
		 System.out.println(Arrays.toString(b));
		 
		 

	}

}
