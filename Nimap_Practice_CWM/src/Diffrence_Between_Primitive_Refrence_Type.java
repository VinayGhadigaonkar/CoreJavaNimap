import java.awt.Point;

public class Diffrence_Between_Primitive_Refrence_Type {

	public static void main(String[] args) {
		
		/*This is exmple of Primitive type
		 * This values are not Dependent on each other
		 *  A is not depend on each other 
		 * byte A = 10; byte b = A; A = 11; System.out.println(b);
		 */
		
		//Refrence Type Example 
		Point point = new Point(1,1);
		Point point2 = point;
		point2.x = 20;
		System.out.println(point);
		
	}

}
