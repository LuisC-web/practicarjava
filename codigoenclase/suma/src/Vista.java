import java.util.Scanner;

public class Vista {
         Scanner teclado = new Scanner(System.in);


    public void digitarNumero() {
        System.out.print("Digite  Numero ");
    }

    public void mostrarSalida(int n1, int n2, int s) {
        System.out.printf("%d + %d = %d", n1, n2, s);
    }

    public void mostrarMenu() {
System.out.println("\n\tMenu\n1)Sumar dos numeros\n2)Salir\nDigite opción: ");

    }
}