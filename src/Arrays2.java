import javax.swing.*;

public class Arrays2 {
    public static void main(String[] args) {
          String[] valores = new String[8];
          for(int i = 0; i< valores.length; i++) {
              valores[i] = JOptionPane.showInputDialog("Introduce el Pais" + (i + 1));
          }
//        valores[0] = "españa";
//        valores[1] = "peri";
//        valores[2] = "comida";
//        valores[3] = "perro";
//        valores[4] = "vaca";
//        valores[5] = "esfero";
//        valores[6] = "pluma";
//        valores[7] = "lapiz";
//        for(int i = 0; i< valores.length; i++ ){
//            System.out.printf("el valor de la letra numero %d: %s\n",i,valores[i]);
//        }
        for (String elemento:valores){
            System.out.printf("los paises son: %s\n",elemento);
        }
    }
}
