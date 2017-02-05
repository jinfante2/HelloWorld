
package cirlce.java;
import java.text.DecimalFormat;

public class Cirlce 
{

	public static void main(String[] args) 
	{ // begin main
		DecimalFormat formatter = new DecimalFormat("#0.0000");
		int radius = 5;
		double diameter;
		double area;
		
		diameter = 2*radius; 
		
		area = Math.PI * radius * radius;
		
		System.out.println("The circle's radius is "+radius);
		System.out.println("The diameter of the circle is "+diameter);
		

		System.out.println("The area of the circle is "+formatter.format(area));
		
	} // end main
	

}
