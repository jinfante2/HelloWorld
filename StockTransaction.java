
import java.text.DecimalFormat;


public class StockTransaction {

	public static void main(String[] args) {
		
		DecimalFormat formatter = new DecimalFormat("#0.00");
		final double COMMISSION_RATE = 0.02;
		int purShares = 1000;
		double purStock = 32.87;
		int soldShares = 1000;
		double soldStock = 33.92;
		double brokerBuy = (COMMISSION_RATE*purShares*purStock);
		double brokerSold = (COMMISSION_RATE*soldShares*soldStock);
		double earnedTot = (purShares*purStock);
		double soldTot = (soldShares*soldStock);
		double total = ((soldTot-brokerSold)-(earnedTot-brokerBuy));
		
		System.out.println("Joe paid $"+formatter.format(earnedTot)+"for the stock.");
		System.out.println("Joe paid his broker $"+formatter.format(brokerBuy)+"when he bought the stocks");
		System.out.println("Joe sold the stock for $"+formatter.format(soldStock));
		System.out.println("Joe paid his broker $"+formatter.format(brokerSold)+"when he sold the stock.");
		System.out.println("Joes's total profit was $"+formatter.format(total));
		
		
		
		

	}
	
}
