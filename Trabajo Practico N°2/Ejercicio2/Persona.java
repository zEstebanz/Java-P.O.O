package Ejercicio2;

public class Persona {
    // Atributos
    private String nombre;
    private String DNI;
    private int edad;
    private double peso;
    private double altura;

    // El peso de la persona esta por debajo del peso ideal
    public static final int INFRAPESO = -1;

    // El peso de la persona esta en su peso ideal
    public static final int PESO_IDEAL = 0;

    // El peso de la persona esta por encima del peso ideal
    public static final int SOBREPESO = 1;

    // Constructores
    public Persona() {
    }

    public Persona(String nombre, String DNI, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.DNI = DNI;
        this.altura = altura;
        generarDni();
    }

    // Generar DNI
    private void generarDni() {
        final int divisor = 23;

        // Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
        // Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);
        // Pasamos el DNI a String
        DNI = Integer.toString(numDNI) + letraDNI;

    }

    private char generaLetraDNI(int res) {
        char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

        return letras[res];
    }

    //IMC 
    public int calcularIMC() {
        //Calculamos el peso de la persona
        double pesoActual = peso / (Math.pow(altura, 2));
        //Segun el peso, devuelve un codigo
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        } else if (pesoActual < 20) {
            return INFRAPESO;
        } else {
            return SOBREPESO;
        }
    }

    // Indica si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    // Metodos Publicos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Peso
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Altura
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {

        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }

}