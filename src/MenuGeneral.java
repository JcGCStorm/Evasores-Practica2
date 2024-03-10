   /**
    * Clase que representa al menú general, nunca cambia por lo que se guarda en un
    * Arreglo, además debe de contar con un iterador para poder recorrer el menu.
    */
public class MenuGeneral implements Menu {
    
    /**
     * @int maximoDeItems, es el número máximo de hamburguesas del menu general.
     */
    static final int  maximoDeItems = 3;

    /**
     * @int numeroDeItems, es la posicion de la hamburguesa, su numero en el arreglo.
     */
    int numeroDeItems = 0;

    /**
     * @Array Donde se guardan las hamburguesas del menu general.
     */
    Hamburguesa[] menuItems;

    /**
    * Constructor del menú general, en este constructor se agregan las
    * hamburguesas del menu. 
    * Invoca al metodo {@link MenuGeneral#addItems}
    */
  public MenuGeneral(){
    this.menuItems = new Hamburguesa[maximoDeItems];

    addItems(new HamburguesaCrazy8());
    addItems(new HamburguesaDemonio());
    addItems(new HamburguesaVitaCarnis());
  }  
    
  /**
    * Metodo que agrega hamburguesas al menu, recibe una Hamburguesa
    * @param hamburguesa
    */
  public void addItems(Hamburguesa hamburguesa){
      if (numeroDeItems >= maximoDeItems){
        System.err.println("Error, no se pueden agregar más hamburguesas, son inamovibles.");
      } else {
        menuItems[numeroDeItems] = hamburguesa;
        numeroDeItems = numeroDeItems + 1;
      }
}

   /**
    * Metodo que sobreescribe el metodo createIterator de la @interface Menu.
    * @return Un iterador de MenuGeneral.
    */
   public Iterator createIterator(){
      return new MenuGeneralIterador(menuItems);
   }
}
