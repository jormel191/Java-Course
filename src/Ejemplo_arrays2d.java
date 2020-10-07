public class Ejemplo_arrays2d {
    public static void main (String[] args){

        int acumulado=1;
        int interes=0;

        int [][] saldo=new int[7][2];

        for(int i=0; i<5; i++){

            saldo[i][0]=1;
            //acumulado=1;

            for (int j=1; j<2; j++){
                acumulado=acumulado+interes;

                saldo[i][j]=acumulado;
            }

            interes=interes+1;

        }

        for(int z=0;z<7;z++){

            System.out.println();

            for (int h=0; h<2; h++){

                System.out.print( saldo [z][h]);

                System.out.print(" ");


                }
            }
        }
    }

