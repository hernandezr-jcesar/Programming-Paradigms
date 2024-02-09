/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajasdedialogo;

import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class Cajasdedialogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inputValue ;
        do {
        inputValue = JOptionPane.showInputDialog("Ingrese cuantos dolares: ");
        } while (inputValue == null || inputValue.equals(""));
        float dolares=Float.parseFloat(inputValue);
        
        float pesos = dolares*19.5F;
        JOptionPane.showMessageDialog(null, "En pesos seria: " + pesos, "solapa", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
