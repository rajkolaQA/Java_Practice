package assignment20122023;

public class OrangeMango1to50 {

	public static void main(String[] args) {
		int num=50;
		for(int i=1;i<=num;i++) {
			if(i%3==0) {
				System.out.println("Orange");
			}else if(i%5==0) {
				System.out.println("Mango");
			}else if(i%3==0 && i%5==0) {
				System.out.println("OrangeMango");
			}else {
				System.out.println(i);
			}
		}

	}

}
