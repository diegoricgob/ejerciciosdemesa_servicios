import java.time.LocalDate;
import java.util.Scanner;

import clases.revisionAlarma;
import clases.trabajoPintura;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        int tipoObra = -1;

        try {

            do {

                // Try catch para evitar que el programa termine si hay un error

                // OBJETO
                trabajoPintura trabajoPintura1 = new trabajoPintura("Juan", LocalDate.now(), "Ana", 100, 10);
                revisionAlarma revisionAlarma1= new revisionAlarma("Ana", 10);

                System.out.println("Elige el tipo de obra:" +
                        "\n1. Pintura" +
                        "\n2- Alarma" +
                        "\n0.- Salir");
                tipoObra = opcion = sc.nextInt();

                System.out.println("MENU DE OPCIONES:" +
                        "\n1. Coste total" +
                        "\n2- Detalle de la obra" +
                        "\n0.- Salir");

                System.out.print("Enter la opcion elegida: ");

                opcion = sc.nextInt();

                // Ejemplo de switch case en Java
                switch (opcion) {

                    case 1: //coste total
                        if(tipoObra==1){
                            System.out.println("El precio de la obra es: " +trabajoPintura1.costeTotal());
                        }else{
                            
                            System.out.println("El precio de la obra es: " +revisionAlarma1.costeTotal());
                        }
                    break;

                    case 2: //factura
        
                    System.out.println("El precio de la obra es: " +trabajoPintura1.detalleServicio());
                    break;

                    case 0:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }// switch

                System.out.println("\n"); // Mostrar un salto de línea en Java

            } while (opcion != 0);// while
            System.out.println("Hasta pronto");
        } // try
        catch (Exception e) {
            System.out.println("Uoop! Error!");
        } // catch

    }
}