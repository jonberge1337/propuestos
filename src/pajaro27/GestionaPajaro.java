package pajaro27;

public class GestionaPajaro {

	public static int nuevopajaro(int n) {
		n++;
		
		return n;
	}
	
	public static void muestrapajaros(int n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		Pajaro p1,p2;
		int numpajaros = 0;
		
		p1=new Pajaro();
		numpajaros = nuevopajaro(numpajaros);
		muestrapajaros(numpajaros);
		p2=new Pajaro('a',3);
		numpajaros = nuevopajaro(numpajaros);
		muestrapajaros(numpajaros);
	}

}
