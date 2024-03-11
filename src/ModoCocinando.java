import java.util.Scanner;

/**
 * Clase que representa al modo Cocinando del robot.
 * @implements EstadoRobot
 */
public class ModoCocinando implements EstadoRobot{

    /**
     * Objeto de tipo robot. Lee el menú, cocina y en general, atiende al cliente.
     */
    Robot mesero;

    /**
     * Inicia al meseto en el estado Cocinando.
     * @param mesero
     */
    public ModoCocinando(Robot mesero){
        this.mesero = mesero;
    }

    /**
     * Metodo suspender, que cambia al robot al estado suspendido
     * si es posible. En este caso no es posible pues está a punto de cocinar.
     */
    public void suspender(){
        System.out.println("¿Quieres tu orden cruda?");

    }

     /**
     * Metodo activar, que cambia al robot al estado activado si es posible, de lo contrario
     * anunciará que ya está activado.
     */
    public void activar(){
        System.out.println("Ya estoy activado y a punto de cocinar");

    }

     /**
     * Metodo caminar, que cambia al robot al estado Caminando
     * si es posible, en este caso ya no puede caminar pues ya llego con el cliente.
     */
    public void caminar(){
        System.out.println("Esta bien caminare y le dare tu hamburguesa a alguien que si la quiera");

    }

    /**
     * Metodo darMenu, que imprime el menú y cambia el estado de la hamburguesa a Cocinando
     * En este caso no puede pues ya está cocinando.
     */
    public void darMenu(){
        System.out.println("...");

    }

