package poo;

public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    boolean  asientos_cuero, booClimatizador;


    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    public String dime_datosGenerales(){ //GETTER debe tener si o si return.
        return "La plataforma del coche tiene" +
                "\nruedas: " + ruedas +
                "\nlargo: " + largo +
                "\nancho: " + ancho+
                "\nmotor: " + motor+
                "\npeso_plataforma: "+peso_plataforma;
    }

    public void establece_color(String strColor){ //SETTER no devuelve dato por eso va void.
        color = strColor;
    }

    public String dime_color(){
        return "el color del coche es: "+color+" bonito";
    }

    public void configuraAsientos(String asientosCuero) {

        if (asientosCuero.equalsIgnoreCase("si")) {
            this.asientos_cuero = true;
        } else if (asientosCuero == "no") {
            this.asientos_cuero = false;
        }
    }

    public String get_asientos(){
        if(asientos_cuero){
            return "tiene asientos de cuero";
        }else{
            return "no tiene asientos de cuero";
        }
    }

    public void configurarclimatizador(String climatizador){//metodo setter de climatizador
        if(climatizador.equalsIgnoreCase("si")){
            this.booClimatizador=true;
        }else{
            this.booClimatizador=false;
        }
    }

    public String get_climatizador(){
        if(booClimatizador){
            return "tiene climatizador";
        }else{
            return "no tiene climatizador";
        }
    }

    public String dime_peso_coche(){
        int peso_carroceria=500;
        this.peso_total = this.peso_plataforma+peso_carroceria;
        if(asientos_cuero){
            this.peso_total=this.peso_total+50;
        }
        if(booClimatizador){
            this.peso_total=this.peso_total+20;
        }
        return "el peso del coche es: "+this.peso_total+"\n";
    }

    public int precio_total(){
        int precio_final = 10000;
        if(asientos_cuero){
            precio_final+=2000;
        }
        if(booClimatizador){
            precio_final+=1500;
        }
        return precio_final;
    }
}

