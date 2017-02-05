package cirlce.java;

public class Drink 
{

	public static void main(String[] args) 
	{ // begin main
		
		int customers = 12467;
		double perWeek = (.14*customers);
		double citrusDrink = (.64*customers);
		/*this is not correct as 64 percent of energy drink users prefer citrus not 
		64 percent of the customers, should be .14 * .64 * customers. Also include spaces on both sides of operators*/ 
		
		System.out.println("The approximate number of customers who purchase one or more drinks per week is " +(int)perWeek);
		System.out.println("The approximate number of customers who prefer citrus flavored energy drinks is "+(int)citrusDrink);
		
		
		
		

	} // end main

}
