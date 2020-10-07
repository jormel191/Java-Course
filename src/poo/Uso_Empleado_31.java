package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado_31 {
	public static void main(String[] args) {
		
		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9,25);
		jefe_RRHH.estableceIncentivo(2570);
		
		
		Empleado[] misEmpleado = new Empleado[6]; // Forma de crear el metodo pero conun array

		misEmpleado[0] = new Empleado("Maria Perez", 85000, 1990, 12, 17);
		misEmpleado[1] = new Empleado("Juan Ramos", 95000, 1995, 2, 10);
		misEmpleado[2] = new Empleado("Jose Martinez", 105000, 1996, 10, 27);
		misEmpleado[3] = new Empleado("Antonio Figueroa");
		misEmpleado[4] = jefe_RRHH;
		misEmpleado[5] = new Jefatura("Maria", 95000, 1999, 5, 26);
		
		Jefatura jefa_finanzas= (Jefatura)misEmpleado[5];
		jefa_finanzas.estableceIncentivo(5000);
		System.out.println(jefa_finanzas.tomar_desiciones("dar mas días de vaciones"));
		
		Arrays.sort(misEmpleado);
		
		for (Empleado e : misEmpleado) { // <------ for mejorado
			e.subeSueldo(5);
			System.out.println("Nombre: " + e.dameNombre() + " sueldo: " + e.dameSueldo() + "Fecha de contrato: "
					+ e.dameFechaContrato());
		}

		
	}

}

class Empleado implements Comparable{

	private String nombre;
	private double sueldo;
	private Date altaContrato;

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
		altaContrato = calendario.getTime();
	}
	
	public Empleado(String nom) {
		
		this(nom, 30000, 2000, 01,01);
	}
	

	public String dameNombre() { // Getter
		return nombre;
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
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado= (Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			
			return -1;
		}
		if (this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}

}

class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, dia, dia, dia);
		
	}

	public String tomar_desiciones(String desicion) {
		
		return "un miembro a tomado la desicion de " + desicion;
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo=b;
	}
	
	public double dameSueldo() {
		
		double sueldoJefe= super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	
	private double incentivo;
}
