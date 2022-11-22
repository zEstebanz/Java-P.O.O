public class Main {
    public static void main(String[] args) {

        Persona p1=new Persona("Esteban");
        Cuenta c1=new Cuenta("Esteban Oller");

        p1.setUnaCuenta(c1);
        c1.setUnaPersona(p1);

        System.out.println("Cliente: "+p1.getNombre()+", edad: "+p1.getEdad());
        System.out.println("Titular de la cuenta: "+p1.getUnaCuenta().getTitular());

        System.out.println("Cantidad en la cuenta: "+c1.getCantidad()+", pertenece a: "+c1.getUnaPersona().getNombre());
    }
}
