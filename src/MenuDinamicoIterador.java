import java.util.ArrayList;

  /**
   * Esta clase nos ayuda a implementar el iterador de 
   * MenuDinamico.
   */

public class MenuDinamicoIterador implements Iterator{
    /**
     * @ArrayList Donde se guardan las hamburguesas del menu dinamico.
     */
   ArrayList<Hamburguesa> items;

    /**
     * @int Nos dice la posicion del Iterador.
     */
   int posicion = 0;


   /**
    * Constructor del iterador de MenuDinamico, en este constructor 
    * se inicia el arreglo de las hamburguesas del menu. 
    * @param items la lista de hamburguesas.
    */
   public MenuDinamicoIterador(ArrayList<Hamburguesa> items){
      this.items = items;
   }

   /**
    * Metodo next de la interfaz Iterator, regresa un objeto de tipo
    * Hamburguesa.
    * @return item, la hamburguesa siguiente.
    */
    public Hamburguesa next() {
       Hamburguesa item = items.get(posicion);
       posicion = posicion + 1;
       return item;
    }
    
    /**
     * Metodo hasNext de la interfaz Iterator regresa un boolean que nos
     * dice si tiene un siguiente.
     * @return true si tiene un elemento siguiente, false en otro caso
     */
    public boolean hasNext(){
        if (posicion >= items.size()){
            return false;
        } else {
            return true;
        }

    }
}
