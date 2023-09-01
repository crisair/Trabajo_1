
package vehiculo;


public class Automovil extends Vehiculo {
   
     private int cantidadPuertas;
    

    public Automovil(int cantidadPuertas, String marca, int año, double precio, int capacidadEstanque, int nivelEstanque) {
        super(marca, año, precio, capacidadEstanque, nivelEstanque);
        this.cantidadPuertas = cantidadPuertas;
        if (cantidadPuertas %2 ==0){
             System.out.println(" la cantidad de puertas debe se par");
        }else{
             
        }
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
     if (getNivelEstanque() + litros >= getCapacidadEstanque()){
          
          System.out.println("No puede cargar mas gasolina ");
      }else {
          System.out.println("No puede cargar mas gasolina  ");
      }
     
     
    
     
     
 }

  @Override  
 public void VaciarEstanqueo(int litros){
     
     if (getNivelEstanque() <=15){
         System.out.println("El vehiculo no puede tener un nivel de estanque menor a 15");
     }   
     
     
      
      
      
      
     
     
      
      
      
      
 }
        
            
    
}
