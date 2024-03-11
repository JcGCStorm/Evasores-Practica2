/**
 * La clase Hamburguesa Vita Carnis representa una hamburguesa Vita Carnis
 * Extiende la clase abstracta Hamburguesa e implementa métodos específicos para supreparación 
 */
public class HamburguesaVitaCarnis extends Hamburguesa {

    /**
    * Constructor para crear una nueva HamburguesaVitaCarnis
    * 
    */
   public HamburguesaVitaCarnis() {
       super.nombre = "Hamburguesa Vita Carnis";
       super.id = 201;
       super.descripcion = "¿Crees haberlo probado todo? ¿Eres fan de las películas de Zombies o te interesa Milwaukee? Entonces, ¡Esta hamburguesa es para tí! $300";
       super.tieneQueso = false;
   }

   /**
    * Se pone el pan 
    */
   @Override
   protected void ponerPan() {
       System.out.println("Poniendo pan cocechado de una planta extraña");
   }

   /**
    * Se pone la mayonesa 
    */
   @Override
   protected void ponerMayonesa() {
       System.out.println("Poniendo mayonesa cortesia de Happy Meat Farms");
   }

   /**
    * Se pone la mostaza
    */
   @Override
   protected void ponerMostaza() {
       System.out.println("Poniendo mostaza extraida de un Harvester");
   }

   /**
    * Se prepara la carne 
    */
   @Override
   protected void prepararCarne() {
       System.out.println("Obteniendo y preparando carne humana, puede demorar un poco");
   }

   /**
    * Se pone los vegetales
    */
   @Override
   protected void ponerVegetales() {
       System.out.println("Poniendo vegetales. Lechuga, jitomates, Crawler y caparazón de Trimming");
   }

   /**
    * Se pone la catsup 
    */
   @Override
   protected void ponerCatsup() {
       System.out.println("Poniendo catsup de Meat Snake");
   }
}
