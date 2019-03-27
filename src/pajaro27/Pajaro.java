package pajaro27;

public class Pajaro {
	//*** atributos o propiedades ****
	private static int numpajaros=0;
	private char color; //propiedad o atributo color
	private int edad; //propiedad o atributo edad

	//*** métodos de la clase ****
	static void nuevopajaro(){
		numpajaros++;
	}

	Pajaro(){
		color = 'v'; 
		edad = 0; 
		nuevopajaro();
	}

	Pajaro(char c, int e){
		color = c; 
		edad = e; 
		nuevopajaro();
	}

	static void muestrapajaros(){
		System.out.println(numpajaros);
	}
}
