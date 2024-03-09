/**
 * La clase HamburguesaLeviatan representa una hamburguesa con carne de Leviatan
 * Extiende la clase abstracta Hamburguesa e implementa métodos específicos para supreparación 
 */
public class HamburguesaLeviatan extends Hamburguesa {

     /**
     * Constructor para crear una nueva HamburguesaLeviatan
     * 
     */
    public HamburguesaLeviatan() {
        super.nombre = "Hamburguesa Estilo Leviatan";
        super.id = 102;
        super.descripcion = "Nuestra hamburguesa que te hundirá de sabor. $10000";
        super.tieneQueso = false;
        super.esVegetariana = true;
    }

    /**
     * Se pone el pan marino
     */
    @Override
    protected void ponerPan() {
        System.out.println("Poniendo pan marino");
    }

    /**
     * Se pone la mayonesa 
     */
    @Override
    protected void ponerMayonesa() {
        System.out.println("Poniendo mayonesa de las profundidades");
    }

    /**
     * Se pone la mostaza 
     */
    @Override
    protected void ponerMostaza() {
        System.out.println("Poniendo mostaza con sangre de Leviatan");
    }

    /**
     * Se prepara la carne 
     */
    @Override
    protected void prepararCarne() {
        System.out.println("Preparando carne de Leviatan, así es, tuvimos que cazar uno y se murio la mitad de nuestra plantilla");
    }

    /**
     * Se pone los vegetales 
     */
    @Override
    protected void ponerVegetales() {
        System.out.println("Poniendo a bob esponja de vegetal");
    }

    /**
     * Se pone la catsup 
     */
    @Override
    protected void ponerCatsup() {
        System.out.println("Poniendo catsup hecha con tortugas giganres");
    }
}
