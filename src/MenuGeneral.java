public class MenuGeneral implements Menu {
    static final int  maximoDeItems = 6;
    int numeroDeItems = 0;
    MenuItem[] menuItems;

  public MenuGeneral(){
    this.menuItems = new MenuItem[maximoDeItems];
    addItems(numeroDeItems, null, null, maximoDeItems, null, null);
  }  
    
  public void addItems(int id, String nombrePlatillo, String descripcion,
                       double precio,Boolean conQueso, Boolean esVegetariano){
      MenuItem menuItem = new MenuItem(id, nombrePlatillo, descripcion, precio, conQueso, esVegetariano);
      if (numeroDeItems >= maximoDeItems){
        System.err.println("No sé bien si esto se debe de implementar");
      } else {
        menuItems[numeroDeItems] = menuItem;
        numeroDeItems = numeroDeItems + 1;
      }
}

   public Iterator createIterator(){
      return new MenuGeneralIterador(menuItems);
   }
}
