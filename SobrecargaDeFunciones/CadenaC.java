package practica2;

public class CadenaC {
    private String cadena;
    private int posicion;
    
    //constructor
    public CadenaC(){
        cadena = "";
        posicion = 0;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
}
