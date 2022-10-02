package poo;

import javax.swing.*;

public class uso_coche {
    public static void main(String[] args) {
        Coche renault = new Coche(); //Instanciar una clase, Ejemplar de
        renault.establece_color(JOptionPane.showInputDialog("introduce Color"));
        System.out.println(renault.dime_datosGenerales()+"\n"+renault.dime_color());
        renault.configuraAsientos(JOptionPane.showInputDialog("tiene asientos de cuero"));
        System.out.println(renault.get_asientos());
        renault.configurarclimatizador(JOptionPane.showInputDialog("tiene climatizador?"));
        System.out.println(renault.get_climatizador());
        System.out.println(renault.dime_peso_coche());
        System.out.printf("el precio total del coche es: %d", renault.precio_total());


    }
}
