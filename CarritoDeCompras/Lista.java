
package carritodecompras;
import java.util.ArrayList;
public class Lista {
    
    //ATRIBUTOS
    private String NombreDeLista;
    private byte ID_Lista;
    private ArrayList <Producto> ListaDeSuper = new ArrayList();
    private Cliente fulanito;
    
    //private Producto producto;
    
    //Constructor 
    public Lista(byte ID_Lista, String NombreDeLista){
        this.ID_Lista = ID_Lista;
        this.NombreDeLista = NombreDeLista;
    
        ListaDeSuper= new ArrayList();
    }

    public String getNombreDeLista() {
        return NombreDeLista;
    }

    public byte getID_Lista() {
        return ID_Lista;
    }

    public ArrayList<Producto> getListaDeSuper() {
        return ListaDeSuper;
    }
    
    public void agregarClienteALista(Cliente C){
        fulanito = C;
        C.agregarLista(this);
    }
    public void agregarProducto(Producto P){
        ListaDeSuper.add(P); 
    }
}
