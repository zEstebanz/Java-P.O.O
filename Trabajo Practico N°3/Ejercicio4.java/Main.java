public class Main {
    public static void main(String[] args) {

        Circulo c1= new Circulo(5,2,3);

        System.out.println("El centro del círculo es la coordenada (" + c1.getCentro().getX()+ "," + c1.getCentro().getY() + ") y tiene un radio = " + c1.getRadio());
    }
    }
