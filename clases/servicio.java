package clases;

import java.time.LocalDate;

public abstract class servicio{

    String trabajador;
    LocalDate fechaInicio;
    String cliente;


    public servicio(String trabajador, LocalDate fechaInicio, String cliente) {
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }

    public servicio(String cliente) {
        this.cliente = cliente;
    }

    //Este método calculará el total gastado en material. 
    public abstract double costeMaterial();

    //Este método calculará el total gastado en mano de obra.
    public abstract double costeManoObra();

    //Este método calculará el coste total del servicio.
    public abstract double costeTotal();

    //Este método devolverá una cadena con información detallada de lo que ha costado el Servicio
    public abstract String detalleServicio();

        


    
}