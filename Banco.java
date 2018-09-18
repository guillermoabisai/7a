import java.util.Scanner;


public class Banco{
  public static void main(String[] args) {
   Scanner input= new Scanner (System.in);

    System.out.println("What is your credit");
    int LA= input.nextInt();

    System.out.println("What is your type");
    int TT= input.nextInt();

    if (TT>=1){
    int AC = TT * 25 / 100;
    int NC= AC + LA;
    System.out.println("your limete is "+ NC);
}
else if (TT>=2){
int AC = TT * 35 / 100;
int NC= AC + LA;
System.out.println("your limete is "+ NC);
}
else if (TT>=3){
int AC = TT * 40 / 100;
int NC= AC + LA;
System.out.println("your limete is "+ NC);
}
else if (TT>=4){
int AC = TT * 50 / 100;
int NC= AC + LA;
System.out.println("your limete is "+ NC);
}

}
}
