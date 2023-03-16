import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        incidencia inc1 =new incidencia(105,"No tiene acceso a internet", "Pendiente");
        incidencia inc2 =new incidencia(15,"No tiene acceso a internet", "Pendiente");
        incidencia inc3 =new incidencia(55,"No tiene acceso a internet", "Pendiente");
        incidencia inc4 =new incidencia(105,"No tiene acceso a internet", "Pendiente");
        incidencia inc5 =new incidencia(5,"No tiene acceso a internet", "Pendiente");
        List<incidencia> ListaInc = new ArrayList<>();
        ListaInc.add(inc1);
        ListaInc.add(inc2);
        ListaInc.add(inc3);
        ListaInc.add(inc4);
        ListaInc.add(inc5);

        Scanner sn = new Scanner(System.in);
        Scanner sn2 = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        String opcion3;

        while (!salir) {

            System.out.println("1. Crear incidencia");
            System.out.println("2. Resolver incidencia");
            System.out.println("3. ver Incidencia");
            System.out.println("4. Salir");

            try {


                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado Crear incidencia 1");

                        System.out.println("Escribe Descripcion de la incidencia");
                        opcion3 = sn2.nextLine();
                        incidencia opcion2 = new incidencia();
                        opcion2.setEstado("pendiente");
                        opcion2.codigoNew();
                        opcion2.setDescripcion(opcion3);
                        ListaInc.add(opcion2);


                        break;
                    case 2:
                        System.out.println("Has seleccionado Resolver incidencia 2");
                        System.out.println("Escribe posicion de la incidencia");
                        opcion = sn.nextInt();
                        System.out.println("EL ELEMENTOS ES: " + ListaInc.get(opcion));
                        ListaInc.get(opcion).resolver();
                        System.out.println("ESTADO ACTUAL ES: " + ListaInc.get(opcion));

                        break;
                    case 3:
                        System.out.println("Has seleccionado ver Incidencias 3");
                        for (incidencia incidencia: ListaInc){
                            System.out.println(incidencia);
                        }

                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }





    }
}