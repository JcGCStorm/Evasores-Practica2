public class MenuGeneral implements Menu {
    static final int  maximoDeItems = 6;
    int numeroDeItems = 0;
    Hamburguesa[] menuItems;

  public MenuGeneral(){
    this.menuItems = new Hamburguesa[maximoDeItems];

    addItems(new HamburguesaCrazy8());
    addItems(new HamburguesaDemonio());
    addItems(new HamburguesaVitaCarnis());
  
  }  
    
  public void addItems(Hamburguesa hamburguesa){
      if (numeroDeItems >= maximoDeItems){
        System.err.println("No sé bien si esto se debe de implementar");
      } else {
        menuItems[numeroDeItems] = hamburguesa;
        numeroDeItems = numeroDeItems + 1;
      }
}

   public Iterator createIterator(){
      return new MenuGeneralIterador(menuItems);
   }
}
