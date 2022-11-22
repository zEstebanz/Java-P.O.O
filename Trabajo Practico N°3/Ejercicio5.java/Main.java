package Ejercicio5;

public class Main {
    public static void main(String[] args) {

        Circulo c1= new Circulo(5,2,3);

        System.out.println("El centro del círculo es la coordenada (" + c1.getCentro().getX()+ "," + c1.getCentro().getY() + ") y tiene un radio = " + c1.getRadio());
        Recta r1=new Recta(5,6,2,7);
        System.out.println("La pendiente de la recta es: "+r1.Pendiente());
                System.out.println("La longitud de la recta es: "+r1.Longitud());
        Poligono p1=new Poligono(4,4,3,53,6,7);
        p1.representarPoligono();
    }
    }
