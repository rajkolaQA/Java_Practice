package myPractice;

import java.util.Scanner;

public class VowelsOrConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word");
		char word = sc.next().charAt(0);
		if(word=='A'|| word=='E' || word=='I' || word=='O'|| word=='U' ) {
			System.out.println("The Given Word is Vowel");
		}else {
			System.out.println("The Given Word is Consonant");
		}
			

	}

}
