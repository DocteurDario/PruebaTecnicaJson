package Ejercitacion2;

public class Coche {


    public static void main(String[] args) {


        Coche coche = new Coche();
        System.out.println(coche.toString());
    }


    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;


    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 1000;
        color = "rojo";
        peso_total = 3000;
    }

    public Coche(int ruedas, int largo, int ancho, int motor, int peso_plataforma, String color, int peso_total, String isAsiento, String isAire) {
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.motor = motor;
        this.peso_plataforma = peso_plataforma;
        this.color = color;
        this.peso_total = peso_total;
        this.asientos_cuero = isAsentos_cuero(isAsiento);
        this.climatizador = isClimatizador(isAire);
    }


    public boolean isAsentos_cuero(String conCuero)
    {
        if(conCuero.equalsIgnoreCase("si")){
            return true;
        }else{
            return false;
        }
    }

    public boolean isClimatizador(String conClimatizador){

        if(conClimatizador.equalsIgnoreCase("si")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Coche :" +
                "ruedas=" + ruedas +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", motor=" + motor +
                ", peso_plataforma=" + peso_plataforma +
                ", color='" + color + '\'' +
                ", peso_total=" + peso_total +
                ", asientos_cuero=" + asientos_cuero +
                ", climatizador=" + climatizador +
                '.';
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getAncho() {
        return ancho;
    }

    public int getMotor() {
        return motor;
    }

    public int getPeso_plataforma() {
        return peso_plataforma;
    }

    public String getColor() {
        return color;
    }

    public int getPeso_total() {
        return peso_total;
    }

    public boolean isAsientos_cuero() {
        return asientos_cuero;
    }

    public boolean isClimatizador() {
        return climatizador;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public void setPeso_plataforma(int peso_plataforma) {
        this.peso_plataforma = peso_plataforma;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso_total(int peso_total) {
        this.peso_total = peso_total;
    }

    public void setAsientos_cuero(boolean asientos_cuero) {
        this.asientos_cuero = asientos_cuero;
    }

    public void setClimatizador(boolean climatizador) {
        this.climatizador = climatizador;
    }
}