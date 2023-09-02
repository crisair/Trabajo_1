
package vehiculo;


public class Automovil extends Vehiculo {
   
     private int cantidadPuertas;
    

    public Automovil( String marca, int año, double precio, int capacidadEstanque, int nivelEstanque,int cantidadPuertas) throws Exception {
        super(marca, año, precio, capacidadEstanque, nivelEstanque);
        this.cantidadPuertas = cantidadPuertas;
        if (cantidadPuertas %2 ==0){
             System.out.println("El numero es par ");
        }else{
            throw new Exception("la cantidad de puertas debe se par");
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
     
      if (getNivelEstanque()>15){
         System.out.println("vaciando estanque ");
     } else {
         
         try {
             throw new Exception("El vehiculo no puede tener un nivel de estanque menor a 15");
         } catch (Exception ex) {
             ;
         }
     }   
     
     
 }
 
  public void calcularImpuesto(){
     
  if (getAño() < 2010){
      
      System.out.println(" usted no paga impuestos");
  } else {
      
      super.calcularImpuesto();
  }
  
 } 
  
     
public void ModificarAño(int nuevoAño) {
    
        setAño(nuevoAño);
       
}
      
     
    
            
}
