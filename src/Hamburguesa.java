/**
 * La clase Hamburguesa representa una hamburguesa genérica que puede ser preparada
 * Es una clase abstracta que define el esqueleto básico de cómo se prepara una hamburguesa
 */
public abstract class Hamburguesa {
    protected String nombre;
    protected int id;
    protected String descripcion;
    protected boolean tieneQueso;
    protected boolean esVegetariana;

    /**
     * Constructor para inicializar una hamburguesa con sus atributos
     * @param nombre El nombre de la hamburguesa
     * @param descripcion La descripción de la hamburguesa
     * @param precio El precio de la hamburguesa
     * @param tieneQueso Indica si la hamburguesa tiene queso o no
     * @param esVegetariana Indica si la hamburguesa es vegetariana o no
     *
    public Hamburguesa(String nombre, String descripcion, double precio, boolean tieneQueso, boolean esVegetariana) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tieneQueso = tieneQueso;
        this.esVegetariana = esVegetariana;
    }
    */

    /**
     * Método para preparar una hamburguesa. Define el flujo general de cómo se prepara
     * Este método no puede ser sobrescrito por las subclases
     */
    public final void prepararHamburguesa() {
        ponerPan();
        ponerMayonesa();
        ponerMostaza();
        if (!esVegetariana){
            ponerCarne();
            prepararCarne();
        }
        if (tieneQueso) {
            ponerQueso();
        }
        ponerVegetales();
        ponerCatsup();
        ponerPan();
    }
    // METODO PENDIENTE, DEPENDE DE COMO LO VAYAMOS A CONECTAR AL ROBOT

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
     * @return El nombre de la hamburguesa
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el ID de la hamburguesa
     * @return El ID de la hamburguesa
     */
    public int getID() {
        return id;
    }

    /**
     * Método para obtener la descripción 
     * @return La descripción de la hamburguesa.
     */
    public String getDescripcion() {
        return descripcion;
    }


    /**
     * Método para verificar si la hamburguesa tiene queso o no
     * @return true si la hamburguesa tiene queso, false de lo contrario
     */
    public boolean tieneQueso() {
        return tieneQueso;
    }

      /**
     * Método para verificar si la hamburguesa es vegetariana o no
     * @return true si la hamburguesa tiene queso, false de lo contrario
     */
    public boolean esVegetariana() {
        return esVegetariana;
    }


}
