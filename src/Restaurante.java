/**
 * Main
 */
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {

	/**
     * Inicializa los iteradores de los menus
	 * @param MenuGeneral
	 * @param MenuDinamico
	 * @param MenuEspecial
     */

		MenuDinamico menuDinamico = new MenuDinamico();
        MenuGeneral menuGeneral = new MenuGeneral();
        MenuEspecial menuEspecial = new MenuEspecial();


		/**
     * Utiliza un scanner para los botones o casos
     */
        
        Robot robot = new Robot(menuGeneral, menuDinamico, menuEspecial);
		Scanner sc = new Scanner(System.in);
		int opcion;

		System.out.println("***BIENVENIDO.***"
						+ "\nPor favor elige la opcion que deseas ejecutar."
						+ "\nPor el momento, el robot está suspendido.");
		

		do{
			System.out.println(
				"1.- Activar.\n" +
				"2.- Suspender.\n" + 
				"3.- Caminar.\n" + 
				"4.- Ordenar.\n" +
				"5.- Cocinar.\n" +
                "0.- Salir del restaurante.\n");

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Elige una opción válida\n" + 
							"1.- Activar.\n" +
                            "2.- Suspender.\n" + 
                            "3.- Caminar.\n" + 
                            "4.- Ordenar.\n" +
                            "5.- Cocinar.\n" +
                            "0.- Salir del restaurante.\n");
					}
				}

				switch(opcion){
					case 1:
                        robot.activar();
                    	break;

					case 2:
						robot.suspender();
                    	break;

					case 3:
						robot.caminar();
						break;

					case 4:
						robot.darMenu();
						break;

					case 5:
						robot.cocinar();
						break;

					case 0:
						System.out.println("Espero que vuelvas pronto!");
						System.out.println("**Cerrando Programa**");
						break;

					default:
						System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
						break;

				}

		}while(opcion != 0);
	

	}
}

