/**
 * La clase HamburguesaDemonio representa una hamburguesa hecha de demonio
 * Extiende la clase abstracta Hamburguesa e implementa métodos específicos para supreparación 
 */
public class HamburguesaDemonio extends Hamburguesa {

     /**
     * Constructor para crear una nueva HamburguesaDEmonio
     * 
     */
    public HamburguesaDemonio() {
        super.nombre = "Hamburguesa Demonio";
        super.id = 101;
        super.descripcion = "Nuestra hamburguesa hecha de demonio. No nos hacemos de escuchar susurros y un posterior exorcismo. $500";
        super.tieneQueso = false;
    }

    /**
     * Se pone el pan demoniaco
     */
    @Override
    protected void ponerPan() {
        System.out.println("Poniendo pan demoniaco");
    }

    /**
     * Se pone la mayonesa demoniaca
     */
    @Override
    protected void ponerMayonesa() {
        System.out.println("Poniendo mayonesa con sangre de demonio");
    }

    /**
     * Se pone la mostaza demoniaca
     */
    @Override
    protected void ponerMostaza() {
        System.out.println("Poniendo mostaza demoniaca (normal, la mostaza por si sola es demoniaca)");
    }

    /**
     * Se prepara la carne demoniaca
     */
    @Override
    protected void prepararCarne() {
        System.out.println("Preparando carne demoniaca con 1000 años de preparación");
    }

    /**
     * Se pone los vegetales demoniacos
     */
    @Override
    protected void ponerVegetales() {
        System.out.println("Poniendo vegetales demoniacos");
    }

    /**
     * Se pone la catsup demoniaca
     */
    @Override
    protected void ponerCatsup() {
        System.out.println("Poniendo catsup negra demoniaca");
    }
}
