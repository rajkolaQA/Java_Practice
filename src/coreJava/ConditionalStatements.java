package coreJava;

public class ConditionalStatements {

	public static void main(String[] args) {
		//if condition: it is used to execute the specified block of code,
		//if condition is satisfied
		int a = 10;
		int b = 20;

		if(a<b) {
			System.out.println("if condition");
		}
		
		//if else condition
		int x = 20;
		int y = 30;

		if(x>y) {
			System.out.println("if executed");
		}
		else {
			System.out.println("else executed");
		}
		
        //Nested if
		int d = 6;
		if (d==1) {
			System.out.println("Sunday");
		}else if(d==2) {
			System.out.println("Monday");
		}else if(d==3) {
			System.out.println("Tuesday");
		}else if(d==4) {
			System.out.println("Wednesday");
		}else if(d==5) {
			System.out.println("Thursday");
		}else if (d==6) {
			System.out.println("Friday");
		}else if(d==7) {
			System.out.println("Saturday");
		}else
			System.out.println("Invalid number");

	//Switch Condition
	int day =8;
	switch(day) {
	case 1 : System.out.println("Monday");
	break;
	case 2 : System.out.println("Tuesday");
	break;
	case 3 : System.out.println("Wednesday");
	break;
	case 4 : System.out.println("Thursday");
	break;
	case 5 : System.out.println("Friday");
	break;
	case 6 : System.out.println("Saturday");
	break;
	case 7 : System.out.println("Sunday");
	break;
	default: System.out.println("Invalid Number entered");
	}
	}
}
