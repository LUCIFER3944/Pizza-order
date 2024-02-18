import java.util.Scanner;

public class pizzaOrder2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your customer name:");
        String customerName = scanner.nextLine();

        System.out.println("Enter your customer Address:");
        String address = scanner.nextLine();

        System.out.println("Enter your Mobile number:");
        long mobileNumber = scanner.nextLong();

        System.out.println("Choose a pizza: \n 1. Margherita,\n 2. Pepperoni,\n 3. Veggie,\n 4. BBQ Chicken, \n 5. Hawaiian");
        int pizzaChoice = scanner.nextInt();

        System.out.println("Enter price:");
        int price = scanner.nextInt();

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        System.out.println("Enter discount:");
        int discount = scanner.nextInt();

        System.out.println("Enter tax:");
        double tax = scanner.nextDouble();

        double totalPrice = calculateTotalPrice(pizzaChoice, quantity, price);
        displayOrderDetails(customerName, address, mobileNumber, quantity, price, totalPrice, discount, tax);
    }

    public static double calculateTotalPrice(int pizzaChoice, int quantity, int price) {
        switch (pizzaChoice) {
            case 1:
                return Margherita(quantity, price);
            case 2:
                return Pepperoni(quantity, price);
            case 3:
                return Veggie(quantity, price);
            case 4:
                return BBQChicken(quantity, price);
            case 5:
                return Hawaiian(quantity, price);
            default:
                System.out.println("Invalid choice. Please select a valid pizza.");
                return 0;
        }
    }

    public static void displayOrderDetails(String customerName, String address, long mobileNumber,
                                          int quantity, int price, double totalPrice, int discount, double tax) {
        System.out.println("Customer name: " + customerName);
        System.out.println("Address: " + address);
        System.out.println("Customer mobile number: " + mobileNumber);
        System.out.printf("Quantity: %d\n", quantity);
        System.out.printf("Price: $%d\n", price);
        System.out.printf("Total Price: $%.2f\n", totalPrice);
        System.out.printf("Discount: $%d\n", discount);
        System.out.printf("Net amount: $%.2f\n", totalPrice - discount);
        System.out.printf("Tax: $%.2f\n", totalPrice * tax / 100);
    }

    // Rest of your pizza methods remain unchanged
    // ...

    public static double Margherita(int quantity, int price) {
        System.out.println("You chose Margherita.");
        return quantity * price;
    }

    public static double Pepperoni(int quantity, int price) {
        System.out.println("You chose Pepperoni.");
        return quantity * price;
    }

    public static double Veggie(int quantity, int price) {
        System.out.println("You chose Veggie.");
        return quantity * price;
    }

    public static double BBQChicken(int quantity, int price) {
        System.out.println("You chose BBQ Chicken.");
        return quantity * price;
    }

    public static double Hawaiian(int quantity, int price) {
        System.out.println("You chose Hawaiian.");
        return quantity * price;
    }
}
