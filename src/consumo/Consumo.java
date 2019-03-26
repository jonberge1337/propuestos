package consumo;

public class Consumo {
	private float kms;
	private float litros;
	private float vmed;
	private float pgas;
	
	Consumo(){
		
	}
	
	Consumo(float kms, float litros, float vmed, float pgas){
		setKms(kms);
		setLitros(litros);
		setPgas(pgas);
		setVmed(vmed);
	}
	
	public int[] getTiempo() {
		int[] hora = new int[3];
		
		hora[0] = (int)(kms / vmed);
		hora[1] = (int)((kms / vmed - ((int)(kms / vmed))) * 60);
		
		return hora;
	}
	
	public float consumoMedio() {
		return litros / kms * 100;
	}
	
	public float consumoEuros() {
		return litros * pgas / kms * 100;
	}
	
	public void setKms(float kms) {
		this.kms = kms;
	}
	
	public void setLitros(float litros) {
		this.litros = litros;
	}
	
	public void setVmed(float vmed) {
		this.vmed = vmed;
	}
	
	public void setPgas(float pgas) {
		this.pgas = pgas;
	}
}
