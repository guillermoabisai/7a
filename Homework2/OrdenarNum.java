import java.util.Scanner;

public class OrdenarNum{
    public static void main(String[] args){
    int num1,num2,num3,num4,num5,a, b, c, d, e;

		System.out.println("Ingrese 5 numeros a continuación: ");
		Scanner type = new Scanner(System.in);

		System.out.println("Ingrese el valor de n1: ");
		num1 = type.nextInt();
		System.out.println("Ingrese el valor de n2: ");
		num2 = type.nextInt();
		System.out.println("Ingrese el valor de n3: ");
		num3 = type.nextInt();
		System.out.println("Ingrese el valor de n4: ");
		num4 = type.nextInt();
		System.out.println("Ingrese el valor de n5: ");
		num5 = type.nextInt();

		a = num1;
		b = num2;
		c = num3;
		d = num4;
		e = num5;


		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5)
			a = num1;
		if (num1 < num2 && num1 > num3 && num1 > num4 && num1 > num5)
			b = num1;
		if (num1 < num2 && num1 < num3 && num1 > num4 && num1 > num5)
			c = num1;
		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 > num5)
			d = num1;
		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5)
			e = num1;

		// Comparamos el valor de la var 2 vs las demas

		if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5)
			a = num2;
		if (num2 < num1 && num2 > num3 && num2 > num4 && num2 > num5)
			b = num2;
		if (num2 < num1 && num2 < num3 && num2 > num4 && num2 > num5)
			c = num2;
		if (num2 < num1 && num2 < num3 && num2 < num4 && num2 > num5)
			d = num2;
		if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5)
			e = num2;


		if (num3 > num2 && num3 > num1 && num3 > num4 && num3 > num5)
			a = num3;
		if (num3 < num2 && num3 > num1 && num3 > num4 && num3 > num5)
			b = num3;
		if (num3 < num2 && num3 < num1 && num3 > num4 && num3 > num5)
			c = num3;
		if (num3 < num2 && num3 < num1 && num3 < num4 && num3 > num5)
			d = num3;
		if (num3 < num2 && num3 < num1 && num3 < num4 && num3 < num5)
			e = num3;


		if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5)
			a = num4;
		if (num4 < num1 && num4 > num2 && num4 > num3 && num4 > num5)
			b = num4;
		if (num4 < num1 && num4 < num2 && num4 > num3 && num4 > num5)
			c = num4;
		if (num4 < num1 && num4 < num2 && num4 < num3 && num4 > num5)
			d = num4;
		if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5)
			e = num4;
		System.out.print("El orden de mayor a menor es el siguiente: " + " "
				+ a + " " + b + " " + c + " " + d + " " + e);
}

}
