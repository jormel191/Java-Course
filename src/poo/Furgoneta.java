package poo;

public class Furgoneta extends Coche{
	
	private int capacidad_carga;
	private int plaza_extra;
	
	public Furgoneta(int capacidad_carga, int plaza_extra){
		
		super();
		
		this.capacidad_carga=capacidad_carga;
		this.plaza_extra=plaza_extra;
		
	}
	
	public String dimeDatosFurgoneta() {
		
		return "La capacidad de carga es: " + capacidad_carga + " y las plazas son: " + plaza_extra ;
	}
}
