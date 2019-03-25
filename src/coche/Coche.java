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
	
	String getModelo() {
		return this.modelo;
	}
	
	String getMarca() {
		return this.marca;
	}
	
	int getVelocidad() {
		return velocidad;
	}

	void acelera (int v) {
		velocidad += v;
	}

	void frena (int z) {
		velocidad -= z;
	}


}
