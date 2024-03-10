import java.util.Hashtable;

    /**
    * Clase que representa al menú especial, el más caro de todos, al ser especial
    * se guarda en un HashTable, además debe de contar con un iterador para poder recorrer el menu.
    */
public class MenuEspecial implements Menu{
    /**
     * @HashTable Donde se guardan las hamburguesas del menu dinamico.
     */
   Hashtable<Integer, Hamburguesa> menuItems = new Hashtable<>();

     /**
    * Constructor del menú especial, en este constructor se agregan las
    * hamburguesas del menu. 
    * Invoca al metodo {@link MenuEspecial#addItems}
    */
   public MenuEspecial(){
    menuItems = new Hashtable<Integer, Hamburguesa>();

    addItems(1, new HamburguesaNinoPobre());
    addItems(2, new HamburguesaValhalla());
    addItems(3, new HamburguesaLeviatan());
   }

   /**
    * Metodo que agrega hamburguesas al menu, recibe un ID del HashTable y una Hamburguesa.
    * @param hamburguesa
    */
   public void addItems(int id, Hamburguesa hamburguesa){
        menuItems.put(id, hamburguesa);
   }

   /**
    * Metodo que sobreescribe el metodo createIterator de la @interface Menu.
    * @return Un iterador de MenuEspecial.
    */
   @SuppressWarnings({ "unchecked", "rawtypes" })
   @Override
   public Iterator createIterator(){
       return new MenuEspecialIterador(menuItems);
   }
}
