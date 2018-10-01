//Se requiere obtener el área de la figura 2.3 de la forma A. Para resolver este problema
 //se puede partir de que está formada por tres figuras: dos triángulos rectángulos, con H
 //como hipotenusa y R como uno de los catetos, que también es el radio de la otra figura,
 //una semicircunferencia que forma la parte circular
 import java.util.Scanner;

public class AreaHipotenusa{
  public static void main(String[] args) {

    Scanner input =  new Scanner(System.in);
    System.out.println("Ingresa la base 'R' ");
    int R= input.nextInt();
    System.out.println("Ingresa la Hipotenusa");
    int H= input.nextInt();

    int cateto= (H*H) - (R*R);
    double C=Math.sqrt(cateto);
    double AT= (C*R) /  (2);
    System.out.println("El Area es del triagulo es : " + AT);
    double PI= 3.1416;
    double AC = (PI) * (R*R) / (2);
    System.out.println("El Area es del ciculo es : " + AC);
    double Area= (AT * 2) + (AC);
    System.out.println("El Area es de la figura : " + Area);

  }
}
