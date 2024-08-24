import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the total purchase amount from the user
        System.out.print("Enter the total purchase amount (in Rs): ");
        double totalAmount = scanner.nextDouble();

        // Get the membership status from the user
        System.out.print("Do you have a membership card? (yes/no): ");
        String hasMembership = scanner.next();

        // Initialize discount percentage
        double discountPercentage = 0.0;

        // Determine the discount percentage based on the total purchase amount
        if (totalAmount >= 1000) {
            discountPercentage = 20.0;
        } else if (totalAmount >= 500) {
            discountPercentage = 10.0;
        } else {
            discountPercentage = 5.0;
        }

        // Increase the discount by 5% if the user has a membership card
        if (hasMembership.equalsIgnoreCase("yes")) {
            discountPercentage += 5.0;
        }

        // Calculate the discount amount
        double discountAmount = (discountPercentage / 100) * totalAmount;

        // Calculate the final amount after discount
        double finalAmount = totalAmount - discountAmount;

        // Output the results
        System.out.printf("Total purchase amount: Rs. %.2f\n", totalAmount);
        System.out.printf("Discount percentage: %.2f%%\n", discountPercentage);
        System.out.printf("Discount amount: Rs. %.2f\n", discountAmount);
        System.out.printf("Final amount to be paid: Rs. %.2f\n", finalAmount);

        // Close the scanner
        scanner.close();
    }
}
