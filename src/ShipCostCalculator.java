import java.util.Scanner;

public class ShipCostCalculator {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        String trash = "";
        System.out.print("Enter the item cost: ");
        if(in.hasNextDouble()){
            itemPrice = in.nextDouble();
            in.nextLine();
            if(itemPrice >= 100){
                System.out.println("Your final price after shipping is $" + itemPrice);
            }
            else{
                itemPrice = itemPrice * 1.02;
                System.out.println("Your final price after shipping is $" + itemPrice);
            }
        }
        else{
            trash = in.nextLine();
            System.out.println("You entered: " + trash + ", please enter a valid number");
        }
    }
}
