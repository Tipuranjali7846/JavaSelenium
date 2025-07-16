package Day9;

public class RemoveJunkOrSplCharInString {

	public static void main(String[] args) {
		String s="welco@@@#$%^&m^&*e";
		System.out.println(s.replaceAll("[$&+,:;=?@#|'<>.^*()%!-]", ""));
		
	}

}
