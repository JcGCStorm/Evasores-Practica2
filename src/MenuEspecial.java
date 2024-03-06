public class MenuEspecial implements Menu{

   public void menuItems(){

   }

   public Iterator createIterator(){
    return new MenuDinamicoIterador(null);
   }
}
