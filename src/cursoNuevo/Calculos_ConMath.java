package cursoNuevo;

public class Calculos_ConMath {
    public static void main(String[] args) {

        /*-------------hallar raiz cuadrada de un número-------------*/

            // el metodo sqrt solo admite double, si declaras el valor que va tomar la variable double como entero dara error
            double raiz =  Math.sqrt(9);
            System.out.println(raiz);

        /*-------------Redondear un numero -------------*/

            double num1 = 5.85F;
            // se refunde el valor que devuelve el metodo round de long a entero
            int resultado = (int)Math.round(num1);
            System.out.println(resultado);

        /*-------------Redondear un numero -------------*/
        // declaración de la base y el exponente.
        double base = 5;
        double exponente = 3;
        // resultado de la operación
        int resultado2 = (int) Math.pow(base, exponente);

        System.out.println("El resultado de "+base+" elevado "+exponente+" es: "+resultado2);

    }
}
