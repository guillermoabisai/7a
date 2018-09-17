import java.util.Sacanner;

public class SimpleifDemo{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter en Integer");
    int number= input.nextInt();
    if(number % 2==0){
    System.out.println("It´s an even number");

    }else{
    System.out.println("It´s an add number");
    }
  }
}
