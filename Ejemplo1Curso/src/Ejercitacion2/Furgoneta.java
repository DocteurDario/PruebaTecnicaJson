package Ejercitacion2;

public class Furgoneta extends Coche {

    public int capacidadCarga;
    public int plaza_Extra;

    public Furgoneta( int capacidadCarga , int plaza_Extra )
    {
        super();  // esto lo que hace es llamar al constructor de la clase padre en
        this.capacidadCarga = capacidadCarga;
        this.plaza_Extra = plaza_Extra;
    }

    public Furgoneta() {}

    public Furgoneta(int ruedas, int largo, int ancho, int motor, int peso_plataforma, String color, int peso_total, String isAsiento, String isAire, int capacidadCarga, int plaza_Extra) {
        super(ruedas, largo, ancho, motor, peso_plataforma, color, peso_total, isAsiento, isAire);
        this.capacidadCarga = capacidadCarga;
        this.plaza_Extra = plaza_Extra;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getPlaza_Extra() {
        return plaza_Extra;
    }

    public void setPlaza_Extra(int plaza_Extra) {
        this.plaza_Extra = plaza_Extra;
    }

    @Override
    public String toString() {
        return "Furgoneta:" +
                "capacidadCarga=" + capacidadCarga +
                ", plaza_Extra=" + plaza_Extra +
                '.';
    }
}

