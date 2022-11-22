public class Persona {

    private String nombre;
    private int edad;
    private int DNI=0;
    private double peso;
    private double altura;
    private Cuenta unaCuenta;

    public Persona() {
    }

    public Persona(String nombre, int edad, int DNI, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, int DNI, double peso, double altura, String titular, double cantidad ) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.peso = peso;
        this.altura = altura;
        unaCuenta= new Cuenta(titular,cantidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Cuenta getUnaCuenta() {
        return unaCuenta;
    }

    public void setUnaCuenta(Cuenta unaCuenta) {
        this.unaCuenta = unaCuenta;
    }
}

