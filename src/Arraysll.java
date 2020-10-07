import javax.swing.*;

public class Arraysll {


        public static void main (String[] args){
            String[] paises=new String[2];

            for (int i=0; i<2; i++){

                paises[i]= JOptionPane.showInputDialog("Introduce pais " + (i+1));
            }

            for (String elemeto:paises){

                System.out.println("Paises: " + elemeto);
            }
        }




}
