/**
 * La clase HamburguesaFIlos representa una hamburguesa con estilo de la fac de filosofia y letras
 * Extiende la clase abstracta Hamburguesa e implementa métodos específicos para supreparación 
 */
public class HamburguesaFilos extends Hamburguesa {

     /**
     * Constructor para crear una nueva HamburguesaFilos
     * 
     */
    public HamburguesaFilos() {
        super.nombre = "Hamburguesa Estilo Filos";
        super.id = 002;
        super.descripcion = "Nuestra hamburguesa más mágica, con toques de conciencia de clase. $109";
        super.tieneQueso = false;
        super.esVegetariana = true;
    }

    /**
     * Se pone el pan estilo Filos
     */
    @Override
    protected void ponerPan() {
        System.out.println("Poniendo pan estilo Filos, solo de un gramo porque se hizo comunista");
    }

    /**
     * Se pone la mayonesa estilo Filos
     */
    @Override
    protected void ponerMayonesa() {
        System.out.println("Poniendo mayonesa estilo Filos, si le pones atención te hablará de Nietzsche");
    }

    /**
     * Se pone la mostaza estilo Filos
     */
    @Override
    protected void ponerMostaza() {
        System.out.println("Poniendo mostaza estilo Filos... ");
    }

    /**
     * Se prepara la carne estilo Filos
     */
    @Override
    protected void prepararCarne() {
        System.out.println("Preparando carne estilo FIlos, con un toque de una hierba muy especial que te hará volar (oregano obviamente)");
    }

    /**
     * Se pone los vegetales estilo Filos
     */
    @Override
    protected void ponerVegetales() {
        System.out.println("Poniendo vegetales estilo Filos, encontrados tirados afuera de Islas");
    }

    /**
     * Se pone la catsup estilo Filos
     */
    @Override
    protected void ponerCatsup() {
        System.out.println("Poniendo catsup estilo Filos, probablemente chaira");
    }
}
