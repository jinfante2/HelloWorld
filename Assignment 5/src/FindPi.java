public class FindPi {

	public static void main(String[] args) {
		
		double PI = 0;
		long startTime = System.nanoTime();
		
		for (int i = 0; i < 2500000; i++) {
			PI += Math.pow(-1, i) * 4 / (2*i+1);
			   
			System.out.println("PI is " + PI + " after "+ (i+1) +" iterations");
			
		}
		
		long endTime = System.nanoTime();
		long time = endTime - startTime;
		
		System.out.println("It took " + time + "seconds to complete this operation.");

	}

}
