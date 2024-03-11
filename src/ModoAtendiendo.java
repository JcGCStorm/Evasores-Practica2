/**
 * Clase que representa al modo atendiendo del robot.
 * @implements EstadoRobot
 */
public class ModoAtendiendo implements EstadoRobot {

    /**
     * Objeto de tipo robot. Lee el menú, cocina y en general, atiende al cliente.
     */
    Robot mesero;

    /**
     * Inicia al meseto en el estado atendiendo.
     * @param mesero
     */
    public ModoAtendiendo(Robot mesero) {
        this.mesero = mesero;
    }

    /**
     * Metodo suspender, que cambia al robot al estado suspendido
     * si es posible. En este caso no es posible pues está atendiendo.
     */
    public void suspender() {
        System.out.println("No puedes suspenderme mientras te atiendo");

    }

    /**
     * Metodo activar, que cambia al robot al estado activado si es posible, de lo contrario
     * anunciará que ya está activado.
     */
    public void activar() {
        System.out.println("Ya estoy activado y te estoy atendiendo");
    }

    /**
     * Metodo caminar, que cambia al robot al estado Caminando
     * si es posible, en este caso no es posible pues el robot ya llegó
     * y está atendiendo.
     */
    public void caminar() {
        System.out.println("Ya estoy contigo y te estoy atendiendo");

    }

    /**
     * Metodo darMenu, que imprime el menú y cambia el estado de la hamburguesa a Cocinando
     * Invoca al metodo {@link Robot#asignarNuevoEstado} y le pasa el nuevo estado.
     */
    public void darMenu() {
        System.out.println("***Cambiando a Modo para atender**");
        System.out.println("Cuándo elija lo que desea ordenar presione 5 y posteriormente el ID \n" + 
                           "de la hamburguesa para cocinarla.");
        mesero.printMenu();
        mesero.asignarNuevoEstado(mesero.getEstadoCocinando());
    }

     /**
     * Metodo cocinar, que cambia al robot al estado cocinando si es posible, de lo contrario
     * anunciará que primero el cliente debe ordenar.
     */
    public void cocinar() {
        System.out.println("Primero ordena algo");

    }

}
