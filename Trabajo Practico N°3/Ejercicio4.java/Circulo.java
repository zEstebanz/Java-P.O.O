public class Circulo {
    private Punto centro;
    private int radio;

    public Circulo() {
    }

    public Circulo( int radio,int x, int y) {
        centro=new Punto(x,y);
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
