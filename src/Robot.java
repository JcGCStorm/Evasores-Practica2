
public class Robot{

    /**
     * Atributos de los menus
	 * @param MenuGeneral
	 * @param MenuDinamico
	 * @param MenuEspecial
     */
    MenuGeneral menuGeneral;
    MenuDinamico menuDinamico;
    MenuEspecial menuEspecial;


    /**
     * Arributos de estado
     * @param modoActivado
     * @param modoSuspendido
     * @param modoCaminando
     * @param modoAtendiendo
     * @param modoCocinando
     */
    private EstadoRobot estadoActual;
    private EstadoRobot modoSuspendido;
    private EstadoRobot modoActivado;
    private EstadoRobot modoCaminando;
    private EstadoRobot modoCocinando;
    private EstadoRobot modoAtendiendo;

    //Atributo de la distacia del robot al cliente
    private int distanciaCliente;

    /**
     * Constructor que recibe todos los menús.
     * Además inicializa los estados y asigna el estado inicial
     * @param menuGeneral
     * @param menuDinamico
     * @param menuEspecial
     */    
    
    public Robot(MenuGeneral menuGeneral, MenuDinamico menuDinamico, MenuEspecial menuEspecial){
        this.menuGeneral = menuGeneral;
        this.menuDinamico = menuDinamico;
        this.menuEspecial = menuEspecial;


        modoSuspendido = new ModoSuspendido(this);
        modoActivado = new ModoActivado(this);
        modoCaminando = new ModoCaminando(this);
        modoAtendiendo = new ModoAtendiendo(this);
        modoCocinando = new ModoCocinando(this);

        estadoActual = modoSuspendido;

        distanciaCliente = 0;
    }


    /**
     * Método que asigna un nuevo estado o modo al robot
     * @param nuevoEstado
     */
    public void asignarNuevoEstado(EstadoRobot nuevoEstado){
        estadoActual = nuevoEstado;
    }

    /**
     * Método que obtiene la distancia al cliente
     * @param distanciaCliente
     */
    public int getdistanciaCliente(){
        return distanciaCliente;
    }

    /**
     * Método que asigna la distancia al cliente
     * @param distanciaCliente
     */
    public void setdistanciaCliente(int distanciaCliente){
        this.distanciaCliente = distanciaCliente;
    }

    
    /**
     * Métodos para cambiar el estado actual segun lo que se requiera
     * @param ModoActivado
     * @param ModoSuspendido
     * @param ModoCaminando
     * @param ModoAtendiendo
     * @param ModoCocinando
     */
    public void activar(){
        estadoActual.activar();
    }

    public void suspender(){
        estadoActual.suspender();
    }

    public void caminar(){
        estadoActual.caminar();
    }

    public void darMenu(){
        estadoActual.darMenu();
    }

    public void cocinar(){
        estadoActual.cocinar();
    }


    /**
     * Método para imprimir el menu
     * @param menuGeneralIterador
     * @param menuDinamicoIterador
     * @param menuEspecialIterador
     */
    public void printMenu(){
      Iterator menuDinamicoIterador = menuDinamico.createIterator();
      Iterator menuGeneralIterador = menuGeneral.createIterator();
      Iterator menuEspecialIyIterador = menuEspecial.createIterator();
         System.out.println("Menu \n ------ MenuDinamico ------");
      printMenu(menuDinamicoIterador);
        System.out.println(" ------ MenuGeneral ------");
      printMenu(menuGeneralIterador);
        System.out.println(" ------ MenuEspecial ------");
       printMenu(menuEspecialIyIterador);
    }

    /**
     * Método auxiliar para la estructura del menu
     */
      private void printMenu(Iterator iterador){
          while (iterador.hasNext()){
              Hamburguesa menuItem = (Hamburguesa)iterador.next();
              System.out.println("ID:" + menuItem.getID());
              System.out.println(menuItem.getNombre());
              System.out.println(menuItem.getDescripcion() + "\n");
          }
      }


    /**
     * Método que obtiene el estado al cambiarlo
     * @param modoActivado
     */
    public EstadoRobot getEstadoActivado(){
        return modoActivado;
    }

    /**
     * Método que obtiene el estado al cambiarlo
     * @param modoCaminando
     */
    public EstadoRobot getEstadoCaminando(){
        return modoCaminando;
    }

    /**
     * Método que obtiene el estado al cambiarlo
     * @param modoAtendiendo
     */
    public EstadoRobot getEstadoAtendiendo(){
        return modoAtendiendo;
    }

    /**
     * Método que obtiene el estado al cambiarlo
     * @param modoCocinando
     */
    public EstadoRobot getEstadoCocinando(){
        return modoCocinando;
    }

    /**
     * Método que obtiene el estado al cambiarlo
     * @param modoSuspendido
     */
    public EstadoRobot getEstadoSuspendido(){
        return modoSuspendido;
    }



}