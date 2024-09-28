import java.util.Scanner;


class AmountDue {
   
    // Calculate amount due with price and 12% tax
    public double computeAmountDue(double price) {
        return price * 1.03;
    }
   
    // Calculate amount due with price, quantity, and 12% tax
    public double computeAmountDue(double price, int quantity) {
        return (price * quantity) * 1.03;
    }
   
    // Calculate amount due with price, quantity, discount, and 12% tax
    public double computeAmountDue(double price, int quantity, double discount) {
        double totalBeforeTax = (price * quantity) - discount;
        return totalBeforeTax * 1.03;
    }
}


public class RunAmountDue {
    public static void main(String[] args) {
        Scanner lj = new Scanner(System.in);
        AmountDue due = new AmountDue();
       
        System.out.println("Press any of the following then enter values separated by spaces:");
        System.out.println("1. Price only");
        System.out.println("2. Price and quantity");
        System.out.println("3. Price, quantity, and discount amount");
       
        int choice = lj.nextInt();
        double price;
        int quantity;
        double discount;
       
        switch (choice) {
            case 1:
                price = lj.nextDouble();
                System.out.println("Amount due is " + due.computeAmountDue(price));
                break;
            case 2:
                price = lj.nextDouble();
                quantity = lj.nextInt();
                System.out.println("Amount due is " + due.computeAmountDue(price, quantity));
                break;
            case 3:
                price = lj.nextDouble();
                quantity = lj.nextInt();
                discount = lj.nextDouble();
                System.out.println("Amount due is " + due.computeAmountDue(price, quantity, discount));
                break;
            default:
                System.out.println("Invalid choice.");
        }
       
       
    }
}
