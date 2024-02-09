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
public class Cuenta {
    //Propiedades
    private int id_cuenta;
    private String nombre;
    private String direccion;
    private float saldo;
    
    //Constructor
    public Cuenta(){
        saldo = 1500.0f;
        /*
        int id_cuenta, String nombre, String direccion, float saldo
        id_account = id_cuenta;
        name = nombre;
        adress = direccion;
        balance = saldo;    
        */
    }
    
    
    //Metodo - getters & setters
    public void setId_cuenta(int id_Cuenta){
        id_cuenta = id_Cuenta;
    }
    public int getId_cuenta(){
        return id_cuenta;
    }
    public void setNombre(String Nombre){
        nombre = Nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDireccion(String Direccion){
        direccion = Direccion;
    }
    public String getdireccion(){
        return direccion;
    }
    public void setSaldo(float Saldo){
        saldo = Saldo;
    }
    public float getSaldo(){
        return saldo;
    }
    
     
}
