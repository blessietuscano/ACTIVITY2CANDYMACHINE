package blessietuscanoAct2;
import java.util.Scanner;

public class CandyMachine {

  public static void main(String [] args) {
  
  Scanner scan = new Scanner(System.in);
  System.out.print("Welcome to Magical candies Machine!");
  scan.next();
  
 
  //String CandyMachine[] = {"Champi", "Gummy worms", "Gotcha", "Yakee"};
  //String Price[] = {"2", "2", "2"}, "2";
  
  System.out.println("CandyMachine Items!");
  
  
  
  System.out.println("Champi        [2]");
  System.out.println("Gummy worms   [2]");
  System.out.println("Gotcha        [2]");
  System.out.println("Yakee         [2]");
  
  System.out.println("What do you want to buy?");
   String name = scan.next();

  System.out.println("How many?");
  scan.next();
 
  System.out.println("Pay your bill");
   scan.next();
  
  System.out.println("This is your Items Ma'am/Sir!");
   scan.next();
   
  System.out.println("Thank you!,Have a Great Day!");
   scan.next();
  
  
  
  
  
}

} 
