/**
 * La clase HamburguesaCiencias representa una hamburguesa con estilo de la fac de ciencias
 * Extiende la clase abstracta Hamburguesa e implementa métodos específicos para supreparación 
 */
public class HamburguesaCiencias extends Hamburguesa {

    /**
     * Constructor para crear una nueva HamburguesaCiencias 
     * 
     */
    public HamburguesaCiencias() {
        super.nombre = "Hamburguesa Estilo Ciencias";
        super.id = 001;
        super.descripcion = "Una de nuestras hamburguesas más vendidas, barata y con mucha proteína. $150";
        super.tieneQueso = false;
        super.esVegetariana = false;
    }

    /**
     * Se pone el pan estilo Ciencias
     */
    @Override
    protected void ponerPan() {
        System.out.println("Poniendo pan estilo Ciencias con un corte muuuy irregular");
    }

    /**
     * Se pone la mayonesa estilo Ciencias
     */
    @Override
    protected void ponerMayonesa() {
        System.out.println("Poniendo mayonesa estilo Ciencias (previamente demostrado por inducción que si es mayonesa)");
    }

    /**
     * Se pone la mostaza estilo Ciencias
     */
    @Override
    protected void ponerMostaza() {
        System.out.println("Poniendo mostaza estilo Ciencias, robada a la tia Aly)");
    }

    /**
     * Se prepara la carne estilo Ciencias
     */
    @Override
    protected void prepararCarne() {
        System.out.println("Preparando carne estilo Ciencias, probablemente tenga proteína de dudoso origen");
    }

    /**
     * Se pone los vegetales estilo Ciencias
     */
    @Override
    protected void ponerVegetales() {
        System.out.println("Poniendo vegetales estilo Ciencias, encontrados tirados en el Pulpo");
    }

    /**
     * Se pone la catsup estilo Ciencias
     */
    @Override
    protected void ponerCatsup() {
        System.out.println("Poniendo catsup estilo Ciencias... ");
    }
}
