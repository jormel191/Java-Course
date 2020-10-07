import java.util.Scanner;

public class Adivina_numero {

    public static void main (String[] args){

        int aleatroio=(int)(Math.random()*10);

        Scanner entrada=new Scanner(System.in);

        int numero=0;

        int intetos=0;

        while (numero != aleatroio) {
            intetos++;
            System.out.println("Introduce un numero por favor");
            numero=entrada.nextInt();

            if (aleatroio<numero){
                System.out.println("Estas por encima y llevas " + intetos + " intentos");
            }
            else if (aleatroio>numero){
                System.out.println("Estas por debajo y llevas " + intetos + " intentos");
            }
            else if (aleatroio==numero){
                System.out.println("El numero es correcto y lo has conseguido en " + intetos + " intentos");
            }
        }

    }
}
