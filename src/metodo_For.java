import javax.swing.*;

public class metodo_For {

    public static void main (String[] args){

        int arroba=0;

        String mail= JOptionPane.showInputDialog("Introduce tu correo, por favor");

        for (int i=0; i<mail.length();i++){

        if (mail.charAt(i)=='@')
            arroba++;
    }

        if  (arroba==1){

        System.out.println("correo electronico correcto");

    }
        else {
        System.out.println("correo electronico incorrecto");
}
}
}
