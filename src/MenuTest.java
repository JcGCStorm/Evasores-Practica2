public class MenuTest {
    public static void main(String args[]){
        MenuDinamico menuDinamico = new MenuDinamico();
        MenuGeneral menuGeneral = new MenuGeneral();

        RobotPrueba robotPrueba = new RobotPrueba(menuDinamico, menuGeneral);
        robotPrueba.printMenu();
        }
}
