public class Manipula_Cadenas {
    public static void main (String args[]){

        String nombre="Juan";

        System.out.println("Mi nombre es " + nombre);

        System.out.println("Mi nombre tiene " + nombre.charAt(2) + " caracteres" );

        System.out.println("La primera leta de " + nombre + "es la " + nombre.charAt(0));

        int ultima_letra=nombre.length();

        System.out.println("y la ultima letra de mi nombre es " + nombre.charAt(ultima_letra-1));

    }


}
