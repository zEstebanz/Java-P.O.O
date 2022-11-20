package Ejercicio3;

public class Serie {
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    // Titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // NumeroTemporada
    public int getnumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setnumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    // Genero
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Creador
    public String getcreador() {
        return creador;
    }

    public void setcreador(String creador) {
        this.creador = creador;
    }

    public void entregar() {
        entregado = true;
    }

    public void devolver() {
        entregado = false;
    }

    public boolean isEntregado() {
        if (entregado) {
            return true;
        }
        return false;
    }

    public int compareTo(Object a) {
        int estado = MENOR;

        // Hacemos un casting de objetos para usar el metodo get
        Serie ref = (Serie) a;
        if (numeroTemporadas > ref.getnumeroTemporadas()) {
            estado = MAYOR;
        } else if (numeroTemporadas == ref.getnumeroTemporadas()) {
            estado = IGUAL;
        }

        return estado;
    }

    /**
     * Muestra informacion de la Serie
     * 
     * @return cadena con toda la informacion de la Serie
     */
    public String toString() {
        return "Informacion de la Serie: \n" +
                "\tTitulo: " + titulo + "\n" +
                "\tNumero de temporadas: " + numeroTemporadas + "\n" +
                "\tGenero: " + genero + "\n" +
                "\tCreador: " + creador;
    }

    /**
     * Indica si dos Series son iguales, siendo el titulo y creador iguales
     * 
     * @param a Serie a comparar
     * @return true si son iguales y false si son distintos
     */
    public boolean equals(Serie a) {
        if (titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getcreador())) {
            return true;
        }
        return false;
    }

    // Constructor por defecto

    public Serie() {
        this(titulo + "" + genero + "" + creador + "");
    }

    //Contructor con 2 parametros
    
    public Serie(String titulo, String creador) {
        this(titulo, "", creador);
    }

    // Constructor con 4 parametros

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }

}
