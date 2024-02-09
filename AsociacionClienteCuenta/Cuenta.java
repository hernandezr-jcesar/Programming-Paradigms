package practica3;
import java.util.ArrayList;
public class Cuenta {
    private ArrayList <Cliente> Titulares;
    
    private byte Num_Cuenta;
    private String Nombre_Cuenta;
    
    //Metodo 
    public void RegistrarTitular (Cliente C){
            Titulares.add(C);
            C.RegistrarCuenta(this);
    }  

    public Cuenta(byte Num_Cuenta, String Nombre_Cuenta) {
        this.Num_Cuenta = Num_Cuenta;
        this.Nombre_Cuenta = Nombre_Cuenta;
        Titulares =new ArrayList();
    }

    public byte getNum_Cuenta() {
        return Num_Cuenta;
    }

    public String getNombre_Cuenta() {
        return Nombre_Cuenta;
    }
    public ArrayList <Cliente> getTitular(){
        return Titulares;
    }   
    
}
