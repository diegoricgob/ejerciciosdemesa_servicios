public interface interfaceServicio {

    //Este método calculará el total gastado en material. 
    double costeMaterial();

    //Este método calculará el total gastado en mano de obra.
    double costeManoObra();

    //Este método calculará el coste total del servicio.
    double costeTotal();

    //Este método devolverá una cadena con información detallada de lo que ha costado el Servicio
    String detalleServicio();
    
    
}
