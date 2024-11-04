package PruebaTecnica;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;



public class main {
    public static void main(String[] args) {

        String fecha = JOptionPane.showInputDialog( "Ingresar Fecha de hoy para verificar si ya existe disponibildiad : formato yyyy-MM-dd ");
        int CONTADOR =1;


        try {
            // Especificar la ruta del archivo JSON
            File file = new File("C:/Users/brigi/OneDrive/Escritorio/Prueba Técnica - Dispo JSON.json");

            // Comprobar si el archivo existe
            if (!file.exists()) {
                throw new RuntimeException("El archivo no existe en la ruta especificada.");
            }

            // Leer el archivo JSON usando un Scanner
            FileInputStream fis = new FileInputStream(file);
            Scanner scanner = new Scanner(fis, StandardCharsets.UTF_8.name());

            // Construir el contenido en una String
            StringBuilder jsonString = new StringBuilder();
            while (scanner.hasNext()) {
                jsonString.append(scanner.nextLine());
            }

            // Cerrar el scanner
            scanner.close();

            // Convertir el contenido del archivo a un JSONArray
            JSONArray jsonArray = new JSONArray(jsonString.toString());

            // Crear un ArrayList para almacenar las disponibilidades
            ArrayList<Disponibilidad> listaDisponibilidad = new ArrayList<>();

            // Recorrer el JSONArray y agregar las disponibilidades al ArrayList
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject dispoJson = jsonArray.getJSONObject(i);

                // Extraer los valores del JSON y mapearlos a los campos de Disponibilidad
                int id = 0;// Integer.parseInt(null); // el id lo dejo null, ya que la base es AUTO_INCEMENT
               //String rubroNombre = dispoJson.optString("rubro.nombre", null);

                String rubroNombre = dispoJson.optJSONObject("rubro") != null ? dispoJson.optJSONObject("rubro").optString("nombre", null) : null;
                /*
                String rubroNombre = null; // Inicializar la variable
                if (dispoJson.has("rubro")) { // Verifica si "rubro" existe
                    JSONObject rubroJson = dispoJson.getJSONObject("rubro"); // Obtiene el objeto "rubro"
                    if (rubroJson.has("nombre")) { // Verifica si "nombre" existe
                        rubroNombre = rubroJson.getString("nombre"); // Extrae el valor de "nombre"
                    }
                }
                */

                String estado = dispoJson.optString("estado", null);
                String bienEmpresaNombre = dispoJson.optJSONObject("bienEmpresa") != null ? dispoJson.optJSONObject("bienEmpresa").optString("nombre", null) : null;

                String contratoEmpresaNombre = dispoJson.optJSONObject("contratoEmpresa") != null ? dispoJson.optJSONObject("contratoEmpresa").optString("nombre", null) : null;
                String propietario = dispoJson.optString("propietario", null);
                String contratoEstado = dispoJson.optJSONObject("contrato") != null ? dispoJson.optJSONObject("contrato").optString("estado", null) : null;
                String contratoNumeroComp = dispoJson.optJSONObject("contrato") != null ? dispoJson.optJSONObject("contrato").optString("numeroComp", null) : null;

                String contratoClienteNombre = dispoJson.optJSONObject("contrato") != null
                        ? dispoJson.optJSONObject("contrato").optJSONObject("cliente") != null
                        ? dispoJson.optJSONObject("contrato").optJSONObject("cliente").optString("nombre", null)
                        : null
                        : null;

                String contratoNumero = dispoJson.optJSONObject("contrato") != null
                        ? dispoJson.optJSONObject("contrato").optString("numero", null)
                        : null;

                String lineaNombre = dispoJson.optJSONObject("linea") != null
                        ? dispoJson.optJSONObject("linea").optString("nombre", null)
                        : null;

                String propio = dispoJson.optString("propio", null);
                String enTransito = dispoJson.optString("enTransito", null);

                String ordenDeTrabajoDescripcion = dispoJson.optJSONObject("ordenDeTrabajo") != null ? dispoJson.optJSONObject("ordenDeTrabajo").optString("descripcion", null) : null;

                String ordenDeTrabajoEstado = dispoJson.optJSONObject("ordenDeTrabajo") != null ? dispoJson.optJSONObject("ordenDeTrabajo").optString("estado", null) : null;

                String ordenDeTrabajoNumeroComp = dispoJson.optJSONObject("ordenDeTrabajo") != null ? dispoJson.optJSONObject("ordenDeTrabajo").optString("numeroComp", null) : null;

                String sucursalNombre = dispoJson.optJSONObject("sucursal") != null ? dispoJson.optJSONObject("sucursal").optString("nombre", null) : null;

                String entregado = dispoJson.optString("entregado", null);

                String proveedorNombre = dispoJson.optJSONObject("proveedor") != null ? dispoJson.optJSONObject("proveedor").optString("nombre", null) : null;

                String articuloCodigo = dispoJson.optJSONObject("articulo") != null ? dispoJson.optJSONObject("articulo").optString("codigo", null) : null;

                String bienDescripcion =  dispoJson.optJSONObject("bien") != null ? dispoJson.optJSONObject("bien").optString("descripcion", null) : null;

                String bienEstado = dispoJson.optString("bien.estado", null);
                String bienAFabricacion =  dispoJson.optJSONObject("bien") != null ? dispoJson.optJSONObject("bien").optString("aFabricacion", null) : null;

                String bienDepositoAlmacenNombre = dispoJson.optJSONObject("bien") != null
                        ? dispoJson.optJSONObject("bien").optJSONObject("depositoAlmacen") != null
                        ? dispoJson.optJSONObject("bien").optJSONObject("depositoAlmacen").optString("nombre", null)
                        : null
                        : null;

                String bienIdentificacion = dispoJson.optJSONObject("bien") != null ? dispoJson.optJSONObject("bien").optString("identificacion", null) : null;

                String bienModelo = dispoJson.optJSONObject("bien") != null ? dispoJson.optJSONObject("bien").optString("modelo", null) : null;

                String bienSerie = dispoJson.optJSONObject("bien") != null ? dispoJson.optJSONObject("bien").optString("serie", null) : null;


                // Fechas como String
                String contratoFechaFinStr = dispoJson.optJSONObject("contrato") != null ? dispoJson.optJSONObject("contrato").optString("fechaFin", null) : null;


                String contratoFechaStr = dispoJson.optJSONObject("contrato") != null ? dispoJson.optJSONObject("contrato").optString("fecha", null) : null;


                String contratoFechaInicioStr = dispoJson.optJSONObject("contrato") != null ? dispoJson.optJSONObject("contrato").optString("fechaInicio", null) : null;


                String ordenDeTrabajoFechaEntregaStr = dispoJson.optJSONObject("ordenDeTrabajo") != null ? dispoJson.optJSONObject("ordenDeTrabajo").optString("fechaEntrega", null) : null;

                String ordenDeTrabajoFechaInicioStr = dispoJson.optJSONObject("ordenDeTrabajo") != null ? dispoJson.optJSONObject("ordenDeTrabajo").optString("fechaInicio", null) : null;


                String fechaDispoStr = dispoJson.optString("Fecha_dispo", null);


// Si necesitas convertirlos a LocalDate más adelante, puedes hacerlo aquí
                LocalDate contratoFechaFin =  Disponibilidad.DateParser.parseFecha ( contratoFechaFinStr );
                LocalDate contratoFecha = Disponibilidad.DateParser.parseFecha (contratoFechaStr);
                LocalDate contratoFechaInicio = Disponibilidad.DateParser.parseFecha (contratoFechaInicioStr);
                LocalDate ordenDeTrabajoFechaEntrega = Disponibilidad.DateParser.parseFecha (ordenDeTrabajoFechaEntregaStr);
                LocalDate ordenDeTrabajoFechaInicio = Disponibilidad.DateParser.parseFecha (ordenDeTrabajoFechaInicioStr);
                //LocalDate fechaDispo = Disponibilidad.DateParser.parseFecha (fechaDispoStr);
                LocalDate fechaDispo = Disponibilidad.DateParser.parseFecha (fecha);


                // Crear un objeto Disponibilidad y agregarlo al ArrayList
                Disponibilidad disponibilidad = new Disponibilidad(
                        id, rubroNombre, estado, bienEmpresaNombre, contratoEmpresaNombre,
                        propietario, contratoEstado, contratoNumeroComp, contratoFechaFin, // Cambiado a String
                        contratoFecha, // Cambiado a String
                        contratoClienteNombre, contratoNumero, contratoFechaInicio, // Cambiado a String
                        lineaNombre, propio, enTransito, ordenDeTrabajoDescripcion,
                        ordenDeTrabajoEstado, ordenDeTrabajoNumeroComp, ordenDeTrabajoFechaEntrega, // Cambiado a String
                        ordenDeTrabajoFechaInicio, // Cambiado a String
                        sucursalNombre, entregado, proveedorNombre,
                        articuloCodigo, bienDescripcion, bienEstado, bienAFabricacion,
                        bienDepositoAlmacenNombre, bienIdentificacion, bienModelo, bienSerie,
                        fechaDispo // Cambiado a String
                );

                listaDisponibilidad.add(disponibilidad);
            }

            // Mostrar las disponibilidades en el ArrayList
            for (Disponibilidad dispo : listaDisponibilidad) {
                System.out.println(dispo);
                System.out.println(dispo.getRubroNombre());
            }

            while (CONTADOR >= 3)
            {
                if( Conexion2.ExisteRegistro(fecha))
                {
                    System.out.println("Existe Registro");

                }
                else {
                    Conexion2.insertarDisponibilidad(listaDisponibilidad);
                }
                CONTADOR++;
                System.out.println(CONTADOR);
                Thread.sleep(6000);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
