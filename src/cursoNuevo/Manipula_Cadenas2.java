package cursoNuevo;

public class Manipula_Cadenas2 {
    public static void main(String[] args) {
        /*------------------------Manipulacion de frases----------------*/

        //Inicio y fin de cadenas de texto para obtener nuevas cadenas de texto

        String frase = "Hoy es un buen dia para aprender programación en java";
        String fraseResumen = frase.substring(24,53);

        System.out.println(fraseResumen);
    }
}
