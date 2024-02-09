package practica2;
import java.util.ArrayList;
public class lista {
    
    ArrayList<CadenaC> cadenas = new ArrayList();
    
    public void add(int posicion, String E){
        CadenaC cadPE = new CadenaC();
        cadPE.setCadena(E);
        cadPE.setPosicion(posicion);
        cadenas.add(posicion, cadPE);
    }
    public void add(String E){
        CadenaC cadE = new CadenaC() ;
        cadE.setCadena(E); 
        cadenas.add(cadE);
    }
    
   public void imprimirCadena(){
       String cadenastotales = "";
       cadenastotales += "  Posicion  ||  Cadena \n"; 
       for(int i=0; i < cadenas.size();i++){
           cadenas.get(i).setPosicion(i); 
           cadenastotales += "         "+ cadenas.get(i).getPosicion()
                   +"          ||    "+ cadenas.get(i).getCadena()+" \n";     
       }
       Ventana v1 = new Ventana();
       v1.mensaje(cadenastotales);
   }
}
