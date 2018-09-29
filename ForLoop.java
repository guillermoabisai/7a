import javax.swing.JOptionPane;

public class ForLoop{
  public static void main(String[] args) {
    /*For(Inicilizar var,Condicion,Incremento){
    accion1
    accion2
  }*/
  int data;
  int value=0;
  String salida="";
  for(int i=0; i <10; i++){
     salida += value +" x "+(i+1)+" = "+(i+1)*value+"\n";
  do{
    data=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
  JOptionPane.showMessageDialog(null,salida);
}while(data !=0);
}
}
}
