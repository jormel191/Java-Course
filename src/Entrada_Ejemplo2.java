import javax.swing.*;

public class Entrada_Ejemplo2 {

    public static void main (String args[])  {
        String Nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre por favor");

        String edad=JOptionPane.showInputDialog("Introduce tu edad");
        int edad_usuario=Integer.parseInt(edad);
        edad_usuario ++;

        System.out.println("tu nombre es " + Nombre_usuario + " y el año que viene tedrás " + edad_usuario + " años");
    }
}
