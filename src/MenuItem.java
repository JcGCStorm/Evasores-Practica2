public class MenuItem {
   int id;
   String nombrePlatillo;
   String descripcion;
   double precio;  

   public MenuItem(int id, 
                   String nombrePlatillo, 
                   String descripcion,
                   double precio){
        this.id = id;
        this.nombrePlatillo = nombrePlatillo;
        this.descripcion = descripcion;
        this.precio = precio;
   }

   public int getID(){
    return id;
   }

   public String getNombre(){
    return nombrePlatillo;
   }

   public String getDescripcion(){
    return descripcion;
   }

   public double getPrecio(){
    return precio;
   }
}
