import java.util.Scanner;

public class PartyAffiliation {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String polParty = "";
        System.out.print("Enter your political party affiliation [D/R/I/Other]: ");
        polParty = in.nextLine();
        if(polParty.equals("D")){
            System.out.println("You get a Democratic Donkey.");
        } else if (polParty.equals("R")){
            System.out.println("You get a Republican Elephant.");
        } else if (polParty.equals("I")){
            System.out.println("You get an Independent Man.");
        } else {
            System.out.println("I'm sorry, but we don't have your party on file.");
        }
    }
}
