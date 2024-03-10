    /**
   * Esta clase nos ayuda a implementar el iterador de 
   * MenuGeneral.
   */
public class MenuGeneralIterador implements Iterator {
    /**
     * @Array Donde se guardan las hamburguesas del menu dinamico.
     */
    Hamburguesa[] items;
    /**
     * @int Nos dice la posicion del Iterador.
     */
    int posicion = 0;

    /**
    * Constructor del iterador de MenuGeneral, en este constructor 
    * se inicia el arreglo de las hamburguesas del menu. 
    * @param items la lista de hamburguesas.
    */
    public MenuGeneralIterador(Hamburguesa[] items){
        this.items = items;
    }

    /**
    * Metodo next de la interfaz Iterator, regresa un objeto de tipo
    * Hamburguesa.
    * @return menuItem, la hamburguesa siguiente.
    */
    public Hamburguesa next(){
        Hamburguesa menuItem = items[posicion];
        posicion = posicion + 1;
        return menuItem;
    }    

    /**
     * Metodo hasNext de la interfaz Iterator regresa un boolean que nos
     * dice si tiene un siguiente.
     * @return true si tiene un elemento siguiente, false en otro caso
     */
    public boolean hasNext(){
        if (posicion >= items.length || items[posicion] == null){
            return false;
        } else {
            return true;
        } 
    }
}
