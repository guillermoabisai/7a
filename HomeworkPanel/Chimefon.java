import javax.swing.JOptionPane;
public class Chimefon{
 public static void main(String[] args) {

   Double pag;
   Double imp;
   Double tot;
   pag = 0.0;
   imp = 0.0;


   int ti = Integer.parseInt(JOptionPane.showInputDialog("Minutos de llamada"));
   if (ti <= 5) {
     pag = ti * 1.0;
   } else if (ti > 5 && ti <= 8) {
     pag = ((ti - 5) * .80) + 5;
   } else if (ti > 8 && ti <= 10) {
     pag = ((ti - 8) * .70) + 7.4;
   } else if (ti > 10) {
     pag = ((ti - 8) * .70) + 7.4;
   }

   String di = JOptionPane.showInputDialog("ingresa el dia de la llamda ejemplo dimingo o dom");
  if (di.equalsIgnoreCase ("domingo") || di.equalsIgnoreCase ("dom")) {
    imp = (pag * .03) ;
  } else {
    JOptionPane.showInputDialog("ingresa el turno : vespertino o matutino");

    String tu = JOptionPane.showInputDialog("ingresa matutino o vespertino");
    if (tu.equalsIgnoreCase ("matutino")) {
      imp = (pag * .15) ;
    } else if (tu.equalsIgnoreCase ("vespertino")) {
      imp = (pag * .10);
    }
  }
  tot = imp + pag;
  JOptionPane.showMessageDialog(null,"el pago es : $" + pag);
  JOptionPane.showMessageDialog(null,"El impuesto es : $" + imp);
  JOptionPane.showMessageDialog(null,"el tola del pago es : $" + tot);

}


}
