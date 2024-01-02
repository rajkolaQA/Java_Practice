package stringMethods;

public class Split {

	public static void main(String[] args) {
		
		String str = "Iam from Telangana";
		String[] result = str.split("\\s+");// In this \\s+ is separates words by spaces
		int count = result.length;
		System.out.println(count);
		

	}

}
