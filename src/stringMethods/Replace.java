package stringMethods;

public class Replace {

	public static void main(String[] args) {
		
		String str1 = "Hyderabad";
		String str2 = "Banglore";
		String result = str2.replaceAll(str2, str1);
		System.out.println(str1);
		System.out.println(result);

	}

}
