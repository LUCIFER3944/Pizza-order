import java.util.Scanner;

public class PizzaOrder {
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

        System.out.println("Price");
        int price = scanner.nextInt();
 

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        System.out.println("Enter discount:");
        int discount = scanner.nextInt();

        System.out.println("Tax");
        double tax=scanner.nextDouble();

     
      

        double totalPrice = 0;

        switch (pizzaChoice) {
            case 1:
                System.out.println("You chose Margherita.");
                totalPrice = quantity * price;
                break;
            case 2:
                System.out.println("You chose Pepperoni.");
                totalPrice = quantity * price;
                break;
            case 3:
                System.out.println("You chose Veggie.");
                totalPrice = quantity * price;
                break;
            case 4:
                System.out.println("You chose BBQ Chicken.");
                totalPrice = quantity * price;
                break;
            case 5:
                System.out.println("You chose Hawaiian.");
                totalPrice = quantity * price;
                break;
            default:
                System.out.println("Invalid choice. Please select a valid pizza.");
                return;
        }

        System.out.println("Costumer name="+Cname);
        System.out.println("Address="+address);
        System.out.println("Costumer mobile number="+mobileNumber);
        System.out.println("Quantity: " + quantity);
        System.out.println("price " + price);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount $" +discount);
        System.out.println("netamout"+(discount- totalPrice));
        System.out.println("tax"+tax);


       
        System.out.println("netamount");
       double netamount = scanner.nextDouble();

    

        System.out.println(netamount*tax/100);

    }
}
