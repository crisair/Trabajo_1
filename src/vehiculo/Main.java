
package vehiculo;




public class Main {

  

 
    public static void main(String[] args) throws Exception {
        
        Motocicleta moto1 = new Motocicleta("maria",2019,4000000,50,1,3);
        Automovil carro1 = new Automovil("maria",2018,78000000,100,80,2);
        
       
        moto1.ImprimirDatos();
        moto1.CargarEstanque(12);
        moto1.VaciarEstanqueo(1);
        System.out.println("*****************");
        carro1.ImprimirDatos();
        carro1.VaciarEstanqueo(3);
        carro1.CargarEstanque(34);
        carro1.calcularImpuesto();
}
    
}
