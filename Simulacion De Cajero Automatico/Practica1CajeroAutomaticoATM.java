/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1cajeroautomaticoatm;

import javax.swing.JOptionPane;
/**
 *
 * @author cesar
 */
public class Practica1CajeroAutomaticoATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Practica1CajeroAutomaticoATM.menu();
    }
    public static void menu(){
        String opcion;
        int opciones;
        do{
            do{
                opcion = (
                        "MENU PRINCIPAL\n"
                        + "1. Ver saldo\n"
                        + "2. Depositar una cantidad\n"
                        + "3. Retirar una cantidad\n"
                        + "4. Retirar una cantidad\n"            
                        + "Favor de elegir una opcion\n");
            }while(opcion == null || opcion.equals("")); 
            opciones = Integer.parseInt(opcion);
        }while(opciones != 4);
    }
    
    private static float Cuenta(){
        String id;
        String nombre;
        String direccion;
        float saldo = 1500.0f;
        float comision;
        if (saldo <= 1000.0f) {comision = 30.5f ;}
        else{comision = 0;}
        id = "0000001";
        nombre = "Cesar";
        direccion = "Mexico";
        return comision;     
    }
    public static void ventanainput(String mensaje){
        JOptionPane.showInputDialog(mensaje);
    }
    public void ventana(){
        
    }
  
}
