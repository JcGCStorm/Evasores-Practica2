/**
 * Clase que representa al modo activado del robot
 * @implements EstadoRobot
 */
public class ModoActivado implements EstadoRobot{
    
    /**
     * Objeto de tipo robot. Lee el menú, cocina y en general, atiende al cliente.
     */
    Robot mesero;

    /**
     * Inicia al meseto en el estado activado.
     * @param mesero
     */
    public ModoActivado(Robot mesero){
        this.mesero = mesero;
    }


    /**
     * Metodo suspender, que cambia al robot al estado suspendido
     * si es posible. Invoca al metodo {@link Robot#asignarNuevoEstado} y le pasa
     * el nuevo estado.
     */
    public void suspender(){
        System.out.println("Pasando a modo suspendido... \n Ya estoy suspendido, esperando ordenes.");
        mesero.asignarNuevoEstado(mesero.getEstadoSuspendido());

    }
    
     /**
     * Metodo activar, que cambia al robot al estado activado si es posible, de lo contrario
     * anunciará que ya está activado.
     */
    public void activar(){
        System.out.println("Ya estoy activado");

    }

    /**
     * Metodo caminar, que cambia al robot al estado Caminando
     * si es posible. Invoca al metodo {@link Robot#asignarNuevoEstado} y le pasa
     * el nuevo estado.
     */
    public void caminar(){
        System.out.println("Pasando a modo Caminando. \n Caminando hasta tu ubicación...");
        mesero.asignarNuevoEstado(mesero.getEstadoCaminando());

    }

    /**
     * Metodo darMenu, que cambia al robot al estado atendiendo si es posible, de lo contrario
     * anunciará que ya está primero debe llegar al cliente.
     */
    public void darMenu(){
        System.out.println("Primero dejame llegar contigo");

    }


     /**
     * Metodo cocinar, que cambia al robot al estado cocinando si es posible, de lo contrario
     * anunciará que primero el cliente debe ordenar.
     */
    public void cocinar(){
        System.out.println("Primero ordena algo");
        
    }
}
