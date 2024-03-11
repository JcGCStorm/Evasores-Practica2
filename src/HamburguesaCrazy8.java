/**
 * La clase Hamburguesa Crazy8 representa una hamburguesa tipo Crazy8
 * Extiende la clase abstracta Hamburguesa e implementa métodos específicos para su preparación 
 */
public class HamburguesaCrazy8 extends Hamburguesa {

    /**
    * Constructor para crear una nueva HamburguesaCrazy8
    * 
    */
   public HamburguesaCrazy8() {
       super.nombre = "Hamburguesa Crazy8";
       super.id = 203;
       super.descripcion = "Si lo que quieres es una experiencia 99.9% pura, esta hamburguesa es para ti. Con carne directamente traída de los pollos Hermanos y un ingrediente secreto. $400";
       super.tieneQueso = false;
   }

   /**
    * Se pone el pan 
    */
   @Override
   protected void ponerPan() {
       System.out.println("Poniendo pan con ajonjoli");
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
       System.out.println("Poniendo mostaza Pinkman");
   }

   /**
    * Se prepara la carne 
    */
   @Override
   protected void prepararCarne() {
       System.out.println("Preparando nuggets de pollo de los Pollos Hermanos, con polvo azul secreto");
   }

   /**
    * Se pone los vegetales
    */
   @Override
   protected void ponerVegetales() {
       System.out.println("Poniendo vegetales. Lechuga, jitomates y Ricino.");
   }

   /**
    * Se pone la catsup 
    */
   @Override
   protected void ponerCatsup() {
       System.out.println("Poniendo catsup, con un toque de chipótle");
   }
}
