package Ejercicio4;

public class VideoJuego {
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String empresa;

    //Métodos publicos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
  
    public int getHorasEstimadas() {
        return horasEstimadas;
    }
  
    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
  
    public String getGenero() {
        return genero;
    }
  
    public void setGenero(String genero) {
        this.genero = genero;
    }
  
    public String getempresa() {
        return empresa;
    }
  
    public void setempresa(String empresa) {
        this.empresa = empresa;
    }
  
    public void entregar() {
        entregado=true;
    }
  
    public void devolver() {
        entregado=false;
    }
  
    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }
  
    public int compareTo(Object a) {
        int estado=MENOR;
  
        //Hacemos un casting de objetos para usar el metodo get
        VideoJuego ref=(VideoJuego)a;
        if (horasEstimadas>ref.getHorasEstimadas()){
            estado=MAYOR;
        }else if(horasEstimadas==ref.getHorasEstimadas()){
            estado=IGUAL;
        }
  
        return estado;
    }

    public String toString(){
        return "Informacion del videoJuego: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tHoras estimadas: "+horasEstimadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tempresa: "+empresa;
    }
  
    public boolean equals(VideoJuego a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && empresa.equalsIgnoreCase(a.getempresa())){
            return true;
        }
        return false;
    }
  
    //Constructor
  
    public VideoJuego(){
        this("",HORAS_ESTIMADAS_DEF, "", "");
    }
  
    public VideoJuego(String titulo, String empresa){
        this(titulo,HORAS_ESTIMADAS_DEF, "", empresa);
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String empresa){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.genero=genero;
        this.empresa=empresa;
        this.entregado=false;
    }
 

}
