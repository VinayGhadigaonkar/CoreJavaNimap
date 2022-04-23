
public class Type_Casting {
	public static void main(String[] args)
	{
		/*Implicit 
		 * int num = 10; System.out.println("The integer value: "+num); double data
		 * =num; System.out.println(data);
		 */
		
		
		//Double to int Explicit Type Casting.
		/*
		 * double num = 10.99; System.out.println("The Double value "+num);
		 * 
		 * int data = (int)num; System.out.println(data);
		 */
		String s = "1.1";
		
		Double a = 2 + Double.parseDouble(s);
		
		System.out.println(a);
		
		
	}
}
