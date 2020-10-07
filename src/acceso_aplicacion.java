import javax.swing.*;

public class acceso_aplicacion {

    public static void main (String[] args){

        String clave="Jormel";

        String pass="";

        while (clave.equals(pass)==false){

            pass= JOptionPane.showInputDialog("Introduce una contraseña, por favor");

            if (clave.equals(pass)==false){

                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta");
    }
}
