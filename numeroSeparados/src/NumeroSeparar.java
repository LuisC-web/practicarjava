import java.util.Scanner;
public class NumeroSeparar {
 private Integer numero;
private Scanner lectura = new Scanner (System.in);
 public NumeroSeparar() {

   try {
     System.out.println("Debe tener algún número\n Digite un número: ");
   this.numero= lectura.nextInt();
   System.out.println("¡Valor guardodado con éxito!😌");

   } catch (Exception e) {
    // TODO: handle exception
    
    System.out.println("No se puede con otro valor que no sea entero");
   }
   


  }

 public NumeroSeparar(Integer numero) {
   this.numero = numero;
   
   // TODO: handle exception
       System.out.println("No se puede con otro valor que no sea entero");

 }
 public NumeroSeparar(String numero) {
 
   // TODO: handle exception
       System.out.println("No se puede con otro valor que no sea entero");

 }

 public NumeroSeparar(Float numero) {
 
   // TODO: handle exception
       System.out.println("No se puede con otro valor que no sea entero");

 }
  public NumeroSeparar(Double numero) {
 
   // TODO: handle exception
       System.out.println("No se puede con otro valor que no sea entero");

 }
 public Integer getNumero() {
  return numero;
 }

 public void setNumero(Integer numero) {
  this.numero = numero;
 }
public void separarNumero(){
 try {
  String[] numeroSeparado= Integer.toString(numero).split("");
String numeroSeparado1 = String.join("   ",numeroSeparado);



System.out.println("¡Operación realizada con éxito! 🥳. El resultado es: "+numeroSeparado1);

  
 } catch (Exception e) {
  // TODO: handle exception
  System.out.println("No se puede hacer con no enteros. ¡NO INSISTA! 🤬");
 }
 


}
}
