package millas;

public class Millas {

	public static int millasAmetros(int millas) {
		return millas * 1852;
	}
	
	public static int millasAKilometros(int millas) {
		return (int)(millas * 1.852);
	}
	
	public static void main(String[] args) {
		int millas1 = 25000;
		int millas2 = 55000;
 		
		System.out.println(millas1 + " millas son " + millasAmetros(millas1) + " metros y " + millasAKilometros(millas1) + " kilometros");
		System.out.println(millas2 + " millas son " + millasAmetros(millas2) + " metros y " + millasAKilometros(millas2) + " kilometros");
	}

}
