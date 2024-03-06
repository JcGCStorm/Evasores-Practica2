import java.util.Hashtable;
import java.util.Enumeration;
import java.util.NoSuchElementException;

public class MenuEspecialIterador<HashTable> implements Iterator{
   Hashtable items;
   int posicion = 0;

   public MenuEspecialIterador(HashTable items){
      this.items = (Hashtable) items;
   }

    public MenuItem next() {
       if (hasNext()){
        Enumeration<MenuItem> valores = items.elements();
          for (int i = 0; i < posicion; i = i + 1) {
            valores.nextElement();
          }
        posicion = posicion + 1;
        return valores.nextElement();
       } else {
        throw new NoSuchElementException();
       }
    }
    
    public boolean hasNext(){
        if (posicion >= items.size()){
            return false;
        } else {
            return true;
        }

    }
}
