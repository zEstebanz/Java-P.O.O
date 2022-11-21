package Ejercicio2; 
public class Memory {
    private int velocidadReloj;
    private String modelo;

    public Memory() {
    }

    public Memory(int velocidadReloj, String modelo) {
        this.velocidadReloj = velocidadReloj;
        this.modelo = modelo;
    }

    public int getvelocidadReloj() {
        return velocidadReloj;
    }

    public void setvelocidadReloj(int velocidadReloj) {
        this.velocidadReloj = velocidadReloj;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }
}
