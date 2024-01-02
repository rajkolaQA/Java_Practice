package myPractice;

import java.util.Scanner;

public class PrimeOrNotByScannerClass {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}

		if (count==2){
			System.out.println("The Given Number is Prime");
		}else {
			System.out.println("The Given Number is Not Prime");
		}


	}

}
