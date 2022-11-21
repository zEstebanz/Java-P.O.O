public class TiendaMascotas {
	
	
	public TiendaMascotas(String color, int edad, String nombre) {
		this.color = color;
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public TiendaMascotas() {
		
	}
	

	
	public String getnombre() {
		return nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getedad() {
		return edad;
	}
	
	public void setedad(int edad) {
		this.edad = edad;
	}
		
	public double getpeso() {
		return peso;
	}
	
	public void setpeso(double peso) {
		this.peso = peso;
	}
	
	public double getOutPrice() {
		return outPrice;
	}
	
	public void setOutPrice(double outPrice) {
		this.outPrice = outPrice;
	}
	
}