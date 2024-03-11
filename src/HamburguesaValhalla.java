/**
 * La clase HamburguesaValhalla representa una hamburguesa que te llevara al Vallhalla
 * Extiende la clase abstracta Hamburguesa e implementa métodos específicos para supreparación 
 */
public class HamburguesaValhalla extends Hamburguesa {

     /**
     * Constructor para crear una nueva HamburguesaValhalla
     * 
     */
    public HamburguesaValhalla() {
        super.nombre = "Hamburguesa Valhalla";
        super.id = 103;
        super.descripcion = "Esta hamburguesa te llevará al Valhalla. Spoiler: morirás al terminarla. $100000";
        super.tieneQueso = false;
    }

    /**
     * Se pone el pan
     */
    @Override
    protected void ponerPan() {
        System.out.println("Poniendo pan fjellrike");
    }

    /**
     * Se pone la mayonesa
     */
    @Override
    protected void ponerMayonesa() {
        System.out.println("Poniendo mayonesa nordisk");
    }

    /**
     * Se pone la mostaza
     */
    @Override
    protected void ponerMostaza() {
        System.out.println("Poniendo mostaza kriger ");
    }

    /**
     * Se prepara la carne 
     */
    @Override
    protected void prepararCarne() {
        System.out.println("Preparando carne de dioses nórdicos, tuvimos que invocar el conjuro: Vi kan tydeligvis ikke norsk, vi bruker en oversetter.");
    }

    /**
     * Se pone los vegetales estilo Filos
     */
    @Override
    protected void ponerVegetales() {
        System.out.println("Poniendo vegetales Odin");
    }

    /**
     * Se pone la catsup estilo Filos
     */
    @Override
    protected void ponerCatsup() {
        System.out.println("Poniendo catsup Asgard");
    }
}
