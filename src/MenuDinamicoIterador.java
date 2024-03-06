import java.util.ArrayList;

public class MenuDinamicoIterador implements Iterator{
   ArrayList<MenuItem> items;
   int position = 0;

   public MenuDinamicoIterador(ArrayList<MenuItem> items){
      this.items = items;
   }

    public MenuItem next() {
       MenuItem item = items.get(position);
       position = position + 1;
       return item;
    }
    
    public boolean hasNext(){
        if (position >= items.size()){
            return false;
        } else {
            return true;
        }

    }
}
