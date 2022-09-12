public class App {
    public static void main(String[] args) {
        Vista vista;
        Suma modelo;
        Controlador controlador;

        vista = new Vista();
        modelo = new Suma();
        controlador = new Controlador(modelo, vista);
        controlador.iniciar();

    }

}
