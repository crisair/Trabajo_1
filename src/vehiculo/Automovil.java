
package vehiculo;


public class Automovil extends Vehiculo {
   
     private int cantidadPuertas;
    

    public Automovil(int cantidadPuertas, String marca, int año, double precio, int capacidadEstanque, int nivelEstanque) {
        super(marca, año, precio, capacidadEstanque, nivelEstanque);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    public Automovil(){
        
    }
    
    public int getCantidadPuertas(){
        return cantidadPuertas ;
    }
    
    public void setCantidadPuertas (int cantidadPuertas){
        this.cantidadPuertas = cantidadPuertas;
    }
    
     @Override
 public void CargarEstanque(int litros){
     if (litros < 0) {
         System.out.println("El nivel del estanque es insuficiente cargar mas gasolina ");
     }
      if (getNivelEstanque() + litros > getCapacidadEstanque()){
          
          System.out.println("No puede cargar mas gasolina ");
      }
     
     super.CargarEstanque(litros);  
 }
        
            
    
}
