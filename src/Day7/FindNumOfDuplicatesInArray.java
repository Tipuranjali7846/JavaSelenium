package Day7;

public class FindNumOfDuplicatesInArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,50,60,60,50,60};
		
		int num=60;
		int count=0,even=0,odd=0;
		
		for(int value:arr) {
			if(value == num) {				
				count++;
			}
		}
		System.out.println("No.of repeated values:"+ count);
		
		for(int val:arr) {
			if(val%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println(even +"----"+odd);

	}

}
