package assignment20122023;

public class PrimenNumber {

	public static void main(String[] args) {
		int num=6;
		int count=0;
		for(int i=1;i<=num;i++) {
			if (num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("The Given Number is prime");
		}else {
			System.out.println("The given number is not prime");
		}
	}

}



