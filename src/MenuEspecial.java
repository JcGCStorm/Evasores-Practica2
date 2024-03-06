import java.util.Hashtable;
public class MenuEspecial implements Menu{
   Hashtable<Integer, MenuItem> menuItems = new Hashtable<>();

   public MenuEspecial(){
    menuItems = new Hashtable<Integer, MenuItem>();

    addItems(1, new MenuItem(1111, "Quancha al vapor", "Perro", 32.42, false, true));
   }

   public void addItems(int id, MenuItem menuItem){
        menuItems.put(id, menuItem);
   }

   @Override
   public Iterator createIterator(){
       return new MenuEspecialIterador(menuItems);
   }
}
