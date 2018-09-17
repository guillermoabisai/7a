import java.util.Scanner;

public class ComputeChange{
 public static void main(String[] args) {

    Scanner input= new Scanner{System.in};
    System.out.println("Enter sn amount in double");
    double amount = input.nextDouble();
    int cents =(int) (amount * 100);
   //find the number of dollar
   int numberOfDollars =  cents/100;
   cents = cents % 100;

   //find the quarters
   int numberOfDollars = cents/25;
   cents = cents % 25;

   int numberOfDollars = cents/10;
   cents = cents % 10;

   int numberOfDollars= cents/5;
   cents = cents % 5;

   int numberOfDollars = cents;

 System.out.println("Your amoun" + amount +" consist of"+
 "\t"+numberOfDollara+"dollars"+
 "\t"+numberOfDollara+"quarters"+
 "\t"+numberOfDollara+"dimes"+
 "\t"+numberOfDollara+"nickels"+
 "\t"+numberOfDollara+"pennies");



  }
}
