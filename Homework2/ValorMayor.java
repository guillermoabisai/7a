//Se desea implementar un programa para determinar
// cual de dos Valores proporcionados es mayor.

import java.util.Scanner;


public class ValorMayor{
  public static void main(String[] args) {
    int A,B,M;

    System.out.println("Enter two different values: ");
    Scanner type =new Scanner(System.in);
    System.out.println("Enter the first value");
    A=type.nextInt();
    System.out.println("Enter the two value");
    B=type.nextInt();

    if(A > B){
      M=A;
    }else if(B > A){
    M=B;
    }
  System.out.println("the highest value is :"+ M);


  }

}
