/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javax.swing.JOptionPane;
/**
 *
 * @author cesar
 */
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
