/**
 * Clase que representa al modo atendiendo del robot.
 * @implements EstadoRobot
 */
public class ModoCaminando implements EstadoRobot{

    /**
     * Objeto de tipo robot. Lee el menú, cocina y en general, atiende al cliente.
     */
    Robot mesero;

    /**
     * Inicia al mesero en el estado ModoCaminando.
     * @param mesero
     */
    public ModoCaminando(Robot mesero){
        this.mesero = mesero;
    }

    /**
     * Metodo suspender, que cambia al robot al estado suspendido
     * si es posible. En este caso no es posible pues está camimando.
     */
    public void suspender(){
        System.out.println("¿Para que me enciendes? Ya me llamaste, debo llegar contigo");

    }
    
    /**
     * Metodo activar, que cambia al robot al estado activado si es posible, de lo contrario
     * anunciará que ya está activado.
     */
    public void activar(){
        System.out.println("Ya estoy activado voy contigo");

    }

    /**
     * Metodo caminar, que cambia al robot al estado Caminando
     * si es posible, en este caso ya está caminando hacia el cliente.
     * Lo que si hace es que al llegar al cliente Invoca al metodo 
     * {@link Robot#asignarNuevoEstado} y le pasa el nuevo estado que es atendiendo.
     */
    public void caminar(){
        mesero.setdistanciaCliente(mesero.getdistanciaCliente()+1);
        if(mesero.getdistanciaCliente()<2){
            System.out.println("Estoy caminando");
        }else if(mesero.getdistanciaCliente()==2){
            System.out.println("No te desesperes, ya casi estoy contigo.");
        }else if(mesero.getdistanciaCliente()==3){
            System.out.println("Listo, presione 4 para ordenar.");
            mesero.asignarNuevoEstado(mesero.getEstadoAtendiendo());
        }else{
            System.out.println("Ya estoy contigo, por favor selecciona Ordenar para que pueda tomar tu orden:)");
            mesero.asignarNuevoEstado(mesero.getEstadoAtendiendo());
        }

    }

    /**
     * Metodo darMenu, que imprime el menú y cambia el estado de la hamburguesa a Cocinando
     * En este caso no puede pues aún no llega con el cliente.
     */
    public void darMenu(){
        System.out.println("Aun no estoy contigo");

    }

    /**
     * Metodo cocinar, que cambia al robot al estado cocinando si es posible, de lo contrario
     * anunciará que primero el cliente debe ordenar.
     */
    public void cocinar(){
        System.out.print("Ni si quiera se que cocinar");
        
    }
    
}
