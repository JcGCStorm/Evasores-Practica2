import java.util.Hashtable;
public class MenuEspecial implements Menu{
   Hashtable<Integer, Hamburguesa> menuItems = new Hashtable<>();

   public MenuEspecial(){
    menuItems = new Hashtable<Integer, Hamburguesa>();

    addItems(1, new HamburguesaNinoPobre());
    addItems(2, new HamburguesaValhalla());
    addItems(3, new HamburguesaLeviatan());
   }

   public void addItems(int id, Hamburguesa hamburguesa){
        menuItems.put(id, hamburguesa);
   }

   @SuppressWarnings({ "unchecked", "rawtypes" })
   @Override
   public Iterator createIterator(){
       return new MenuEspecialIterador(menuItems);
   }
}
