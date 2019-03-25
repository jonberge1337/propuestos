package coche;

import java.util.Scanner;

public class GestionaCoche {

	public static int elegirMenu() {
		int menu;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce un numero de las siguientes opciones: ");
			System.out.println("1. Ver Ficha\n2. Acelerar \n3. Frenar \n4. Ver velocidad \n5. salir");

			try {
				menu = sc.nextInt();
			} catch (Exception e) {
				menu = 0;
				sc.nextLine();
			}

			if(menu > 5 || menu < 1) {
				System.out.println("Introduce una opcion correcta");
			}
		} while (menu > 5 || menu < 1);


		return menu;
	}
	
	public static void mostrarFicha(Coche coche) {
		if(coche.getMarca() != null && coche.getModelo() != null) {	
			System.out.println("Este coche es de la marca: " + coche.getMarca() + " y modelo: " + coche.getModelo());
		}else {
			System.out.println("Marca y modelo por definir");
		}
	}

	public static void acelera(Coche coche) {
		int velocidad;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce en cuanto quieres aumentar la velocidad: ");
			try {
				velocidad = sc.nextInt();
			} catch (Exception e) {
				velocidad = 0;
				sc.nextLine();
			}
			if(velocidad < 1) {
				System.out.println("Tienes que meter un numero mayor que 0");
			}
		} while (velocidad < 1);

		if(velocidad + coche.getVelocidad() > 120) {
			coche.acelera(120 - coche.getVelocidad());
		} else {
			coche.acelera(velocidad);
		}

	}

	public static void frenar(Coche coche) {
		int velocidad;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce en cuanto quieres frenar la velocidad");
		do {
			try {
				velocidad = sc.nextInt();				
			} catch (Exception e) {
				velocidad = 0;
				sc.nextLine();
			}
			if(velocidad < 1) {
				System.out.println("Tienes que meter un numero mayor que 0");
			}
		} while (velocidad < 1);

		if(coche.getVelocidad() - velocidad < 0) {
			coche.frena(coche.getVelocidad());
		} else {
			coche.frena(velocidad);
		}
	}

	public static void verVelocidad(int velocidad) {
		if(velocidad == 0) {
			System.out.println("Estas parado");
		} else {
			System.out.println("Vas a " + velocidad + "km/h");
		}

	}

	public static void main(String[] args) {
//		programa que cree un coche , a continuacion mostrara un menu al usuario con las opciones 
//		acelerar frenar, ver velocidad, y salir.
		
//		Crea la clase Coche con dos constructores. Uno no toma parámetros y el otro sí.
//		Los dos constructores inicializarán los atributos marca y modelo de la clase.
//		Crea dos objetos (cada objeto llama a un constructor distinto) y verifica que todo funciona correctamente.
//		Puedes crear dentro de la clase Coche los métodos que consideres oportunos para luego utilizarlos
//		con los dos objetos creados.
		
		String marca;
		String modelo;
		String si;
		int menu;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Si quieres simularlo con un coche en concreta escribe si y dale enter.");
		System.out.println("Si no se creara un coche de ficha tecnica.");
		marca = "BMW";
		modelo = "M3 e30";
		si = sc.nextLine();
		if(si.equalsIgnoreCase("si")) {
			Coche coche1 = new Coche(marca, modelo);
			do {
				menu = elegirMenu();
				switch (menu) {
				case 1: mostrarFicha(coche1); break;
				case 2: acelera(coche1); break;
				case 3: frenar(coche1); break;
				case 4: verVelocidad(coche1.getVelocidad()); break;
				case 5: System.out.println("Programa finalizado");	break;
				}
			} while (menu != 5);

		}else {
			Coche coche1 = new Coche();
			do {
				menu = elegirMenu();
				switch (menu) {
				case 1: mostrarFicha(coche1); break;
				case 2: acelera(coche1); break;
				case 3: frenar(coche1); break;
				case 4: verVelocidad(coche1.getVelocidad()); break;
				case 5: System.out.println("Programa finalizado");	break;
				}
			} while (menu != 5);

		}


	}

}