import java.util.ArrayList;

public class MenuDinamico implements Menu{
   ArrayList<MenuItem> menuItems;

   public MenuDinamico(){
    menuItems = new ArrayList<MenuItem>();

    addItems(1211, "Quancha", "lol", 5.3, false, true);
   }

   public void addItems(int id, String nombrePlatillo, String descripcion,
                        double precio,Boolean conQueso, Boolean esVegetariano){
        MenuItem menuItem = new MenuItem(id, nombrePlatillo, descripcion, precio, conQueso, esVegetariano);
        menuItems.add(menuItem);
   }

   @Override
   public Iterator createIterator(){
       return new MenuDinamicoIterador(menuItems);
   }
}
