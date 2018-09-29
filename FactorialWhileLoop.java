import javax.swing.JOptionPane;


public class FactorialWhileLoop{
 public static void main(String[] args) {
   //numero para el limente del factorial
   int value=
   Integer.parseInt(JOptionPane.showInputDialog(null,"Enter an int value"));
   //numero del Factorial
   int fact=1;
   //Sentinela
   int i=1;
   while(i <= value){
     fact =fact *i;
     i++;
   }
   JOptionPane.showMessageDialog(null,"El factorial de "+ value +"es "+ fact ,"calcilar Factorial ",JOptionPane.WARNING_MESSAGE );
 }
}
