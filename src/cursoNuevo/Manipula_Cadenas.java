package cursoNuevo;

public class Manipula_Cadenas {
    public static void main(String[] args) {

        /*----------Declaración String para Cadenas de Texto-----------*/
        String nombre = "Juan";
        System.out.println("Mi nombre es: "+nombre);

        //Saber la longitud de una cadena de texto

        System.out.println("Mi nombre tiene "+nombre.length()+" caracteres");

        //saber la posición exacta de una cadena de texto

        System.out.println("La primera letra de "+nombre+" es: "+nombre.charAt(0));

        //Saber la ultima letra

        int ultimaLetra = nombre.length()-1;

        System.out.println("La ultima letra de "+nombre+" es la "+nombre.charAt(ultimaLetra));
    }
}
