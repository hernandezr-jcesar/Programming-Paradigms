package practica3;
import java.util.ArrayList;
public class Cliente {
    private ArrayList<Cuenta> Cts;
    
    private byte Num_Cliente;
    private String Nombre;
    private String CorreoE;
    
     
    //Metodo
    public void RegistrarCuenta (Cuenta Cu){
        Cts.add(Cu);
    } 
    
    public Cliente(byte Num_Cliente, String Nombre, String CorreoE) {
        this.Num_Cliente = Num_Cliente;
        this.Nombre = Nombre;
        this.CorreoE = CorreoE;
        
        Cts = new ArrayList();
    }
    
    public byte getNum_Cliente() {
        return Num_Cliente;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getCorreoE() {
        return CorreoE;
    }
    public ArrayList <Cuenta> getCuenta(){
        
        return Cts;
    }
    
}
