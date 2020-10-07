package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		lasPersonas[1] = new Alumno("Ana Lopez", "Biologica");

		for(Persona p: lasPersonas) {
			
			System.out.println(p.dameNombre() + " y "  + p.dameDescripcion());
		}

	}

}

abstract class Persona {

	public Persona(String nom) {

		nombre = nom;
	}
	
	public String dameNombre(){
		
		return "El nombre de la persona es: " + nombre;
	}

	public abstract String dameDescripcion();

	private String nombre;
}

class Empleado2 extends Persona {

	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente;

	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		super(nom);

		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id = idSiguiente;
	}

	// @Override
	public String dameDescripcion() {

		return " Este empleado tiene un id= " + id + " Con un sueldo = " + sueldo;
	}

	public double dameSueldo() { // Getter
		return sueldo;
	}

	public Date dameFechaContrato() { // getter
		return altaContrato;
	}

	public void subeSueldo(double porcentaje) { // Setter
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

}

class Alumno extends Persona {

	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;
	}

	private String carrera;

	public String dameDescripcion() {

		return " Este alumno esta estudiando  la carrera de " + carrera;
	}

}