import java.util.Random;

public class Testeo {

 public Testeo() {
 }
 
 public void ejecutar() {
//Probar números no enteros
String [] testeoConString={"jajajajjaj","hola","que tal","holaaa"};
for (int i = 0; i <10; i++) {
 Double valor=Math.random()*10000 + 1;
 System.out.println("\nProbando con :"+valor);
  NumeroSeparar testeo1= new NumeroSeparar(valor);
 }

for(int i = 0; i < 4; i++) {
 System.out.println("\nProbando con :"+testeoConString[i]);

  NumeroSeparar testeo2= new NumeroSeparar(testeoConString[i]);

 }}}
