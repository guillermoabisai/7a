import javax.swing.JOptionPane;
public class Consultorio{
  public static void main(String[] args) {

    int NC  = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de consultas "));
int TOT;
int CC;
    if(NC <= 3){
      CC =200;
      TOT = NC * CC;
       JOptionPane.showMessageDialog(null,"Tu pago por cita es de "+CC);
       JOptionPane.showMessageDialog(null,"Tu pago por tratamiento es de "+TOT);
    }else if (NC >3 && NC <=5) {
      CC =150;
      TOT = NC * CC;
       JOptionPane.showMessageDialog(null,"Tu pago por cita es de "+CC);
       JOptionPane.showMessageDialog(null,"Tu pago por tratamiento es de "+TOT);
    }else if( NC >5 && NC <=8){
      CC =100;
      TOT = NC * CC;
       JOptionPane.showMessageDialog(null,"Tu pago por cita es de "+CC);
       JOptionPane.showMessageDialog(null,"Tu pago por tratamiento es de "+TOT);
    }else if( NC >8){
      CC =50;
      TOT = NC * CC;
       JOptionPane.showMessageDialog(null,"Tu pago por cita es de "+CC);
       JOptionPane.showMessageDialog(null,"Tu pago por tratamiento es de "+TOT);
    }

  }
}
