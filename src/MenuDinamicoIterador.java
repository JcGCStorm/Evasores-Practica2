import java.util.ArrayList;

public class MenuDinamicoIterador implements Iterator{
   ArrayList<Hamburguesa> items;
   int posicion = 0;

   public MenuDinamicoIterador(ArrayList<Hamburguesa> items){
      this.items = items;
   }

    public Hamburguesa next() {
       Hamburguesa item = items.get(posicion);
       posicion = posicion + 1;
       return item;
    }
    
    public boolean hasNext(){
        if (posicion >= items.size()){
            return false;
        } else {
            return true;
        }

    }
}
