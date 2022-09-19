import java.util.Scanner;

public class Menu {
 


public void ejecutarMenu(){
 Scanner teclado = new Scanner(System.in);
 String continuar="";
 Suma modelo=new Suma();
Vista vista = new Vista();
 Controlador sumar=new Controlador(modelo,vista);
sumar.iniciar();
 while (!continuar.equals("n")) {

  if (!continuar.equals("y")){

     System.out.println("\nSolo se puede elegir y o n");

  }
  System.out.println("\n¿Quieres seguir sumando?");
  continuar = teclado.next();
  if (continuar.equals("y")) {
   sumar.iniciar();
   
  }
 }

 


}


}
