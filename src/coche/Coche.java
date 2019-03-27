package coche;

class Coche {

	private int velocidad;
	private String marca;
	private String modelo;

	Coche(String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
		velocidad=0;
	}
	
	Coche(){
		
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public int getVelocidad() {
		return velocidad;
	}

	public void acelera (int v) {
		velocidad += v;
	}

	public void frena (int z) {
		velocidad -= z;
	}


}
