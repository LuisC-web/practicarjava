import java.util.Scanner;

public class Controlador {

    Suma modelo;
    Vista vista;

    public Controlador(Suma modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {

        // defino objetos
        Scanner teclado = new Scanner(System.in);
        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Suma suma = new Suma();
        Vista vista = new Vista();
        // inicializo los objetos
        vista.digitarNumero();
        n1.setNumero(teclado.nextInt());
        vista.digitarNumero();
        n2.setNumero(teclado.nextInt());
        suma.setN1(n1.getNumero());

        suma.setN2(n2.getNumero());
        vista.mostrarSalida(n1.getNumero(), n2.getNumero(), suma.sumar());
    }
}