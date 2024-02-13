import java.util.Scanner;

public class pizzaOrder1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your customer name:");
        String Cname = scanner.nextLine();

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

        double totalPrice = 0;

        switch (pizzaChoice) {
            case 1:
                totalPrice = Margherita(quantity, price);
                break;
            case 2:
                totalPrice = Pepperoni(quantity, price);
                break;
            case 3:
                totalPrice = Veggie(quantity, price);
                break;
            case 4:
                totalPrice = BBQChicken(quantity, price);
                break;
            case 5:
                totalPrice = Hawaiian(quantity, price);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid pizza.");
                return;
        }

        System.out.println("Customer name: " + Cname);
        System.out.println("Address: " + address);
        System.out.println("Customer mobile number: " + mobileNumber);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount: $" + discount);
        System.out.println("Net amount: $" + (totalPrice - discount));
        System.out.println("Tax: $" + (totalPrice * tax / 100));
    }

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