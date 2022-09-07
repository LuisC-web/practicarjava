import java.util.Scanner;
public class NumerosSeparar {
 private Integer numero;
Scanner lectura = new Scanner (System.in);
 public NumerosSeparar() {
  System.out.println("Debe tener algún número\n Digite un número: ");
this.numero= lectura.nextInt();

 }

 public NumerosSeparar(Integer numero) {
  this.numero = numero;
 }

 public Integer getNumero() {
  return numero;
 }

 public void setNumero(Integer numero) {
  this.numero = numero;
 }
public void separaNumero(){
 String[] numeroSeparado= Integer.toString(numero).split("");
String numeroSeparado1 = "";
System.out.println(numeroSeparado);

for (String numero : numeroSeparado) {
 numeroSeparado1+=numero+" ";
}
System.out.println(numeroSeparado1);

}



}
