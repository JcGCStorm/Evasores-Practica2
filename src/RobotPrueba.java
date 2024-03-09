public class RobotPrueba {
    MenuDinamico menuDinamico;
    MenuGeneral menuGeneral;
    MenuEspecial menuEspecial;

    public RobotPrueba(MenuDinamico menuDinamico, MenuGeneral menuGeneral, MenuEspecial menuEspecial){
        this.menuDinamico = menuDinamico;
        this.menuGeneral = menuGeneral;
        this.menuEspecial = menuEspecial;
    }

    public void printMenu(){
      Iterator menuDinamicoIterador = menuDinamico.createIterator();
      Iterator menuGeneralIterador = menuGeneral.createIterator();
      Iterator menuEspecialIyIterador = menuEspecial.createIterator();
         System.out.println("Menu \n ------ MenuDinamico");
      printMenu(menuDinamicoIterador);
        System.out.println("Menu \n ------ MenuGeneral");
      printMenu(menuGeneralIterador);
        System.out.println("Menu Especial\n ------ MenuEspecial");
       printMenu(menuEspecialIyIterador);
    }

    private void printMenu(Iterator iterador){
        while (iterador.hasNext()){
            Hamburguesa menuItem = (Hamburguesa)iterador.next();
            System.out.println(menuItem.getID() + ", ");
            System.out.println(menuItem.getNombre() + ", ");
            System.out.println(menuItem.getDescripcion() + ", ");
        }
    }
}
