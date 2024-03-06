public class MenuTest {
    public static void main(String args[]){
        MenuDinamico menuDinamico = new MenuDinamico();
        MenuGeneral menuGeneral = new MenuGeneral();
        MenuEspecial menuEspecial = new MenuEspecial();

        RobotPrueba robotPrueba = new RobotPrueba(menuDinamico, menuGeneral, menuEspecial);
        robotPrueba.printMenu();
        }
}
