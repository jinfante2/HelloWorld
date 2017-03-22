import java.util.Scanner;

public class GeneratePassword {

	public static void main(String[] args) {

		int totalNum = 0;

		System.out.println("How many digits would you like to use for a numeric password?");

		Scanner input = new Scanner(System.in);

		totalNum = input.nextInt();

		System.out.println("Your passowrd is ");
		for (int i = 0; i < totalNum; i++) {
			System.out.print(randomGenerator() + " ");
		}
	}

	public static int randomGenerator() {

		int random = (int) (Math.random() * 10);

		return random;

	}

}
