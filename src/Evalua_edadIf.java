import java.util.Scanner;

public class Evalua_edadIf {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad, por favor ");

        int edad = entrada.nextInt();

        if (edad<18) {
            System.out.println("Eres un adolecente");
        }
        else if (edad < 40){

            System.out.println("Eres un señor");
        }
        else if (edad < 60){

            System.out.println("Eres un anciano");
        }
        else if (edad < 80){

            System.out.println("Estas muy viejo");
        }
        else if (edad > 80){

            System.out.println("Estas demasiadoooo pero demasiado viejo");
        }

    }
}



