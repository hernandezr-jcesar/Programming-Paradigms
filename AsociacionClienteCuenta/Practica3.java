package practica3;
import java.util.ArrayList;
public class Practica3 {

    public static void main(String[] args) {
        //1. Declarar dos arraylist uno de cliente y otro de cuenta
        ArrayList <Cliente> cliente=new ArrayList();           
        ArrayList <Cuenta> cuenta=new ArrayList();             
        
        //Crea tres clientes: Lores, Maribel, Mario, y almacenalo en su arraylist       
        cliente.add(new Cliente((byte)10,"Lorea","lorea@gmail.com"));
        cliente.add(new Cliente((byte)20,"Maribel","maribel@gmail.com"));
        cliente.add(new Cliente((byte)30,"Mario","mario@gmail.com"));
        
       //3. Crea tres cuentas y guardalas en su arraylist         
        cuenta.add(new Cuenta((byte)1, "Cuenta1"));      
        cuenta.add(new Cuenta((byte)2, "Cuenta2"));
        cuenta.add(new Cuenta((byte)3, "Cuenta3"));
        //4. Asignar como titulares de la cuenta1 a Lorea y Mario
        cuenta.get(0).RegistrarTitular(cliente.get(0));              
        cuenta.get(0).RegistrarTitular(cliente.get(2));        
        
        //5. Asignar como titulares de la Cuenta2 a Maribel y Lorea
        cuenta.get(1).RegistrarTitular(cliente.get(1));       
        cuenta.get(1).RegistrarTitular(cliente.get(0));
             
        //6. Asignar como titular de la Cuenta3 a Maribel
        cuenta.get(2).RegistrarTitular(cliente.get(1));
        
    Ventana v1 = new Ventana();
    
    String opcion;
        do{
            opcion = v1.input(
                        "MENU PRINCIPAL\n"
                        + "1. Mostrar todos los clientes para elegir uno\n"
                        + "2. Salir del programa\n"                           
                        + "Favor de elegir una opcion\n");
            switch (opcion){
                case "1": 
                    if ((Escojercliente(cliente,cuenta)) == 0){
                        opcion = null;
                    };                   
                break;
                
                case "2": break; 
                default: 
                opcion = null;
                v1.error("Favor de insertar un valor valido!!"); 
            }        
        }while(opcion == null || opcion.equals(""));
        
    
    }
    static public int Escojercliente(ArrayList<Cliente> cliente,ArrayList<Cuenta> cuenta){
        Ventana v1 = new Ventana();
        String clientes= "";
        int i = 1;
        for( Cliente C : cliente )
        { 
        clientes = clientes + i +".- " + C.getNombre()+ "\n";
        i++;
        }
        String opcion;
        
        String info = "";
        String Cuentas = "";
        int numcliente = 0;
        do{
            opcion = v1.input(
                        "CLIENTES:\n"
                        + clientes  
                        + "4. Cerrar sesion\n "
                        + "\n Favor de elegir una opcion\n");
            
            switch (opcion){
                /*
                1.- Lorea
                2.- Maribel
                3.- Mario
                4.-Cerrar sesion
                */
                //Mostrar la informacion de todas las cuentas en forma de lista d
                //las cuales es Titular
                case "1": 
                    info = "";
                    Cuentas = "";
                    numcliente = 0;
                    for(int conta = 0; conta < 3; conta++){
                        if((cliente.get(numcliente).getCuenta().contains(cuenta.get(conta))) == true){
                            Cuentas = Cuentas + cuenta.get(conta).getNum_Cuenta() + " " +cuenta.get(conta).getNombre_Cuenta() + "\n";
                        }
                    }
                    info = info +"Nombre Cliente: "+cliente.get(numcliente).getNombre()+"\n"
                            + "Número Cliente: "+cliente.get(numcliente).getNum_Cliente() + "\n"
                            + "Cuentas de las que es titular: \n"  
                            + Cuentas +"\n";

                    v1.mensaje(info);
                    opcion = null;
                    
                break;
                case "2":
                    info = "";
                    Cuentas = "";
                    numcliente = 1;
                    
                    for(int conta = 0; conta < 3; conta++){
                        if((cliente.get(numcliente).getCuenta().contains(cuenta.get(conta))) == true){
                            Cuentas = Cuentas + cuenta.get(conta).getNum_Cuenta() + " " +cuenta.get(conta).getNombre_Cuenta() + "\n";
                        }
                    }
                    info = info +"Nombre Cliente: "+cliente.get(numcliente).getNombre()+"\n"
                            + "Número Cliente: "+cliente.get(numcliente).getNum_Cliente() + "\n"
                            + "Cuentas de las que es titular: \n"  
                            + Cuentas +"\n";

                    v1.mensaje(info);
                    opcion = null;
                break;
                
                case "3":
                    info = "";
                    Cuentas = "";
                    numcliente = 2;
                    
                    for(int conta = 0; conta < 3; conta++){
                        if((cliente.get(numcliente).getCuenta().contains(cuenta.get(conta))) == true){
                            Cuentas = Cuentas + cuenta.get(conta).getNum_Cuenta() + " " +cuenta.get(conta).getNombre_Cuenta() + "\n";
                        }
                    }
                    info = info +"Nombre Cliente: "+cliente.get(numcliente).getNombre()+"\n"
                            + "Número Cliente: "+cliente.get(numcliente).getNum_Cliente() + "\n"
                            + "Cuentas de las que es titular: \n"  
                            + Cuentas +"\n";

                    v1.mensaje(info);
                    opcion = null;
                break;
                case "4":
                       return 0;
                       
                default: 
                opcion = null;
                v1.error("Favor de insertar un valor valido!!"); 
            }        
        }while(opcion == null || opcion.equals(""));
           return 0;
    }
}
      