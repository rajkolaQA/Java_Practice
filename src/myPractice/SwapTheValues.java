package myPractice;

public class SwapTheValues {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		//int temp;
		//Method 1:
		// temp=a; //c=10
		// a=b; //a=20
        // b=temp; //b=10
	
		//Method 2:(Without using 3rd Variable)
		a= a+b; //a=30
		b= a-b; //b=10(30-20)
		a=a-b;
		
         System.out.println(a);
         System.out.println(b);
	}

}
