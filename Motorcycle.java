import java.util.Scanner;

public class MotorcycleBuying{

  public static void main(String[] args){

    String Stripes; // setting variables
    String Brakes;

    Scanner input = new Scanner(System.in);

    System.out.println("How much does the motorcycle cost?"); //asking for their current cost

    int InitialCost = input.nextInt(); //taking input integer for cost

    System.out.println("Do you want to add stripes on your motorcycle? (yes or no)"); //asking if they want stripes

    Stripes = input.next(); //taking input

    if(Stripes.equals("yes")){ //code to execute if answer is "yes"
      System.out.println("That will cost 250 dollars more"); 
    //testing if update feature is working on .git
    }

  }
}
