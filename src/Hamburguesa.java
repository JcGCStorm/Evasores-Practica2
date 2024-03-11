import java.util.Scanner;

/**
 * La clase Hamburguesa representa una hamburguesa genérica que puede ser
 * preparada
 * Es una clase abstracta que define el esqueleto básico de cómo se prepara una
 * hamburguesa
 */
public abstract class Hamburguesa {
    protected String nombre;
    protected int id;
    protected String descripcion;
    protected boolean tieneQueso;


    /**
     * Método para preparar una hamburguesa. Define el flujo general de cómo se
     * prepara
     * Este método no puede ser sobrescrito por las subclases
     */
    public final void prepararHamburguesa() {
        ponerPan();
        ponerMayonesa();
        ponerMostaza();

        Scanner scanner = new Scanner(System.in);
        boolean respuestaValida = false;
        String respuesta;

        while (!respuestaValida) {
            System.out.println("¿Deseas agregar queso? (Sí/No)");
            respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("Si") || respuesta.equalsIgnoreCase("Sí")) {
                ponerQueso();
                respuestaValida = true;
            } else if (respuesta.equalsIgnoreCase("No")) {
                respuestaValida = true;
            } else {
                System.out.println("Respuesta no válida ): Por favor responde 'Sí' o 'No'");
            }
        }
        ponerVegetales();
        ponerCatsup();
        ponerPan();

    }

    /**
     * Método abstracto para preparar la carne de la hamburguesa
     */
    protected abstract void prepararCarne();

    /**
     * Método abstracto para poner el pan de la hamburguesa
     */
    protected abstract void ponerPan();

    /**
     * Método abstracto para poner la mayonesa en la hamburguesa
     */
    protected abstract void ponerMayonesa();

    /**
     * Método abstracto para poner la mostaza en la hamburguesa
     */
    protected abstract void ponerMostaza();

    /**
     * Método abstracto para poner los vegetales en la hamburguesa
     */
    protected abstract void ponerVegetales();

    /**
     * Método abstracto para poner la catsup en la hamburguesa
     */
    protected abstract void ponerCatsup();

    /**
     * Método hook para poner el queso en la hamburguesa
     */
    protected void ponerQueso() {
        System.out.println("Poniendo queso...");
    }

    /**
     * Método hook para poner la carne en la hamburguesa
     */
    protected void ponerCarne() {
        System.out.println("Poniendo carne..");
    }

    /**
     * Método para obtener el nombre de la hamburguesa
     * 
     * @return El nombre de la hamburguesa
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el ID de la hamburguesa
     * 
     * @return El ID de la hamburguesa
     */
    public int getID() {
        return id;
    }

    /**
     * Método para obtener la descripción
     * 
     * @return La descripción de la hamburguesa.
     */
    public String getDescripcion() {
        return descripcion;
    }


}