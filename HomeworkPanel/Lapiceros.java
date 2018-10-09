import javax.swing.JOptionPane;
public class Lapiceros{
  public static void main(String[] args) {


    int X = Integer.parseInt(JOptionPane.showInputDialog("How many pencils are? "));

int PAG;
    if(X >= 1000){
      PAG=(X*85);
      JOptionPane.showMessageDialog(null,"You prague "+PAG);
    }else if(X <1000){
      PAG=(X*90);
      JOptionPane.showMessageDialog(null,"You prague "+PAG);
    }

  }
}
