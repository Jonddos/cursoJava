package poo;

import javax.swing.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {
    public static void main(String[] args) {
        Empleado datosEmpleado = new Empleado(JOptionPane.showInputDialog("ingresa un nombre"),Double.parseDouble(JOptionPane.showInputDialog("ingresa un sueldo")),Integer.parseInt(JOptionPane.showInputDialog("ingresa un dia")),Integer.parseInt(JOptionPane.showInputDialog("ingresa un mes")),Integer.parseInt(JOptionPane.showInputDialog("ingresa un año")));
        System.out.println(datosEmpleado.obtenerDatos());
        datosEmpleado.aumentarSueldo(Double.parseDouble(JOptionPane.showInputDialog("ingresa un valor de aumento")));
        datosEmpleado.aumentarSueldo(17);


    }
}
class Empleado{
    private double doubSueldo;
    private String strNombre;
    private Date altaContrato;

    public Empleado(String nombre, double sueldo, int dia, int mes, int agno){
        this.doubSueldo = sueldo;
        this.strNombre = nombre;
        GregorianCalendar fecha = new GregorianCalendar(agno,mes-1,dia);
        this.altaContrato = fecha.getTime();
    }

    public String obtenerDatos(){
        return "los datos del empleado son: \n" +
                "Nombre: " +this.strNombre+"\n"+
                "Sueldo: " +this.doubSueldo+"\n"+
                "Contrato: "+this.altaContrato;

    }

    public void aumentarSueldo(double porcentaje){
        this.doubSueldo = this.doubSueldo+this.doubSueldo*porcentaje/100;
    }
}
