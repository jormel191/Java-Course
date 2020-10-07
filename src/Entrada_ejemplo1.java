import java.util.Scanner;

public class Entrada_ejemplo1 {

    public static void main (String args[])  {

        Scanner entrada=new Scanner(System.in);

        System.out.println("introduce tu nombre, por favor");

        String nombre_usuario=entrada.nextLine();

        System.out.println("introduce edad, por favor");

        int edad=entrada.nextInt();

        System.out.println("tu nombre es " + nombre_usuario + " y el proximo año tendrás " + (edad+1) + " años");




    }
}
