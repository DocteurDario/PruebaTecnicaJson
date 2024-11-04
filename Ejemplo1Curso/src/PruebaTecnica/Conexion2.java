package PruebaTecnica;


import java.sql.*;
import java.util.ArrayList;
import java.time.LocalDate;


import java.util.Properties;


public class Conexion2
{

            private static final String URL = "jdbc:mysql://localhost:3306/datawarehouse?useSSL=false";
            private static final String USUARIO = "admin";
            private static final String CONTRASEÑA = "admin";


            private static final String EXISTE_FECHA = "SELECT EXISTS (SELECT 1 FROM dispoalquilerdiaria WHERE FechaDispo = ?); ";

            private static final String INSERT = "INSERT INTO dispoalquilerdiaria "
            + "(id, `rubroNombre`, estado, `bienEmpresaNombre`, `contratoEmpresaNombre`, propietario, "
            + "`contratoEstado`, `contratoNumeroComp`, `contratoFechaFin`, `contratoFecha`, "
            + "`contratoCliente.Nombre`, `contratoNumero`, `contratoFechaInicio`, `lineaNombre`, propio, "
            + "enTransito, `ordenDeTrabajoDescripcion`, `ordenDeTrabajoEstado`, "
            + "`ordenDeTrabajoNumeroComp`, `ordenDeTrabajoFechaEntrega`, `ordenDeTrabajoFechaInicio`, "
            + "`sucursalNombre`, entregado, `proveedorNombre`, `articuloCodigo`, `bienDescripcion`, `bienEstado`, "
            + "`bienAFabricacion`, `bienDepositoAlmacen.nombre`, `bienIdentificacion`, `bienModelo`, "
            + "`bienSerie`, `FechaDispo`) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";


    public static void insertarDisponibilidad(ArrayList<Disponibilidad>dispo)
    {
                Connection conexion = null;
                try
                {
                    conexion = DriverManager.getConnection(URL, USUARIO,CONTRASEÑA);
                    if( conexion != null)
                    {
                        System.out.println("Conexion Exitosa a la base de datos : " + URL);

                        PreparedStatement base = conexion.prepareStatement( INSERT );

                        for (Disponibilidad dp : dispo)
                        {
                            base.setInt(1,dp.getId());
                            base.setString( 2, dp.getRubroNombre());
                            base.setString( 3, dp.getEstado());
                            base.setString( 4, dp.getBienEmpresaNombre());
                            base.setString( 5, dp.getContratoEmpresaNombre());
                            base.setString( 6, dp.getPropietario());
                            base.setString( 7, dp.getContratoEstado());
                            base.setString( 8, dp.getContratoNumeroComp());
                            //base.setDate ( 9, Date.valueOf( dp.getContratoFechaFin()));
                            base.setDate(9, dp.getContratoFechaFin() != null ? Date.valueOf(dp.getContratoFechaFin()) : null);
                            //base.setDate( 10, Date.valueOf( dp.getContratoFecha()));
                            base.setDate(10, dp.getContratoFecha() != null ? Date.valueOf(dp.getContratoFecha()) : null);
                            base.setString( 11, dp.getContratoClienteNombre());
                            base.setString( 12, dp.getContratoNumero());
                            base.setDate(13, dp.getContratoFechaInicio() != null ? Date.valueOf(dp.getContratoFechaInicio()) : null);
                            //base.setDate( 13, Date.valueOf(dp.getContratoFechaInicio()));
                            base.setString( 14, dp.getLineaNombre());
                            base.setString( 15, dp.getPropio());
                            base.setString( 16, dp.getEnTransito());
                            base.setString( 17, dp.getOrdenDeTrabajoDescripcion());
                            base.setString( 18, dp.getOrdenDeTrabajoEstado());
                            base.setString( 19, dp.getOrdenDeTrabajoNumeroComp());

                            base.setDate(20, dp.getOrdenDeTrabajoFechaEntrega() != null ? Date.valueOf(dp.getOrdenDeTrabajoFechaEntrega()) : null);

                            //base.setDate( 20, Date.valueOf(dp.getOrdenDeTrabajoFechaEntrega()));
                            //base.setDate( 21, Date.valueOf( dp.getOrdenDeTrabajoFechaInicio()));
                            base.setDate(21, dp.getOrdenDeTrabajoFechaInicio() != null ? Date.valueOf(dp.getOrdenDeTrabajoFechaInicio()) : null);


                            base.setString( 22,dp.getSucursalNombre());
                            base.setString( 23, dp.getEntregado());
                            base.setString( 24, dp.getProveedorNombre());
                            base.setString( 25, dp.getArticuloCodigo());
                            base.setString( 26, dp.getBienDescripcion());
                            base.setString( 27, dp.getBienEstado());


                            base.setString( 28, dp.getBienAFabricacion());
                            base.setString( 29, dp.getBienDepositoAlmacenNombre());
                            base.setString( 30, dp.getBienIdentificacion());
                            base.setString( 31, dp.getBienModelo());
                            base.setString( 32, dp.getBienSerie());

                            //base.setDate(35, dp.getFechaDispo() != null ? Date.valueOf(dp.getFechaDispo()) : null);
                            //base.setDate( 33, Date.valueOf("2024-10-29"));

                            //base.setDate(33, dp.getFechaDispo() != null ? Date.valueOf(dp.getFechaDispo()) : null);
                            base.setDate( 33, Date.valueOf(dp.getFechaDispo()));

                            base.executeUpdate();

                        }

                        System.out.println("Inserción exitosa para todos los elementos de la lista.");
                    }

                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }
                catch ( Exception e )
                {
                    e.printStackTrace();
                }

    }
    public static boolean ExisteRegistro( String fecha)
    {
        Connection conexion = null;
        boolean existe = false;
        try
        {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            if (conexion != null)
            {
                System.out.println("Conexion Exitosa a la base de datos : " + URL);
                PreparedStatement base = conexion.prepareStatement(EXISTE_FECHA);

                base.setDate(1, Date.valueOf(fecha));

                ResultSet resultado = base.executeQuery();
                if (resultado.next())
                {
                    existe = resultado.getInt(1) == 1;
                }
            }
        }
        catch(SQLException e )
        {
            e.printStackTrace();
        }
        return existe;
    }
}
