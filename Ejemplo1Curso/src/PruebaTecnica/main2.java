package PruebaTecnica;

import javax.swing.*;
import java.util.ArrayList;

public class main2
{

    static int CONTADOR= 1;
    static String FECHA= null;

    public static void main(String[] args) {

        pruebaTecnicaDisponibilidad();

    }

    static void pruebaTecnicaDisponibilidad()
    {
        final String mensaje= "Ingresa Fecha con el formaro: AAAA/MM/DD";
        final String titulo = "Ingresa Fecha: ";
        final String archivo ="C:/Users/brigi/OneDrive/Escritorio/Prueba Técnica - Dispo JSON.json";


        ArrayList<Disponibilidad>disponibilidad;

        FECHA= JOptionPane.showInputDialog(mensaje,titulo);
        disponibilidad=LeerJSon.listaDisponibilidad(FECHA,LeerJSon.leerArchivoJson(archivo));
        LeerJSon.mostrarDisponibilidad(disponibilidad);
        validacionesDelEjecicio( disponibilidad, FECHA);

    }

    public static void validacionesDelEjecicio (ArrayList <Disponibilidad> disponibilidad, String fecha) {
        while (CONTADOR <= 3)
        {
            if( Conexion2.ExisteRegistro(fecha)) {
                System.out.println("Ya existe un registro en la base con la misma fecha. Intento: " + CONTADOR + " .");
            }
            else
            {
                Conexion2.insertarDisponibilidad(disponibilidad);
                System.out.println("Se Agrego con Exito en : " + CONTADOR + " .");

            }
            CONTADOR++;
            esperar(100);
        }
    }

    public static void esperar(int segundos){
        try {
            System.out.println("Se va a Pausar por : " + segundos + " Segundos");
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

