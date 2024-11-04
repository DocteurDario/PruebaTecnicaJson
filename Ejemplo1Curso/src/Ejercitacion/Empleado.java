package Ejercitacion;
import java.time.LocalDate;
import java.util.*;

public class Empleado {
    public static void main(String[] args) {

        Empleado[] empleado= new Empleado[10];
        empleado[0] = new Empleado("aaa","111", 2024 , 5 , 2 );
        empleado[1] = new Empleado("bbb","222", 2023 , 8 , 6 );
        empleado[2] = new Empleado("ccc","333", 2020 , 7 , 9 );
        empleado[2] = new Empleado("ccc");

        for(Empleado emp: empleado)
        {
            System.out.println(emp.toString());
        }
    }
    private String nombre;
    private String legajo;
    private Date fechaInicio;

    public Empleado(String nombre, String legajo, int anio, int mes, int dia){
        this.nombre=nombre;
        this.legajo=nombre;

        GregorianCalendar fecha = new GregorianCalendar(anio,mes-1,dia);
        fechaInicio=fecha.getTime();
    }
    public Empleado (String nom)
    {
        this(nom,"444",2024,03,05);
    }
    @Override
    public String toString() {
        return "Empleado: " +
                "nombre='" + nombre + '\'' +
                ", legajo='" + legajo + '\'' +
                ", fechaInicio=" + fechaInicio +
                '.';
    }
}
