package satelite;

public class GestionaSatelite {

	public static void main(String[] args) {
		Satelite uno = new Satelite();
		
		uno.setPosicion(5, 7, 9);
		uno.variaAltura(-4);
		uno.printPosicion();
		uno.variaPosicion(8, -7);
		uno.printPosicion();
	}

}
