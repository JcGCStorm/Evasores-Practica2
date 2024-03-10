import java.util.Hashtable;
import java.util.Enumeration;
import java.util.NoSuchElementException;

  /**
   * Esta clase nos ayuda a implementar el iterador de 
   * MenuEspecial.
   */
public class MenuEspecialIterador<HashTable> implements Iterator{
   @SuppressWarnings("rawtypes")

    /**
     * @HashTable items, Donde se guardan las hamburguesas del menu dinamico.
     */
   Hashtable items;

     /**
      * @int posicion, la posicion del Iterador.
      */
   int posicion = 0;

   /**
    * Constructor del iterador de MenuEspecial, en MenuEspecialIterador
    * se inicia el HashTable de las hamburguesas del menu. 
    * @param items la lista de hamburguesas.
    */
   @SuppressWarnings("rawtypes")
   public MenuEspecialIterador(HashTable items){
      this.items = (Hashtable) items;
   }

   /**
    * Metodo next de la interfaz Iterator, regresa un objeto de tipo
    * Hamburguesa.
    * @return el elemento siguiente.
    */
    @SuppressWarnings("unchecked")
    public Hamburguesa next() {
       if (hasNext()){
        Enumeration<Hamburguesa> elementos = items.elements();
          for (int i = 0; i < posicion; i = i + 1) {
            elementos.nextElement();
          }
        posicion = posicion + 1;
        return elementos.nextElement();
       } else {
        throw new NoSuchElementException();
       }
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
