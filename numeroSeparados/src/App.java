
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //Ejemplo
     System.out.println("Ejemplo sin parametro ");
     NumeroSeparar ejemplo1= new NumeroSeparar();
     ejemplo1.separarNumero();
     System.out.println("Ejemplo con 42339");
     NumeroSeparar ejemplo2= new NumeroSeparar(42339);  
     ejemplo2.separarNumero();
     //Testeo
    Scanner lector = new Scanner (System.in);
        String testeo="";

    Boolean bandera=true;
do {
 if(bandera){
  System.out.println("¿Quiere ejecutar el testeo(y/n)");
  testeo=lector.next();
  bandera=false;
 }else{
    System.out.println("La opción no es correcta. Presione y para si o n para no ");

  testeo=lector.next();
 }
} while (!testeo.equals("y")&&!testeo.equals("n"));

if(testeo.equals("y")){
 Testeo testear=new Testeo();
 testear.ejecutar();
}else {
System.out.println("El programma ha terminado");

}

    }
}
