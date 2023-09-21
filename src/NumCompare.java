import java.util.Scanner;

public class NumCompare {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        double firstNum = 0;
        double secondNum = 0;
        String trash = "";
        System.out.print("Enter your first number: ");
        if(in.hasNextDouble()){
            firstNum = in.nextDouble();
            in.nextLine();
            System.out.print("Enter your second number: ");
                if (in.hasNextDouble()){
                    secondNum = in.nextDouble();
                    in.nextLine();
                } else{
                    trash = in.nextLine();
                    System.out.println("You entered " + trash);
                    System.out.println("Please enter only valid numbers");
                    System.exit(0);
                }
                if (firstNum > secondNum){
                    System.out.println(firstNum + " is larger than " + secondNum);
                } else if(secondNum > firstNum){
                    System.out.println(secondNum + " is larger than " + firstNum);
                }else{
                    System.out.println(firstNum + " is equal to " + secondNum);
                }
        } else{
            trash = in.nextLine();
            System.out.println("You entered " + trash);
            System.out.println("Please enter only valid numbers");
        }
    }
}
