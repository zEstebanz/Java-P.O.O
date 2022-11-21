package Ejercicio2; 

public class Computadora {

    private String marca;
    private double precio;

    public Computadora() {

    }

    public Computadora(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Computadora{" + "marca:'" + marca + '\'' + ", precio=" + precio + '}';
    }
}
