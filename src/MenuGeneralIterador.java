public class MenuGeneralIterador implements Iterator {
    MenuItem[] items;
    int posicion = 0;

    public MenuGeneralIterador(MenuItem[] items){
        this.items = items;
    }

    public Object next(){
        MenuItem menuItem = items[posicion];
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
