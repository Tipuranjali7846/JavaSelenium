package Day7;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		int a[]= {10,50,40,100,30,20};
		
		System.out.println("Before sorting:---");
		for(int array: a) {
			System.out.println(array);
		}
		Arrays.sort(a);
		System.out.println("After sorting:---");
		for(int array: a) {
			System.out.println(array);
		}
		
		
		String s[]= {"A","B","X","Z","X","Y"};
		Arrays.toString(s);
		System.out.println("Before sorting:---");
		System.out.println(s);
		Arrays.sort(s);
		System.out.println("After sorting:---");
		for(String arr:s) {
			System.out.println(arr);
		}
		

	}

}
