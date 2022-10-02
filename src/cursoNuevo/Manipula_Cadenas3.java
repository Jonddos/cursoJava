package cursoNuevo;

public class Manipula_Cadenas3 {
    public static void main(String[] args) {

        /*------------------Uso de equals igualar dos candeas de texto---------------*/

        String alumno1, alumno2, alumno3;

        alumno1 = "David";
        alumno2 = "David";
        alumno3 = "david";

        //Uso de equals, si distingue entre mayus y minus
        System.out.println(alumno1.equals(alumno2));

        //Uso de equals ignore case, no distingue entre mayus y minus
        System.out.println(alumno1.equalsIgnoreCase(alumno3));


    }
}
