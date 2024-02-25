public class calculatedata {
    private int pizzaChoice;
    private int quantity;
    private int price;
    private double totalPrice;

    public void calculatedata() {
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
    }
}
