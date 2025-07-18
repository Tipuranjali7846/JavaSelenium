package Day12;

public class PassingParamsToMainMethod {
	
	public static void main(String[] args) {
		
		for(String a:args) {
			System.out.println(a);
		}
		
		System.out.println(args.length);
		
	}

}
