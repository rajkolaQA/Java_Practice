package assignmentOnString28122023;

public class CountNoOfWords {

	public static void main(String[] args) {
		String name = "Am not a good Boy";
		String[] namearr = name.split("\s+");
		int count = namearr.length;
		System.out.println(count);
	}

}
