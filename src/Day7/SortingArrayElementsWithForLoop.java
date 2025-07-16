package Day7;

public class SortingArrayElementsWithForLoop {

	public static void main(String[] args) {
		int arr[] = { 10, 40, 60, 80, 50 };
		int temp = 0;
		for (int i=0 ; i < arr.length; i++) {
			for (int j =i+1 ; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] =arr[i];
					arr[i] = temp;
					

				}
			}
		
		}

		for(int val:arr) {
			System.out.println(val);
		}

	}

}
