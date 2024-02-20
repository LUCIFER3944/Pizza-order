import java.util.Scanner;

public class pizzaOrder3 {
    // Array to store pizza names
    static String[] pizzas = {"Margherita", "Pepperoni", "Veggie", "BBQ Chicken", "Hawaiian"};

    // Display the pizza options
  
    static void displayOptions() {
        System.out.println("Choose a pizza:");
        for (int i = 0; i < pizzas.length; i++) {
            System.out.println((i + 1) + ". " + pizzas[i]);
        }
    }

    // Method to handle Margherita pizza order
    static double orderMargherita(int quantity) {
        System.out.println("You chose Margherita.");
        return quantity * 8.0;  // Assuming the price for Margherita is $8.0
    }

    public static void main(String[] args) {
        // Call the displayOptions method
        displayOptions();

        // Capture user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        // Process user choice
        if (choice == 1) {
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            if (quantity > 0 && quantity <= 5) {
                System.out.println("Total cost: $" + orderMargherita(quantity));
            } else {
                System.out.println("Quantity must be between 1 and 5.");
            }
        } else {
            System.out.println("Invalid choice. Please choose a valid pizza.");
        }

        // Close the scanner
        scanner.close();
    }
}
