public class RobotPrueba {
    MenuDinamico menuDinamico;
    MenuGeneral menuGeneral;

    public RobotPrueba(MenuDinamico menuDinamico, MenuGeneral menuGeneral){
        this.menuDinamico = menuDinamico;
        this.menuGeneral = menuGeneral;
    }

    public void printMenu(){
        Iterator menuDinamicoIterador = menuDinamico.createIterator();
        Iterator menuGeneralIterador = menuGeneral.createIterator();
        System.out.println("Menu \n ------ MenuDinamico");
        printMenu(menuDinamicoIterador);
        System.out.println("Menu \n ------ MenuGeneral");
        printMenu(menuGeneralIterador);
    }

    private void printMenu(Iterator iterador){
        while (iterador.hasNext()){
            MenuItem menuItem = (MenuItem)iterador.next();
            System.out.println(menuItem.getID() + ", ");
            System.out.println(menuItem.getNombre() + ", ");
            System.out.println(menuItem.getDescripcion() + ", ");
            System.out.println(menuItem.getPrecio());
        }
    }
}
