public class Libro {
    private String titulo;
    private String autor;
    private int precio;

    //constructor por defecto
    public Libro() {
    }

    //constructor con parámetros
    public Libro(String titulo, String autor, int precio) {                                    
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    //getters y setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getprecio() {
        return precio;
    }

    public void setprecio(int precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //método toString sobrescrito para mostrar los datos de la clase Libro
    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor +
                  "\nprecio: " + precio;                                    
    }
   
}//Fin de la clase Fraccion {
    
}
