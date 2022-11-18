package Ejercicio1;

public class Cuenta {

    //Constructores
    private String titular;
    private double cantidad;
    
    //Constructor 
    public Cuenta(String titular){
        this(titular, 0); //Sobrecarga
    }

    public Cuenta(String titular2, int i) {
    }

    //Metodos Get y Set 
    public String getTitular(){
        return titular;
    }
    public String setTitular(String titular){
        return this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //Metodos especiales
    public void ingresar(double cantidad){
        if(cantidad > 0){
            this.cantidad += cantidad; 
        }
    }

    public void retirar(double cantidad){
        if(this.cantidad - cantidad < 0){
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad; 
        }
    }

    //Devuelve el estado del objeto 
    public String toString() {
        return "El titular " + titular + " tiene: \n" + "$" + cantidad;
    }
}