    /**
     * Metodo cocinar, que cambia al robot al estado suspendido una vez termina de cocinar.
     * Recibe el id de la hamburguesa con un scanner y con un switch cocina la hamburguesa deseada-
     * finalmente pone al robot en modo suspension invoca al metodo {@link Robot#asignarNuevoEstado} 
     * y le pasa el nuevo estado que es suspendido.
     */
    @Override
    public void cocinar(){
        System.out.println("Por favor, ingrese el id de la hamburguesa que desea:");

        Scanner sc = new Scanner(System.in);
        int opcionMenu;

        do {
            while (true) {
                try {
                    String opcionUsuario = sc.nextLine();
                    opcionMenu = Integer.parseInt(opcionUsuario);
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("Elige un ID válido\n");
                }
            }

            switch (opcionMenu) {
                case 301:
                    System.out.println("Usted ha elegido la Hamburguesa Ciencias. \n Preparando...");
                    HamburguesaCiencias ciencias = new HamburguesaCiencias();
                    elegirHamburguesa(ciencias);
                    System.out.println("Hamburguesa lista, espero disfrute su comida.");
                    System.out.println(
                            "Si desea volver a ordenar activeme y llameme. \n ---Robot en estado suspendido---");
                    opcionMenu = 0;
                    mesero.asignarNuevoEstado(mesero.getEstadoSuspendido());
                    break;

                case 302:
                System.out.println("Usted ha elegido la Hamburguesa Filos. \n Preparando...");
                HamburguesaFilos filos = new HamburguesaFilos();
                elegirHamburguesa(filos);
                System.out.println("Hamburguesa lista, espero disfrute su comida.");
                System.out.println(
                        "Si desea volver a ordenar activeme y llameme. \n ---Robot en estado suspendido---");
                opcionMenu = 0;
                mesero.asignarNuevoEstado(mesero.getEstadoSuspendido());
                    break;

                case 303:
                System.out.println("Usted ha elegido la Hamburguesa Inge. \n Preparando...");
                HamburguesaInge inge = new HamburguesaInge();
                elegirHamburguesa(inge);
                System.out.println("Hamburguesa lista, espero disfrute su comida.");
                System.out.println(
                        "Si desea volver a ordenar activeme y llameme. \n ---Robot en estado suspendido---");
                opcionMenu = 0;
                mesero.asignarNuevoEstado(mesero.getEstadoSuspendido());                    
                    break;

                case 202:
                    System.out.println("Usted ha elegido la Hamburguesa NinoPobre. \n Preparando...");
                    HamburguesaNinoPobre NinoPobre= new HamburguesaNinoPobre();
                    elegirHamburguesa(NinoPobre);
                    System.out.println("Hamburguesa lista, espero disfrute su comida.");
                    System.out.println(
                            "Si desea volver a ordenar activeme y llameme. \n ---Robot en estado suspendido---");
                    opcionMenu = 0;
                    mesero.asignarNuevoEstado(mesero.getEstadoSuspendido());
                    break;

                case 203:
                    System.out.println("Usted ha elegido la Hamburguesa Crazy8. \n Preparando...");
                    HamburguesaCrazy8 crazy8 = new HamburguesaCrazy8();
                    elegirHamburguesa(crazy8);
                    System.out.println("Hamburguesa lista, espero disfrute su comida.");
                    System.out.println(
                            "Si desea volver a ordenar activeme y llameme. \n ---Robot en estado suspendido---");
                    opcionMenu = 0;
                    mesero.asignarNuevoEstado(mesero.getEstadoSuspendido());
                    break;
                case 201:
                    System.out.println("Usted ha elegido la Hamburguesa Vita Carnis. \n Preparando...");
                    HamburguesaVitaCarnis vitaCarnis = new HamburguesaVitaCarnis();
                    elegirHamburguesa(vitaCarnis);
                    System.out.println("Hamburguesa lista, espero disfrute su comida.");
                    System.out.println(
                            "Si desea volver a ordenar activeme y llameme. \n ---Robot en estado suspendido---");
                    opcionMenu = 0;
                    mesero.asignarNuevoEstado(mesero.getEstadoSuspendido());
                    break;

                case 102:
                    System.out.println("Usted ha elegido la Hamburguesa Leviatan. \n Preparando...");
                    HamburguesaLeviatan leviatan = new HamburguesaLeviatan();
                    elegirHamburguesa(leviatan);
                    System.out.println("Hamburguesa lista, espero disfrute su comida.");
                    System.out.println(
                            "Si desea volver a ordenar activeme y llameme. \n ---Robot en estado suspendido---");
                    opcionMenu = 0;
                    mesero.asignarNuevoEstado(mesero.getEstadoSuspendido());
                    break;

                case 101:
                    System.out.println("Usted ha elegido la Hamburguesa Demonio. \n Preparando...");
                    HamburguesaDemonio demonio = new HamburguesaDemonio();
                    elegirHamburguesa(demonio);
                    System.out.println("Hamburguesa lista, espero disfrute su comida.");
                    System.out.println(
                            "Si desea volver a ordenar activeme y llameme. \n ---Robot en estado suspendido---");
                    opcionMenu = 0;
                    mesero.asignarNuevoEstado(mesero.getEstadoSuspendido());
                    break;
                case 103:
                    System.out.println("Usted ha elegido la Hamburguesa Valhalla. \n Preparando...");
                    HamburguesaValhalla valhalla = new HamburguesaValhalla();
                    elegirHamburguesa(valhalla);
                    System.out.println("Hamburguesa lista, espero disfrute su comida.");
                    System.out.println(
                            "Si desea volver a ordenar activeme y llameme. \n ---Robot en estado suspendido---");
                    opcionMenu = 0;
                    mesero.asignarNuevoEstado(mesero.getEstadoSuspendido());
                    break;

                    case 0:
						System.out.println("Espero que vuelvas pronto!");
						System.out.println("**Cerrando Programa**");
						break;

                default:
                    System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
                    break;

            }
        } while (opcionMenu != 0);
    }

    /**
     * Método auxiliar de {@link ModoCocinando#cocinar} que recibe una hamburguesa y
     * la prepara, mandando a llamar al metodo {@link Hamburguesa#prepararHamburguesa}
     * de la hamburguesa deseada.
     * @param hamburguesa la hamburguesa que ordenó el cliente.
     */
    public void elegirHamburguesa(Hamburguesa hamburguesa) {
        hamburguesa.prepararHamburguesa();
    }


}
