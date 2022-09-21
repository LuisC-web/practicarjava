import java.util.Scanner;

public class Controlador {

    Suma modelo;
    Vista vista;
            Scanner teclado = new Scanner(System.in);


   

    public void iniciarSuma() {

     // defino objetos
     Vista vista = new Vista();
String menu="";
        
        
        // inicializo los objetos
        do {
         if(menu.equals("1")){
          sumarNumeros();
         }else if (!menu.equals("")) {
          System.out.println("Las opciones son 1 o 2, por favor selecione una correcta");
         }      
         vista.mostrarMenu();
         menu=teclado.next();

        } while (!menu.equals("2"));
         

        System.out.println("Exitos");        

    }
    private void sumarNumeros() {
     Vista vista = new Vista();
        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Suma suma = new Suma();
        vista.digitarNumero();
        n1.setNumero(teclado.nextInt());
        vista.digitarNumero();
        n2.setNumero(teclado.nextInt());
        suma.setN1(n1.getNumero());

        suma.setN2(n2.getNumero());
        vista.mostrarSalida(n1.getNumero(), n2.getNumero(), suma.sumar());

    }

}