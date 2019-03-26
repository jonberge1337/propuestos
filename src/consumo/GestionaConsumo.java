package consumo;

import java.util.Scanner;

public class GestionaConsumo {
	
	public static float pedirNumero() {
		float numero;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do {			
			try {
				numero = sc.nextFloat();
			} catch (Exception e) {
				numero = 0;
			}
			if(numero <= 0) {
				System.out.println("Introduce un numero valido mayor que 0");
				sc.nextLine();
			}
		} while (numero <= 0);
		
		return numero;
	}
	
	public static void ponerDatos(Consumo viaje) {
		float kilometros;
		float litros;
		float veloMed;
		float precioCon;
		
		System.out.println("Introduce el numero de kilometros recorridos: ");
		kilometros = pedirNumero();
		
		System.out.println("Introduce la cantidad de litros gastados: ");
		litros = pedirNumero();
		
		System.out.println("Introduce la velocidad media durante el transcurso (km/h): ");
		veloMed = pedirNumero();
		
		System.out.println("Introduce el precio del combustible: ");
		precioCon = pedirNumero();
		
		viaje.setKms(kilometros);
		viaje.setLitros(litros);
		viaje.setVmed(veloMed);
		viaje.setPgas(precioCon);
	}
	
	public static void mostrarDatos(Consumo viaje) {
		System.out.println("Muy bien despues de introducir los datos te voy a enseñar unos datos: ");
		System.out.println("Has tardado " + viaje.getTiempo()[0] + " Horas y " + viaje.getTiempo()[1] + " Minutos");
		System.out.println("Has tenido un consumo medio de " + viaje.consumoMedio() + " litros cada 100 kilometros");
		System.out.println("Te ha costado " + viaje.consumoEuros() + " euros cada 100 kilometros");
	}
	
	public static void main(String[] args) {
		String afirmar;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		Consumo viaje = new Consumo();
		
		do {
			ponerDatos(viaje);
			mostrarDatos(viaje);			
			System.out.println("Quieres repetir? si es asi escribe si");
			afirmar = sc.nextLine();
		} while (afirmar.equalsIgnoreCase("Si"));
		
		System.out.println("Programa finalizado");
		
	}
}
