package assignments19122023;

public class Assignment19thDec2023 {

	public static void main(String[] args) {

	//1.Leap Year

		int year = 1990;
		if(year%4==0) {
			System.out.println("The given year is Leap");
		}else {
			System.out.println("The given year is Non-Leap year");
		}
	//2.Student Marks
		
	int marks=34;
	if(marks<35) {
	System.out.println("Student is Fail");	
	}else
	if(marks>=35 && marks<45) {
		System.out.println("Pass");
	}else if(marks>=45 && marks<55) {
		System.out.println("D grade");
	}else if(marks>=55 && marks<65) {
		System.out.println("C grade");
	}else if(marks>=65 && marks<85) {
		System.out.println("B grade");
	}else if(marks>=85 && marks<=100) {
		System.out.println("A Grade");
	}else if(marks>100) {
		System.out.println("Invalid marks");
	}
	
	//3.Months
	
	int month =12;
	switch(month) {
	case 1: System.out.println("January");break;
	case 2: System.out.println("Febraury");break;
	case 3: System.out.println("March");break;
	case 4: System.out.println("April");break;
	case 5: System.out.println("May");break;
	case 6: System.out.println("June");break;
	case 7: System.out.println("July");break;
	case 8: System.out.println("August");break;
	case 9: System.out.println("September");break;
	case 10: System.out.println("October");break;
	case 11: System.out.println("November");break;
	case 12: System.out.println("December");break;
	default:System.out.println("Invalid Month");
	
	}
	
	//4.Even or Odd
	int num = 24;
	if(num%2==0) {
		System.out.println("The given Number is Even");
	}else {
		System.out.println("The given Nmuber is Odd");
	}
		
	//5.Vowels and Consonants
	char word ='E';
	if(word=='A'|| word=='E'||word=='I'||word=='O'||word=='U') {
	System.out.println("The Given Word is Vowel");
		}else {
			System.out.println("The Given Word is Consonant");
		}
	
}
}	
  


