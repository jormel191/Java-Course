package poo;



public class Uso_Vehiculo {

    public static void main (String[] args){

    	Coche micoche1 = new Coche();
    	
    	micoche1.establece_color("Azul");
    	
    	Furgoneta miFurgoneta1 = new Furgoneta(580, 7);
    	
    	miFurgoneta1.cofigura_climatizador("Si");
    	miFurgoneta1.establece_color("Verdad");
    	
    	System.out.println(miFurgoneta1.Dime_datos_generales() + " y el color del coche es " + miFurgoneta1.dime_color());
    	
    	System.out.println(miFurgoneta1.dimeDatosFurgoneta());
    }
}
