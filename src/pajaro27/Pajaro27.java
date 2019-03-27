package pajaro27;

public class Pajaro27 {
	//*** atributos o propiedades ****
	private static int numpajaros=0;
	private char color; //propiedad o atributo color
	private int edad; //propiedad o atributo edad

	//*** métodos de la clase ****
	static void nuevopajaro(){
		numpajaros++;
	}

	Pajaro27(){
		color = 'v'; 
		edad = 0; 
		nuevopajaro();
	}

	Pajaro27(char c, int e){
		color = c; 
		edad = e; 
		nuevopajaro();
	}

	static void muestrapajaros(){
		System.out.println(numpajaros);
	}

	public static void main(String[] args) {
		Pajaro27 p1,p2;

		p1=new Pajaro27();
		p2=new Pajaro27('a',3);
		p1.muestrapajaros();
		p2.muestrapajaros();
	}
}
