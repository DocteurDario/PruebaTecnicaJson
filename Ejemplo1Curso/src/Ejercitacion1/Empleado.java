package Ejercitacion1;

import java.time.LocalDate;
import java.util.*;
public class Empleado {


    private String nombre;
    private String seccion;
    private int  id;
    private static int idSiguiente=1;


    Empleado( String nombre, String seccion)
    {
        this.nombre = nombre;
        this.seccion = seccion;
        this.id=this.idSiguiente;
        this.idSiguiente++;
    }


    public static String devuelIdSiguiente()
    {
        return Integer.toString(idSiguiente);
    }


    @Override
    public String toString() {
        return "Empleado: " +
                "nombre='" + nombre + '\'' +
                ", seccion='" + seccion + '\'' +
                ", id=" + id +
                '.';
    }


    public static void main(String[] args) {

        /*
        Empleado[] empleado = new Empleado[]{
                new Empleado("a ", "a "),
                new Empleado("b ", "b "),
                new Empleado("c ", "c "),
                new Empleado("d ", "d ")
        };
        */
        Empleado[] empleado = new Empleado[4];
                empleado[0]= new Empleado("a ", "a ");
                System.out.println( Empleado.devuelIdSiguiente() );
                empleado[1]= new Empleado("b ", "b ");
                System.out.println( Empleado.devuelIdSiguiente() );
                empleado[2]= new Empleado("c ", "c ");
                System.out.println( Empleado.devuelIdSiguiente() );
                empleado[3]= new Empleado("d ", "d ");
                System.out.println( Empleado.devuelIdSiguiente() );



        for(Empleado emp : empleado)
        {
            System.out.println(emp.toString());
        }


    }
}
