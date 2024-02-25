import java.util.Scanner;

public class pizzaOrder4 {
    private String Cname;
    private String address;
    private long mobileNumber;
    private int pizzaChoice;
    private int price;
    private int quantity;
    private int discount;
    private double tax;
    private double totalPrice;

    public static void main(String[] args) {
        pizzaOrder4 pizzaOrder = new pizzaOrder4();
        calculatedata ob = new calculatedata();
        getdata od = new getdata();
    
        od.getdata();  // Gather input data
        ob.calculatedata();  // Perform calculations
    
        pizzaOrder.showdata();  
    }


    

    public void showdata() {
        System.out.println("Costumer name=" + Cname);
        System.out.println("Address=" + address);
        System.out.println("Costumer mobile number=" + mobileNumber);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount: $" + discount);
        System.out.println("Net Amount after discount: $" + (totalPrice - discount));
        System.out.println("Tax: " + tax + "%");
        System.out.println("Net Amount after tax: $" + (totalPrice - discount + (totalPrice - discount) * tax / 100));
    }
}
