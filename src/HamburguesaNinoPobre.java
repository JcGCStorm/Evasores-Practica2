/**
 * La clase Hamburguesa Niño Pobre representa una hamburguesa tipo niño Pobre
 * Extiende la clase abstracta Hamburguesa e implementa métodos específicos para supreparación 
 */
public class HamburguesaNinoPobre extends Hamburguesa {

    /**
    * Constructor para crear una nueva HamburguesaNinoPobre
    * 
    */
   public HamburguesaNinoPobre() {
       super.nombre = "Hamburguesa Niño Pobre";
       super.id = 202;
       super.descripcion = "Esta hamburguesa cuenta con la carne especial de la casa, creada de la combinación de todas las carnes de nuestro menú. $1000";
       super.tieneQueso = false;
   }

   /**
    * Se pone el pan 
    */
   @Override
   protected void ponerPan() {
       System.out.println("Poniendo pan integral");
   }

   /**
    * Se pone la mayonesa 
    */
   @Override
   protected void ponerMayonesa() {
       System.out.println("Poniendo mayonesa baja en grasas");
   }

   /**
    * Se pone la mostaza
    */
   @Override
   protected void ponerMostaza() {
       System.out.println("Poniendo un toque de mostaza");
   }

   /**
    * Se prepara la carne 
    */
   @Override
   protected void prepararCarne() {
       System.out.println("Preparando carne especial (combinación tapa arterias)");
   }

   /**
    * Se pone los vegetales
    */
   @Override
   protected void ponerVegetales() {
       System.out.println("Poniendo vegetales. Lechuga, jitomates, cebolla y ricino");
   }

   /**
    * Se pone la catsup 
    */
   @Override
   protected void ponerCatsup() {
       System.out.println("Poniendo catsup, con un toque de chipótle");
   }
}
