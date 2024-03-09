import java.util.Hashtable;
import java.util.Enumeration;
import java.util.NoSuchElementException;

public class MenuEspecialIterador<HashTable> implements Iterator{
   @SuppressWarnings("rawtypes")
   Hashtable items;
   int posicion = 0;

   @SuppressWarnings("rawtypes")
   public MenuEspecialIterador(HashTable items){
      this.items = (Hashtable) items;
   }

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
    
    public boolean hasNext(){
        if (posicion >= items.size()){
            return false;
        } else {
            return true;
        }

    }
}
