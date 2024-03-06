public class MenuItem {
   int id;
   String nombrePlatillo;
   String descripcion;
   double precio;    
   Boolean conQueso;
   Boolean esVegetariano;

   public MenuItem(int id, 
                   String nombrePlatillo, 
                   String descripcion,
                   double precio, 
                   Boolean conQueso, 
                   Boolean esVegetariano){
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

   public boolean conQueso(){
    return conQueso;
   }

   public boolean esVegetariano(){
    return esVegetariano();
   }


}
