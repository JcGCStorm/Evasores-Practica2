/**
 * La clase Hamburguesa Vita Carnis representa una hamburguesa Vita Carnis
 * Extiende la clase abstracta Hamburguesa e implementa métodos específicos para supreparación 
 */
public class HamburguesaVitaCarnis extends Hamburguesa {

    /**
    * Constructor para crear una nueva HamburguesaFilos
    * 
    */
   public HamburguesaVitaCarnis() {
       super.nombre = "Hamburguesa Vita Carnis";
       super.id = 201;
       super.descripcion = "¿Crees haberlo probado todo? ¿Eres fan de las películas de Zombies o te interesa Milwaukee? Entonces, ¡Esta hamburguesa es para tí! $300";
       super.tieneQueso = false;
       super.esVegetariana = true;
   }

   /**
    * Se pone el pan 
    */
   @Override
   protected void ponerPan() {
       System.out.println("Poniendo pan");
   }

   /**
    * Se pone la mayonesa 
    */
   @Override
   protected void ponerMayonesa() {
       System.out.println("Poniendo mayonesa");
   }

   /**
    * Se pone la mostaza
    */
   @Override
   protected void ponerMostaza() {
       System.out.println("Poniendo mostaza");
   }

   /**
    * Se prepara la carne 
    */
   @Override
   protected void prepararCarne() {
       System.out.println("Preparando carne humana");
   }

   /**
    * Se pone los vegetales
    */
   @Override
   protected void ponerVegetales() {
       System.out.println("Poniendo vegetales. Lechuga y jitomates.");
   }

   /**
    * Se pone la catsup 
    */
   @Override
   protected void ponerCatsup() {
       System.out.println("Poniendo catsup");
   }
}
