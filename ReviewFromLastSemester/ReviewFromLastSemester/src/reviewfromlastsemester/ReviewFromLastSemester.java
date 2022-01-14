package reviewfromlastsemester;

import java.util.Scanner;

public class ReviewFromLastSemester {

    public static void main(String[] args) {

        String fullName = "Ali Vandenbossche";
        System.out.println(fullName);
        int product = askUserForTwoNumbersAndReturnTheProduct();
        System.out.println(String.format(
                "The product of your numbers is: %d", product));
    }

    public static int askUserForTwoNumbersAndReturnTheProduct() {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter the first number: ");
                int firstNumber = Integer.parseInt(keyboard.nextLine());
                System.out.println("Enter the second number: ");
                int secondNumber = Integer.parseInt(keyboard.nextLine());
                return firstNumber * secondNumber;
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid number");
            }
        }
    }
}
