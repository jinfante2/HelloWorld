package cirlce.java;

public class Drink 
{

	public static void main(String[] args) 
	{ // begin main
		
		int customers = 12467;
		double perWeek = (.14*customers);
		double citrusDrink = (.64*customers);
		
		System.out.println("The approximate number of customers who purchase one or more drinks per week is " +(int)perWeek);
		System.out.println("The approximate number of customers who prefer citrus flavored energy drinks is "+(int)citrusDrink);
		
		
		
		

	} // end main

}
