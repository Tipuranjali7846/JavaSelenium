package Day9;

import java.util.Arrays;

public class CountWordsInString {

	public static void main(String[] args) {
		String s="welcome to java";
		String count[]= s.split(" ");
		int length=count.length;
		System.out.println("Number of words in a string is  "+length);
		System.out.println(Arrays.toString(count));
		

	}

}
