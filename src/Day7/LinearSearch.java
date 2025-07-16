package Day7;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// Searching an element in an array
		int arr[]= {10,30,20,60,80,90};
		boolean status=false;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Search Number:");
		int srchNum=sc.nextInt();
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==srchNum) {
				System.out.println("Element Found");
				status=true;
				break;
			}
		}
		if(status== false) {
			System.out.println("Element not found");
		}

	}

}
