/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author cesar
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    /*    
    String id = "0000001";
        String nombre = "Cesar";
        String direccion = "Mexico";;
        static float saldo = 1500.0f;
        float comision = 30.5f;
    */
      
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
    public static void menu(){
        Cuenta c1 = new Cuenta();  
        Ventana v1 = new Ventana();
        
        String opcion;
        int opciones;
        v1.mensaje("Esta es una cuenta de ahorro "
         + "la cual debe de mantener un saldo mínimo de $1000.00 en todo momento,\n" +
        "de lo contrario se cobrará una comisión de $30.50 por manejo de cuenta \n" +
        "por cada vez que se haga una consulta de saldo o hacer un retiro.");
        
        do{
            do{
                 
                opcion = v1.input(
                        "MENU PRINCIPAL\n"
                        + "1. Ver saldo\n"
                        + "2. Depositar una cantidad\n"
                        + "3. Retirar una cantidad\n"
                        + "4. Salir\n"            
                        + "Favor de elegir una opcion\n");
            }while(opcion == null || opcion.equals(""));
            switch (opcion){
                case "1": versaldo(c1,v1); break;
                case "2": depositar(c1,v1); break;
                case "3": retirar(c1,v1); break;
                case "4": break;
                default: v1.error("Favor de insertar un valor valido!!"); break;
            }
            opciones = Integer.parseInt(opcion);
        }while(opciones != 4);
    }
   
     public static void versaldo(Cuenta c, Ventana v){
        if (c.getSaldo() >= 1000){
        v.mensaje("Tu saldo actual es:\n$" + c.getSaldo() + " Pesos");
        }else{
            int confirmar = v.confirmar("Como su cuenta tiene por debajo de lo minimo se le cobraran $30.50 por consulta"
                    + "\n¿Esta de acuerdo?");
             if (confirmar == 0){
                 c.setSaldo(c.getSaldo() - 30.5f);
                 v.mensaje("Tu saldo actual es:\n$" + c.getSaldo() + " Pesos");
             }
             //si = 0
             //no =1
             //cancelar = 2
        }
    }
     
    public static void depositar(Cuenta c, Ventana v){
        String Deposito;
        float deposito;
        
        do{
            Deposito=v.input("¿Cuanto dinero quieres depositar?\nSaldo actual: $" + c.getSaldo() + "pesos");
           
           if(Deposito == null || Deposito.equals("")){
               v.error("Advertencia no puedes salir de esta forma");
           }
           
        }while(Deposito == null || Deposito.equals(""));
         deposito = Float.parseFloat(Deposito);
        if (deposito <= 0.0f){
            v.error("Deposito Invalido");
        }
        else if( deposito > 0.0f){
            c.setSaldo(c.getSaldo() + deposito);
            v.mensaje("El deposito de $" + deposito + " pesos.\nSe ha realizado de forma correcta");
        } 
        
         
    }
    public static void retirar(Cuenta c, Ventana v){
        String Retiro;
        float retiro;  
        
        if (c.getSaldo() >= 1000){ 
            do{
                Retiro = v.input("¿Cuanto dinero quieres retirar?\nSaldo actual: $" + c.getSaldo() + " pesos");
               
                if(Retiro == null ||  Retiro.equals("")){
                    v.error("Advertencia no puedes salir de esta forma");
                }
              
            }while(Retiro == null || Retiro.equals(""));
             retiro = Float.parseFloat(Retiro);
            if (retiro > c.getSaldo()){
                v.error("No puedes retirar mas de lo que tienes en la cuenta\nSaldo actual: $" + c.getSaldo() +" pesos");
            }
            else if(retiro <= 0.0f){
                v.error("Retiro Invalido");
            }
            else{
                c.setSaldo(c.getSaldo() - retiro);
                v.mensaje("El retiro de $" + retiro +"pesos.\nSe ha realizado de forma correcta");
            }
        }
        
        else if(c.getSaldo() < 1000){
             int confirmar;
            confirmar = v.confirmar("Como su cuenta tiene por debajo de lo minimo se le cobraran $30.50 por retiro"
                    + "\n¿Esta de acuerdo?");
             if (confirmar == 0){
                 if (c.getSaldo() > 30.5f){
                 
                   
                        
                  do{
                    Retiro = v.input("¿Cuanto dinero quieres retirar?\nSaldo actual: $" + c.getSaldo() + " pesos");
                    }while(Retiro == null || Retiro.equals(""));
                    retiro = Float.parseFloat(Retiro);
        
                    if (retiro > c.getSaldo()){
                        v.error("No puedes retirar mas de lo que tienes en la cuenta\nSaldo actual: $" + c.getSaldo() +" pesos");
                    }
                    else if(retiro <= 0){
                        v.error("Retiro Invalido");
                    }
                    else{
                        c.setSaldo(c.getSaldo() - retiro);
                        v.mensaje("El retiro de $" + retiro +"pesos.\nSe ha realizado de forma correcta");
                        c.setSaldo(c.getSaldo() - 30.5f);
                    }
                }else{
                 v.mensaje("No se puede realizar ningun retiro pues solo cuenta con la cantidad de $30.5 de comision por retiro ");
                 }
                 
             }
        }
    }
}