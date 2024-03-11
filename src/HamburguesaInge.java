/**
 * La clase HamburguesaInge representa una hamburguesa con estilo de la fac de ingenieria
 * Extiende la clase abstracta Hamburguesa e implementa métodos específicos para supreparación 
 */
public class HamburguesaInge extends Hamburguesa {

 /**
     * Constructor para crear una nueva HamburguesaInges
     * 
     */
    public HamburguesaInge() {
        super.nombre = "Hamburguesa Estilo Fac de Inge";
        super.id = 303;
        super.descripcion = "Desde la facultad de Ingenieria llega nuestra hamburguesa más funada y que no puede demostrar si es hamburguesa. $90";
        super.tieneQueso = false;
    }

    /**
     * Se pone el pan estilo FI
     */
    @Override
    protected void ponerPan() {
        System.out.println("Poniendo pan estilo Inge... problamente quemado en un tendedero");
    }

    /**
     * Se pone la mayonesa estilo FI
     */
    @Override
    protected void ponerMayonesa() {
        System.out.println("Poniendo mayonesa estilo Inge... mal hecha con puro formulazo");
    }

    /**
     * Se pone la mostaza estilo FI
     */
    @Override
    protected void ponerMostaza() {
        System.out.println("Poniendo mostaza estilo Inge... cuando te la comes se la pasa diciendo que es ingeniero y no licenciado");
    }

    /**
     * Se prepara la carne estilo FI
     */
    @Override
    protected void prepararCarne() {
        System.out.println("Preparando carne estilo Inge, yo que tu no me la comia");
    }

    /**
     * Se pone los vegetales estilo FI
     */
    @Override
    protected void ponerVegetales() {
        System.out.println("Poniendo vegetales estilo Inge...encontrados tirados en el anexo");
    }

    /**
     * Se pone la catsup estilo FI
     */
    @Override
    protected void ponerCatsup() {
        System.out.println("Poniendo catsup estilo Inge... ");
    }
}
