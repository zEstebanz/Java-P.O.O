package Ejercicio1;

public class App {
    public static void main (String args[]){
        Cuenta cuenta_1 = new Cuenta ("Cuenta");
        Cuenta cuenta_2 = new Cuenta ("Esteban", 800);

        //Ingresar Dinero
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(800);

        //Retirar
        cuenta_1.retirar(500);
        cuenta_2.retirar(100);

        //Info
        System.out.println(cuenta_1);
        System.out.println(cuenta_2);
    }
}
