import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDate;

import clases.revisionAlarma;
import clases.servicio;
import clases.trabajoPintura;

public class main{
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Servicio servi = new Servicio("Pepe",LocalDate.of(2022, 8, 15),"Zapatos García");
        
        trabajoPintura tp1 = new trabajoPintura("Antonio",LocalDate.of(2022,9,10), "Seguros Martínez", 20,4);
        //System.out.println(tp1.detalleServicio());
        
        revisionAlarma ra1 = new revisionAlarma(LocalDate.of(2022,8,6),"Colegio Santa Maria",34);
        //System.out.println(ra1.detalleServicio());
        
        trabajoPintura tp2 = new trabajoPintura("Ana",LocalDate.of(2022,8,8),"Fruteria La Pera", 10, 3);
        trabajoPintura tp3 = new trabajoPintura("Juan",LocalDate.of(2022,9,30),"Restaurante El Boqueron", 200,2.5);
        revisionAlarma ra2 = new revisionAlarma(LocalDate.of(2022,10,1),"Hotel Las Palmeras",70);
        
        ArrayList<servicio> trabajos = new ArrayList<>();
        trabajos.add(tp1);
        trabajos.add(ra1);
        trabajos.add(tp2);
        trabajos.add(tp3);
        trabajos.add(ra2);
        
        double ct = 0;
        double cmo = 0;
        
        for(servicio t: trabajos) {
            ct += t.costeTotal();
            cmo += t.costeManoObra();
            
            System.out.println(t.detalleServicio()+"\n\n");
        }
        System.out.println("Coste total de todos los trabajos: "+ct);
        System.out.println("Coste total de mano de obra: "+cmo);
    }
}