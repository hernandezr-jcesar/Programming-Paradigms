package practica2;

public class Practica2 {
    //Implementar una clase lista la cual debe de contener datos de tipo String
    // y en ella desarrollar 2 versiones de metoddo add();
    public static void main(String[] args) {
    lista palabras = new lista();
    
    palabras.add("Chelas");
    palabras.add("Tacos");
    palabras.add(1, "Huaraches");
    palabras.add("sopes");
    palabras.add(2,"Pulque");
    
    palabras.imprimirCadena();
    
    //menu(palabras);
    }
    public static void menu(lista palabras){    
    Ventana v1 = new Ventana();
    v1.mensaje("Esta practica implementa una clase lista\n"
            + "en la cual se pueden ingresar Strings con\n"
            + "2 versiones desarrolladas de un metodo\n"
            + "llamado add()\n");
   
       
    String opcion;
        do{
            opcion = v1.input(
                        "MENU PRINCIPAL\n"
                        + "1. Agregar Cadena a la lista\n"
                        + "2. Agregar Cadena a la lista en una posicion exacta\n"
                        + "3. Ver todas las cadenas\n"
                        + "4. Salir\n"            
                        + "Favor de elegir una opcion\n");
        
            switch (opcion){
                case "1": 
                    String cadena1;
                    cadena1 = v1.input("Ingresa el String a insertar:");
                    
                    palabras.add(cadena1); 
                break;
                case "2":
                    String cadena2;
                    int pos;
                    cadena2 = v1.input("Ingresa el String a insertar:");
                    String posi;
                    posi = v1.input("Ingresa la posicion para colocar el String:");
                    pos = Integer.parseInt(posi);
                    
                    palabras.add(pos, cadena2); 
                break;
                case "3": palabras.imprimirCadena(); break;
                case "4": break;
                default: 
                opcion = null;
                v1.error("Favor de insertar un valor valido!!"); 
            }        
        }while(opcion == null || opcion.equals(""));
        
    
    }
    
    
}
