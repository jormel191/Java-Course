import javax.swing.*;

public class Peso_Ideal {

    public static void main (String[] args){

        String genero="";

        do {
            genero= JOptionPane.showInputDialog("Introduce tu genero (H/M)");

        }
        while (genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")==false);

        int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura "));

        int pesoIdeal=0;

        System.out.println("Tu pedo ideal es " + pesoIdeal + " kg");
    }
}
