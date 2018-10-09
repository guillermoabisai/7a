import javax.swing.JOptionPane;

public class Langosta{
  public static void main(String[] args) {

    int NP = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de personas "));
int TOT;
    if(NP < 200){
      TOT=NP*95;

      JOptionPane.showMessageDialog(null,"Tu presupuesto es de "+TOT);
    }else if (NP > 300) {
      TOT=NP*75;
      JOptionPane.showMessageDialog(null,"Tu presupuesto es de "+TOT);
    }else if( NP >= 200 ||  NP <=300){
      TOT=NP*85;

      JOptionPane.showMessageDialog(null,"Tu presupuesto es de "+TOT);
    }

  }
}
