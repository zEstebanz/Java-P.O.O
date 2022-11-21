public class Main {
    public static void main(String[] args) {

        Computadora c1 = new Computadora(180);
        CPU CPU = new CPU(3000, 50);
        Memory memoria = new Memory("Ram", 3000);

        c1.AgregarUnaMemoria(memoria);
        c1.AgregarUnCpu(CPU);

        System.out.println(c1.toString());
    }
}
