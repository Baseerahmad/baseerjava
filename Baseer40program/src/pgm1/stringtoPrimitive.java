package pgm1;
//Write a program which will take a string as input and will convert it into other primitive data types.
public class stringtoPrimitive {
	public static void main(String[] args) {
	
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Converted to char Value of         a: "+a);
		
		int b=a;
		System.out.println("Converted char to int Value of     b: "+b);
		
		float c=a;
		System.out.println("Converted int to floart Value of   c: "+c);
		
		long d=a;
		System.out.println("Converted float to long Value of   d: "+d);
		
		double e=a;
		System.out.println("Converted long to double Value of  e: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		
		double X=23.67;
		
		int y=(int) X;
		
		System.out.println("Converted double "+a+ " to int "+b);
		
	}
}

