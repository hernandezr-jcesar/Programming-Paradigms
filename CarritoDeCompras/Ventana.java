
package carritodecompras;

import javax.swing.JOptionPane;

public class Ventana {
      public String input(String input){
        return JOptionPane.showInputDialog(input);
    }
    public void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje , "", JOptionPane.PLAIN_MESSAGE);  
    }
    public void error(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje ,"¡¡¡ERROR!!!", JOptionPane.ERROR_MESSAGE);   
    }
    public int confirmar(String mensaje){
        int confirmar = JOptionPane.showConfirmDialog(null,mensaje);
        return confirmar;
    }
}
