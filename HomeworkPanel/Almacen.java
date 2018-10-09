import javax.swing.JOptionPane;

public class Almacen{
  public static void main(String[] args) {

    int CT = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cantidad a pagar "));
int DE;
int PF;
    if(CT >= 2500){
      DE=(CT*15) / 100;
      PF = CT - DE;
      JOptionPane.showMessageDialog(null,"Tu pago con descuento del %15 es de "+PF);
    }else if(CT <2500){
      DE=(CT*8) / 100;
      PF = CT - DE;
      JOptionPane.showMessageDialog(null,"Tu pago con descuento del %8 es de "+PF);
    }

  }
  }
