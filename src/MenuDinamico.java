import java.util.ArrayList;

public class MenuDinamico implements Menu{
   ArrayList<Hamburguesa> menuItems;

   public MenuDinamico(){
    menuItems = new ArrayList<Hamburguesa>();

    addItems(new HamburguesaCiencias());
    addItems(new HamburguesaFilos());
    addItems(new HamburguesaInge());
   }

   public void addItems(Hamburguesa hamburguesa){
        menuItems.add(hamburguesa);
   }

   @Override
   public Iterator createIterator(){
       return new MenuDinamicoIterador(menuItems);
   }
}
