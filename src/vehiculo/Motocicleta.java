
package vehiculo;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Motocicleta extends Vehiculo {
    
    private int cilindrada ; 

    public Motocicleta() {
    }
    

    public Motocicleta( String marca, int año, double precio, int capacidadEstanque, int nivelEstanque,int cilindrada) throws Exception {
        super(marca, año, precio, capacidadEstanque, nivelEstanque);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    
    
     public void ImprimirDatos(){
         super.ImprimirDatos();
         
         System.out.println("la cilindrada de su auto es  :"+ this.cilindrada);
     }
     
     public void VaciarEstanqueo(int litros){
     
     if (getNivelEstanque()>5){
         System.out.println("vaciando estanque ");
     } else {
         
         try {
             throw new Exception("El vehiculo no puede tener un nivel de estanque menor a 5");
         } catch (Exception ex) {
             Logger.getLogger(Motocicleta.class.getName()).log(Level.SEVERE, null, ex);
         }
     }  
     
     
     }
     
     
   
    
}
