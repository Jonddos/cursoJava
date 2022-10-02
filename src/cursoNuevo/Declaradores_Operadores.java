package cursoNuevo;

public class Declaradores_Operadores {
    public static void main(String[] args) {


        int a=5; //declaracion de variable en la misma linea

        /*Declaración en varias lineas*/
        int b;
        b=7;

        //---operadores---

        //suma, //divion, //multiplicación
        int c=b+a;

        //Incrementable

        // Se le resta 6 al 12 = (6)
            c-=6;

        // Se le suma un adicional al 6 = (7)
            c++;

        // Se le resta una unidad al 7 = (6)
            c--;

        //Se le suma 5 unidades al 6 = (11)
            c+=5;

        //impresión de la variable contenedora de la suma
        //System.out.print(c);

        final int d = 5; // declaración de una constante.

        // Cuando declaras una constante no puedes redeclararla como en el caso de las variables
        /*d = 6;*/


        //Un mejor ejemplo

        final double apulgadas = 2.54;
        double cm = 6;
        double resultado = cm/apulgadas;

        System.out.println("En "+cm+" cm hay "+ resultado + " pulgadas");

        /*---------------------------Declaracion de varias variables o Constantes*/

        int va1, va2, va3;

        va1 = 8;
        va2 = 2;
        va3 = va1+va2;

        System.out.println("El resultado es: "+va3);


    }
}
