import java.util.ArrayList;

   /**
    * Clase que representa al menú que cambia cada dia según los deseos del
    * gerente, puede tener más o menos Hamburguesas por lo que se guarda en un
    * ArrayList, además debe de contar con un iterador para poder recorrer el menu.
    */
public class MenuDinamico implements Menu{
    /**
     * @ArrayList Donde se guardan las hamburguesas del menu dinamico.
     */
   ArrayList<Hamburguesa> menuItems;
   /**
    * Constructor del menú dinamico, en este constructor se agregan las
    * hamburguesas del menu. 
    * Invoca al metodo {@link MenuDinamico#addItems}
    */
   public MenuDinamico(){
    menuItems = new ArrayList<Hamburguesa>();

    addItems(new HamburguesaCiencias());
    addItems(new HamburguesaFilos());
    addItems(new HamburguesaInge());
   }

   /**
    * Metodo que agrega hamburguesas al menu, recibe una Hamburguesa
    * @param hamburguesa
    */
   public void addItems(Hamburguesa hamburguesa){
        menuItems.add(hamburguesa);
   }

   /**
    * Metodo que sobreescribe el metodo createIterator de la @interface Menu.
    * @return Un iterador de MenuDinamico.
    */
   @Override
   public Iterator createIterator(){
       return new MenuDinamicoIterador(menuItems);
   }
}
