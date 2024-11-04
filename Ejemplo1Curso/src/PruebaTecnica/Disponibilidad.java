package PruebaTecnica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Disponibilidad {
    private int id; // Cambiar a String si es necesario
    private String rubroNombre;
    private String estado;
    private String bienEmpresaNombre;
    private String contratoEmpresaNombre;
    private String propietario;
    private String contratoEstado;
    private String contratoNumeroComp;
    private LocalDate contratoFechaFin;
    private LocalDate contratoFecha;
    private String contratoClienteNombre;
    private String contratoNumero;
    private LocalDate contratoFechaInicio;
    private String lineaNombre;
    private String propio;
    private String enTransito;
    private String ordenDeTrabajoDescripcion;
    private String ordenDeTrabajoEstado;
    private String ordenDeTrabajoNumeroComp;
    private LocalDate ordenDeTrabajoFechaEntrega;
    private LocalDate ordenDeTrabajoFechaInicio;
    private String sucursalNombre;
    private String entregado;
    private String proveedorNombre;
    private String articuloCodigo;
    private String bienDescripcion;
    private String bienEstado;
    private String bienAFabricacion;
    private String bienDepositoAlmacenNombre;
    private String bienIdentificacion;
    private String bienModelo;
    private String bienSerie;
    private LocalDate fechaDispo;

    public Disponibilidad() {

    }

    public Disponibilidad(int id, String rubroNombre, String estado, String bienEmpresaNombre, String contratoEmpresaNombre, String propietario, String contratoEstado, String contratoNumeroComp, LocalDate contratoFechaFin, LocalDate contratoFecha, String contratoClienteNombre, String contratoNumero, LocalDate contratoFechaInicio, String lineaNombre, String propio, String enTransito, String ordenDeTrabajoDescripcion, String ordenDeTrabajoEstado, String ordenDeTrabajoNumeroComp, LocalDate ordenDeTrabajoFechaEntrega, LocalDate ordenDeTrabajoFechaInicio, String sucursalNombre, String entregado, String proveedorNombre, String articuloCodigo, String bienDescripcion, String bienEstado, String bienAFabricacion, String bienDepositoAlmacenNombre, String bienIdentificacion, String bienModelo, String bienSerie, LocalDate fechaDispo) {
        this.id = id;
        this.rubroNombre = rubroNombre;
        this.estado = estado;
        this.bienEmpresaNombre = bienEmpresaNombre;
        this.contratoEmpresaNombre = contratoEmpresaNombre;
        this.propietario = propietario;
        this.contratoEstado = contratoEstado;
        this.contratoNumeroComp = contratoNumeroComp;
        this.contratoFechaFin = contratoFechaFin;
        this.contratoFecha = contratoFecha;
        this.contratoClienteNombre = contratoClienteNombre;
        this.contratoNumero = contratoNumero;
        this.contratoFechaInicio = contratoFechaInicio;
        this.lineaNombre = lineaNombre;
        this.propio = propio;
        this.enTransito = enTransito;
        this.ordenDeTrabajoDescripcion = ordenDeTrabajoDescripcion;
        this.ordenDeTrabajoEstado = ordenDeTrabajoEstado;
        this.ordenDeTrabajoNumeroComp = ordenDeTrabajoNumeroComp;
        this.ordenDeTrabajoFechaEntrega = ordenDeTrabajoFechaEntrega;
        this.ordenDeTrabajoFechaInicio = ordenDeTrabajoFechaInicio;
        this.sucursalNombre = sucursalNombre;
        this.entregado = entregado;
        this.proveedorNombre = proveedorNombre;
        this.articuloCodigo = articuloCodigo;
        this.bienDescripcion = bienDescripcion;
        this.bienEstado = bienEstado;
        this.bienAFabricacion = bienAFabricacion;
        this.bienDepositoAlmacenNombre = bienDepositoAlmacenNombre;
        this.bienIdentificacion = bienIdentificacion;
        this.bienModelo = bienModelo;
        this.bienSerie = bienSerie;
        this.fechaDispo = fechaDispo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRubroNombre() {
        return rubroNombre;
    }

    public void setRubroNombre(String rubroNombre) {
        this.rubroNombre = rubroNombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBienEmpresaNombre() {
        return bienEmpresaNombre;
    }

    public void setBienEmpresaNombre(String bienEmpresaNombre) {
        this.bienEmpresaNombre = bienEmpresaNombre;
    }

    public String getContratoEmpresaNombre() {
        return contratoEmpresaNombre;
    }

    public void setContratoEmpresaNombre(String contratoEmpresaNombre) {
        this.contratoEmpresaNombre = contratoEmpresaNombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getContratoEstado() {
        return contratoEstado;
    }

    public void setContratoEstado(String contratoEstado) {
        this.contratoEstado = contratoEstado;
    }

    public String getContratoNumeroComp() {
        return contratoNumeroComp;
    }

    public void setContratoNumeroComp(String contratoNumeroComp) {
        this.contratoNumeroComp = contratoNumeroComp;
    }

    public LocalDate getContratoFechaFin() {
        return contratoFechaFin;
    }

    public void setContratoFechaFin(LocalDate contratoFechaFin) {
        this.contratoFechaFin = contratoFechaFin;
    }

    public LocalDate getContratoFecha() {
        return contratoFecha;
    }

    public void setContratoFecha(LocalDate contratoFecha) {
        this.contratoFecha = contratoFecha;
    }

    public String getContratoClienteNombre() {
        return contratoClienteNombre;
    }

    public void setContratoClienteNombre(String contratoClienteNombre) {
        this.contratoClienteNombre = contratoClienteNombre;
    }

    public String getContratoNumero() {
        return contratoNumero;
    }

    public void setContratoNumero(String contratoNumero) {
        this.contratoNumero = contratoNumero;
    }

    public LocalDate getContratoFechaInicio() {
        return contratoFechaInicio;
    }

    public void setContratoFechaInicio(LocalDate contratoFechaInicio) {
        this.contratoFechaInicio = contratoFechaInicio;
    }

    public String getLineaNombre() {
        return lineaNombre;
    }

    public void setLineaNombre(String lineaNombre) {
        this.lineaNombre = lineaNombre;
    }

    public String getPropio() {
        return propio;
    }

    public void setPropio(String propio) {
        this.propio = propio;
    }

    public String getEnTransito() {
        return enTransito;
    }

    public void setEnTransito(String enTransito) {
        this.enTransito = enTransito;
    }

    public String getOrdenDeTrabajoDescripcion() {
        return ordenDeTrabajoDescripcion;
    }

    public void setOrdenDeTrabajoDescripcion(String ordenDeTrabajoDescripcion) {
        this.ordenDeTrabajoDescripcion = ordenDeTrabajoDescripcion;
    }

    public String getOrdenDeTrabajoEstado() {
        return ordenDeTrabajoEstado;
    }

    public void setOrdenDeTrabajoEstado(String ordenDeTrabajoEstado) {
        this.ordenDeTrabajoEstado = ordenDeTrabajoEstado;
    }

    public String getOrdenDeTrabajoNumeroComp() {
        return ordenDeTrabajoNumeroComp;
    }

    public void setOrdenDeTrabajoNumeroComp(String ordenDeTrabajoNumeroComp) {
        this.ordenDeTrabajoNumeroComp = ordenDeTrabajoNumeroComp;
    }

    public LocalDate getOrdenDeTrabajoFechaEntrega() {
        return ordenDeTrabajoFechaEntrega;
    }

    public void setOrdenDeTrabajoFechaEntrega(LocalDate ordenDeTrabajoFechaEntrega) {
        this.ordenDeTrabajoFechaEntrega = ordenDeTrabajoFechaEntrega;
    }

    public LocalDate getOrdenDeTrabajoFechaInicio() {
        return ordenDeTrabajoFechaInicio;
    }

    public void setOrdenDeTrabajoFechaInicio(LocalDate ordenDeTrabajoFechaInicio) {
        this.ordenDeTrabajoFechaInicio = ordenDeTrabajoFechaInicio;
    }

    public String getSucursalNombre() {
        return sucursalNombre;
    }

    public void setSucursalNombre(String sucursalNombre) {
        this.sucursalNombre = sucursalNombre;
    }

    public String getEntregado() {
        return entregado;
    }

    public void setEntregado(String entregado) {
        this.entregado = entregado;
    }

    public String getProveedorNombre() {
        return proveedorNombre;
    }

    public void setProveedorNombre(String proveedorNombre) {
        this.proveedorNombre = proveedorNombre;
    }

    public String getArticuloCodigo() {
        return articuloCodigo;
    }

    public void setArticuloCodigo(String articuloCodigo) {
        this.articuloCodigo = articuloCodigo;
    }

    public String getBienDescripcion() {
        return bienDescripcion;
    }

    public void setBienDescripcion(String bienDescripcion) {
        this.bienDescripcion = bienDescripcion;
    }

    public String getBienEstado() {
        return bienEstado;
    }

    public void setBienEstado(String bienEstado) {
        this.bienEstado = bienEstado;
    }

    public String getBienAFabricacion() {
        return bienAFabricacion;
    }

    public void setBienAFabricacion(String bienAFabricacion) {
        this.bienAFabricacion = bienAFabricacion;
    }

    public String getBienDepositoAlmacenNombre() {
        return bienDepositoAlmacenNombre;
    }

    public void setBienDepositoAlmacenNombre(String bienDepositoAlmacenNombre) {
        this.bienDepositoAlmacenNombre = bienDepositoAlmacenNombre;
    }

    public String getBienIdentificacion() {
        return bienIdentificacion;
    }

    public void setBienIdentificacion(String bienIdentificacion) {
        this.bienIdentificacion = bienIdentificacion;
    }

    public String getBienModelo() {
        return bienModelo;
    }

    public void setBienModelo(String bienModelo) {
        this.bienModelo = bienModelo;
    }

    public String getBienSerie() {
        return bienSerie;
    }

    public void setBienSerie(String bienSerie) {
        this.bienSerie = bienSerie;
    }

    public LocalDate getFechaDispo() {
        return fechaDispo;
    }

    public void setFechaDispo(LocalDate fechaDispo) {
        this.fechaDispo = fechaDispo;
    }

    @Override
    public String toString() {
        return "Disponibilidad: " +
                "id='" + id + '\'' +
                ", rubroNombre='" + rubroNombre + '\'' +
                ", estado='" + estado + '\'' +
                ", bienEmpresaNombre='" + bienEmpresaNombre + '\'' +
                ", contratoEmpresaNombre='" + contratoEmpresaNombre + '\'' +
                ", propietario='" + propietario + '\'' +
                ", contratoEstado='" + contratoEstado + '\'' +
                ", contratoNumeroComp='" + contratoNumeroComp + '\'' +
                ", contratoFechaFin=" + contratoFechaFin +
                ", contratoFecha=" + contratoFecha +
                ", contratoClienteNombre='" + contratoClienteNombre + '\'' +
                ", contratoNumero='" + contratoNumero + '\'' +
                ", contratoFechaInicio=" + contratoFechaInicio +
                ", lineaNombre='" + lineaNombre + '\'' +
                ", propio='" + propio + '\'' +
                ", enTransito='" + enTransito + '\'' +
                ", ordenDeTrabajoDescripcion='" + ordenDeTrabajoDescripcion + '\'' +
                ", ordenDeTrabajoEstado='" + ordenDeTrabajoEstado + '\'' +
                ", ordenDeTrabajoNumeroComp='" + ordenDeTrabajoNumeroComp + '\'' +
                ", ordenDeTrabajoFechaEntrega=" + ordenDeTrabajoFechaEntrega +
                ", ordenDeTrabajoFechaInicio=" + ordenDeTrabajoFechaInicio +
                ", sucursalNombre='" + sucursalNombre + '\'' +
                ", entregado='" + entregado + '\'' +
                ", proveedorNombre='" + proveedorNombre + '\'' +
                ", articuloCodigo='" + articuloCodigo + '\'' +
                ", bienDescripcion='" + bienDescripcion + '\'' +
                ", bienEstado='" + bienEstado + '\'' +
                ", bienAFabricacion='" + bienAFabricacion + '\'' +
                ", bienDepositoAlmacenNombre='" + bienDepositoAlmacenNombre + '\'' +
                ", bienIdentificacion='" + bienIdentificacion + '\'' +
                ", bienModelo='" + bienModelo + '\'' +
                ", bienSerie='" + bienSerie + '\'' +
                ", fechaDispo=" + fechaDispo +
                '.';
    }

    public static class DateParser {
        // Función para extraer la fecha de una cadena que incluye fecha y hora
        public static LocalDate parseFecha(String fechaConHora) {
            if (fechaConHora == null || fechaConHora.isEmpty()) {
                return null; // Si no hay fecha, retorna null
            }

            // Define el patrón de fecha con hora opcional
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd[ HH:mm:ss[.SSS]]");

            try {
                // Parsea solo la fecha ignorando la hora si está presente
                return LocalDate.parse(fechaConHora, formatter);
            } catch (DateTimeParseException e) {
                System.err.println("Error al parsear la fecha: " + fechaConHora);
                return null; // Si falla el parseo, retorna null o podrías manejar el error de otra manera
            }
        }
    }
}