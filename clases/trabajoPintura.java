package clases;

import java.time.LocalDate;

public class trabajoPintura extends servicio{
    double superficie;
    double precioPintura;


    public trabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }


    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

    //Este método calculará el total gastado en material. 
    public double costeMaterial(){
        return (superficie / 7.8) * precioPintura;
    }

    //Este método calculará el total gastado en mano de obra.
    public double costeManoObra() {
        return (superficie/10.0)*9.5;
    }
 
    //Este método calculará el coste total del servicio.
    public double costeTotal() {
        return costeMaterial() + costeManoObra() + costeAdicional(); 
     }
     
    private double costeAdicional() {
        if(superficie<50) {
            return (costeMaterial()+costeManoObra()) * 0.15;
        } else {
            return 0;
        }
    }

    //Este método devolverá una cadena con información detallada de lo que ha costado el Servicio
    public String detalleServicio(){
        /*TRABAJO DE PINTURA 
        Cliente: (cliente) 
        Fecha de inicio: (fecha) 
        ---------------------------------------- 
        Pintor: (pintor) 
        Coste Material..... (coste material) 
        Coste Mano Obra.... (coste mano de obra) 
        Coste Adicional.... (coste adicional) 
        TOTAL: ............ (total coste servicio) 
        --------------------------------------*/
            String cadena = "";
            cadena += "TRABAJO DE PINTURA\n";
            cadena += "Cliente: "+cliente+"\n";
            cadena += "Fecha de Inicio: "+fechaInicio+"\n";
            cadena += "------------------\n";
            cadena += "Pintor: "+trabajador+"\n";
            cadena += "Coste Material: "+costeMaterial()+"\n";
            cadena += "Coste Mano Obra: "+costeManoObra()+"\n";
            cadena += "Coste Adicional: "+costeAdicional()+"\n";
            cadena += "TOTAL: "+costeTotal()+"\n";
            cadena += "------------------\n";
            return cadena;
        }
    }

