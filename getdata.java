import java.util.Scanner;

public class getdata {
    private String cname;
    private String address;
    private long mobileNumber;
    private int pizzaChoice;
    private int price;
    private int quantity;
    private int discount;
    private double tax;

    public void getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your customer name:");
        cname = scanner.nextLine();

        System.out.println("Enter your customer Address:");
        address = scanner.nextLine();

        System.out.println("Enter your Mobile number:");
        mobileNumber = scanner.nextLong();

        System.out.println("Choose a pizza: \n 1. Margherita,\n 2. Pepperoni,\n 3. Veggie,\n 4. BBQ Chicken, \n 5. Hawaiian");
        pizzaChoice = scanner.nextInt();

        System.out.println("Price:");
        price = scanner.nextInt();

        System.out.println("Enter quantity:");
        quantity = scanner.nextInt();

        System.out.println("Enter discount:");
        discount = scanner.nextInt();

        System.out.println("Tax:");
        tax = scanner.nextDouble();
    }
}
