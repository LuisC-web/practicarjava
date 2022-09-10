public class EjemploJoin {
 public static void main(String[] args) throws Exception {
//Arreglo
String [] arreglo= {"a", "b", "c", "d", "e", "f"};
//Delimitador
String delimitador="-";
//String para unir los elementos del array

String arregloUnido=String.join(delimitador, arreglo);
System.out.println("Ejemplo join "+arregloUnido);

}


    
}
