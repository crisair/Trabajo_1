
package vehiculo;


public class Motocicleta extends Vehiculo {
    
    private int cilindrada ; 

    public Motocicleta() {
    }
    

    public Motocicleta( String marca, int año, double precio, int capacidadEstanque, int nivelEstanque,int cilindrada) {
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
     
     
     
   
    
}
