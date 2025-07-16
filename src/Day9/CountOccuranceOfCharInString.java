package Day9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfCharInString {

	public static void main(String[] args) {
		String s= "welcome to java";
//		char[] a=s.toCharArray();		
//		System.out.println(s.length());		
//		for(int i=0; i<a.length;i++) {	
//			int count = 0;
//			for(int j=0;j<s.length();j++) {				
//				if(a[i]==s.charAt(j)){
//					count++;				
//				}
//
//			}	
//
//		}
		
		int TotallengthOftheString= s.length();
		int lengthOfStringWithoutChar=s.replace("w","").length();
		int count=TotallengthOftheString-lengthOfStringWithoutChar;
		System.out.println(count);
		
		

	}

}

