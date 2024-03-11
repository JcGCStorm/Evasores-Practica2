/**
 * Clase que representa al modo suspendido del robot.
 * @implements EstadoRobot
 */
public class ModoSuspendido implements EstadoRobot{

    /**
     * Objeto de tipo robot. Lee el menú, cocina y en general, atiende al cliente.
     */
    Robot mesero;

     /**
     * Inicia al mesero en el estado ModoSuspendido.
     * @param mesero
     */
    public ModoSuspendido(Robot mesero){
        this.mesero = mesero;
    }

    /**
     * Metodo suspender, que cambia al robot al estado suspendido
     * si es posible. En este caso no es posible pues está suspendido.
     */
    public void suspender(){
        System.out.println("Ya está suspendido");

    }
    
     /**
     * Metodo activar, que cambia al robot al estado activado si es posible, de lo contrario
     * anunciará que ya está activado. En este caso invoca al metodo {@link Robot#asignarNuevoEstado}
     * y activa al robot.
     */
    public void activar(){
        System.out.println("Activando, por favor espere... \n Ya estoy activado, esperando llamada de cliente.");
        mesero.asignarNuevoEstado(mesero.getEstadoActivado());

    }

     /**
     * Metodo caminar, que cambia al robot al estado Caminando
     * si es posible, en este caso ya no puede caminar pues está suspendido.
     */
    public void caminar(){
        System.out.println("Para caminar antes debes activar al robot");
    }

     /**
     * Metodo darMenu, que imprime el menú y cambia el estado de la hamburguesa a atendiendo
     * En este caso no puede pues está suspendido.
     */
    public void darMenu(){
        System.out.println("Para obtener un menu antes debes activar al robot y esperar a que llegue a tí");

    }


    /**
     * Metodo cocinar, que cambia al robot al estado cocinando si es posible, de lo contrario
     * anunciará que primero el cliente debe ordenar.
     */
    public void cocinar(){
        System.out.println("Sabemos que tienes hambre, pero antes debes activar al robot");
        
    }

    
}
