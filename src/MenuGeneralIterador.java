public class MenuGeneralIterador implements Iterator {
    Hamburguesa[] items;
    int posicion = 0;

    public MenuGeneralIterador(Hamburguesa[] items){
        this.items = items;
    }

    public Object next(){
        Hamburguesa menuItem = items[posicion];
        posicion = posicion + 1;
        return menuItem;
    }    

    public boolean hasNext(){
        if (posicion >= items.length || items[posicion] == null){
            return false;
        } else {
            return true;
        } 
    }
}
