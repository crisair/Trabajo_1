
package vehiculo;




public class Main {

  

 
    public static void main(String[] args) throws Exception {
        
        Motocicleta moto1 = new Motocicleta("maria",2019,4000000,50,1,3);
        Automovil carro1 = new Automovil("maria",2018,78000000,100,80,3);
        
       
        carro1.VaciarEstanqueo(3);
        moto1.ImprimirDatos();
        moto1.VaciarEstanqueo(1);
}
    
}
