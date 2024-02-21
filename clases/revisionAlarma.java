package clases;

import java.time.LocalDate;

public class revisionAlarma extends servicio {
    int numeroAlarmas;

    public revisionAlarma(LocalDate localDate, String cliente, int numeroAlarmas) {
        super(cliente);
        this.numeroAlarmas = numeroAlarmas;
        this.trabajador= "Revisor Especialista Contraincendios";
    }

    public int getNumeroAlarmas() {
        return numeroAlarmas;
    }

    public void setNumeroAlarmas(int numeroAlarmas) {
        this.numeroAlarmas = numeroAlarmas;
    }

    public double costeMaterial(){
        //El coste de material en este tipo de trabajo es 0.
        return 0;
    } 
     
    public double costeManoObra(){
        /*El coste de mano de obra dependerá del número de alarmas a revisar y se 
        calculará de la siguiente forma: Coste_mano_obra = (número_alarmas / 3) * 40;*/
        return (numeroAlarmas / 3) * 40;
    } 
    
    public double costeTotal(){
        //El coste total es igual al coste de mano de obra. 
        return costeManoObra();
    }
    
    public String detalleServicio(){
        /*Este método devolverá un resumen del servicio con la siguiente estructura:  
        REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS 
        Cliente: (cliente) 
        Fecha revisión: (fecha) 
        ---------------------------------------- 
        TOTAL: ....... (total coste servicio) 
        --------------------------------------*/
        String cadena = "";

        cadena += "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS\n";
        cadena += "Cliente: "+cliente+"\n";
        cadena += "Fecha: "+fechaInicio+"\n";
        cadena += "----------------------\n";
        cadena += "TOTAL: "+costeTotal()+"\n";
        cadena += "----------------------\n";
        return  cadena;
    }

    
    

    
}
