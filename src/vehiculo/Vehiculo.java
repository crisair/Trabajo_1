package vehiculo;


public class Vehiculo {
    
    private String marca;
    private int  año ;
    private  double precio;
    private  int capacidadEstanque;
    private  int nivelEstanque;

    public Vehiculo() {
    }
    

    public Vehiculo(String marca, int año, double precio, int capacidadEstanque, int nivelEstanque) {
        this.marca = marca;
        this.año = año;
        this.precio = precio;
        this.capacidadEstanque = capacidadEstanque;
        this.nivelEstanque = nivelEstanque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public int getNivelEstanque() {
        return nivelEstanque;
    }

    public void setNivelEstanque(int nivelEstanque) {
        this.nivelEstanque = nivelEstanque;
    }
    
    
    
    public void  ImprimirDatos(){
        System.out.println("la marca del auto es :"+ this.marca);
        System.out.println("El año es :"+ this.año);
        System.out.println("El precio del auto es :"+ this.precio);
        System.out.println("La capacidad del auto es  :"+ this.capacidadEstanque);
        System.out.println("El nivel del estanque :"+ this.nivelEstanque);
        
    }
    
    public void CargarEstanque(int litros){
        
        if (this.nivelEstanque < this.capacidadEstanque )
        
         this.nivelEstanque = this.nivelEstanque + litros;
         System.out.println("El nivel del estanque es :"+ this.nivelEstanque);        
                     
    }
    
    public void VaciarEstanqueo (int litros){
        
        if(litros < 0){
            
            this.nivelEstanque = this.nivelEstanque -litros;
            
        }else{
            
             System.out.println("El nivel del estanque es insuficiente cargar mas gasolina ");
        }
            
    }
    
    public void calcularImpuesto(){
        double impuestos ;
        
    impuestos  = this.precio * 0.015 ;
    
    System.out.println("Su impuesto es $"+ impuestos);
        
    } 
    
    
    
    
    
    
	
    
    
}

