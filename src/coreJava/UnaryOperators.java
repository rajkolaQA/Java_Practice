package coreJava;

public class UnaryOperators {

	public static void main(String[] args) {
		//1.Increment Operators(++)>>1.Pre-Increment(++a) and Post Increment(a++)
		//2. Decrement Operators(--)>>1.Pre-Decrement(--a) and Post Decrement(a--)
    
		//Pre-Increment
		//int a = 10;
		//int b = ++a;
		//System.out.println(b);// (11)Pre-Increment: first add the value and then assign
		//System.out.println(a);// 
        
		//Post Increment 
		//int a = 10;
		//int b = a++;
		//System.out.println(b);//(10)Post Increment: First assign the value and then add
		//System.out.println(a);// here a=11
		
	    //Pre-Decrement
		//int a = 20;
		//int b = --a;
		//System.out.println(b);//(19) In this first decrease the value and then assign
		
		//Post-Decrement
		int a = 20;
		int b = a--;
		System.out.println(b);//(20)in this first assign the value and then decreased
		System.out.println(a);//here a=19
		
		
		
		

	}

}
