package PracticeProject1;

public class TypeCasting {
	public static void main(String[] args) {
	//implicit conversion
		System.out.println("Implicit Type Casting");
		char a='D';
		System.out.println("The value of a is "+a);
		int b=a;
		System.out.println("The value of b is "+b);
		float c=a;
		System.out.println("The value of C is "+c);
		long d=a;
		System.out.println("The value of d is "+d);
		double e=a;
		System.out.println("The value of e is "+e);
		
		//explicit conversion
		System.out.println("Explicit Type Casting");
		double x=12.5;
		System.out.println("The value of x is "+x);
		int y=(int)x;
		System.out.println("The value of Y is "+y);

	}
	
	
}
