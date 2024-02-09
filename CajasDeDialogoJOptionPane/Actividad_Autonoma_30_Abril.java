/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_autonoma_30_abril;


import javax.swing.JOptionPane;
/**
 *
 * @author cesar
 */
public class Actividad_Autonoma_30_Abril {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
         String inputValue ;
         String opcion;
        //byte opcion=0;
         int opciones;
        
        do{
           do{
            opcion = JOptionPane.showInputDialog(
            "MENU PRINCIPAL\n"
            + "1.Convertir farenheit a celcius\n"
            + "2.Convertir pesos a Dolares\n"
            + "3.Convertir pulgadas a centimetros\n"
            + "4.Salir\n"
            + "Favor de elegir una opcion");
           }while(opcion == null || opcion.equals(""));
           switch (opcion){
                case "1": 
                    do {
                        inputValue = JOptionPane.showInputDialog("Ingrese la valor en Farenheit");
                    } while (inputValue == null || inputValue.equals(""));
                    float farenheit=Float.parseFloat(inputValue);
                    float celsius = (farenheit - 32)/(1.8F);
                    
                    JOptionPane.showMessageDialog(null, farenheit +" grados farenheit equivalen a: \n" + celsius +" grados Celsius.", "CONVERTIDOR FARENHEIT->CELSIUS", JOptionPane.PLAIN_MESSAGE);
                break;
                case "2": 
                    do {
                        inputValue = JOptionPane.showInputDialog("Ingrese la cantidad de pesos: ");
                    } while (inputValue == null || inputValue.equals(""));
                    float pesos=Float.parseFloat(inputValue);
                    float dolares = pesos/20F;
                    JOptionPane.showMessageDialog(null, pesos +" pesos equivalen a: \n" + dolares+" Dolares.", "CONVERTIDOR PESOS->DOLARES", JOptionPane.PLAIN_MESSAGE);
                break;
                case "3":
                    do  {
                        inputValue = JOptionPane.showInputDialog("Ingrese la cantidad de pulgadas: ");
                    } while (inputValue == null || inputValue.equals(""));
                    float pulgadas=Float.parseFloat(inputValue);
                    float centimetros = pulgadas * 2.54F;
                    JOptionPane.showMessageDialog(null, pulgadas +" pulgadas equivalen a: \n" + centimetros +" Centimetros.", "CONVERTIDOR PULGADAS->CENTIMETROS", JOptionPane.PLAIN_MESSAGE);
                break;
                case "4": break;
                default: 
                JOptionPane.showMessageDialog(null, "Favor de escoger una opcion valida", "ALERTA", JOptionPane.ERROR_MESSAGE); 
                break;
            };
        opciones = Integer.parseInt(opcion);
        }while(opciones != 4 ); 
        System.exit(0);
    }
    
}
