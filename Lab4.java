import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";
		int userInput;
		long factorial;
		System.out.println("Welcome to the Factorial Calculator!");

		while (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {
			System.out.println("Please enter an integer that's greater than 0 but less than 10: ");
			userInput = scan1.nextInt();
			scan1.nextLine();
			factorial = 1;
			for (int i = userInput; i > 0; i--) {
				factorial = factorial * i;

			}

			System.out.println("The factorial of " + userInput + " is " + factorial);

			System.out.println("Do you want to continue?  Please enter yes or no");
			choice = scan1.nextLine();
		}
		System.out.println("See you later! It's been real!");
		scan1.close();
	}

}
