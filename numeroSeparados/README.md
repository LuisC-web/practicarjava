# Ejercicio 2.30

## Separación de los dígitos en un entero

Escriba una aplicación que reciba del usuario un número compuesto por cinco dígitos, que separe este número en sus dígitos individuales y los imprima, cada uno separado de los demás por tres espacios.

# Solución del ejercicio

1. Analisis del problema
   El problema tiene los datos de entrada, el proceso y su dato de salida respectivamente

- Datos de entrada

  - Numero entero. Se pide un número entero de 5 digitos pero se trabajará con números de diferentes digitos sea mayor o menor que 5. Además que el signo menos de los números enteros negativos se tomará como un dígito

- Dato de salida
  \*El número seperado por tres espacios ejemplo el número de entrada sería "42339" la salida sería "4   2   3   3   3   9"

- Proceso

  1. En este caso se usan los siguientes metodos:

  - split(). Este método convierte un string en un array. Recibe dos parametros
    los cuales son un expresión regular que se toma como base para separar el string y un limite sobre el tamaño que se quiera aplicar. Por ejemplo:
    ![alt no se encontró la imagen](./src/assets/split.jpeg)
  - join() Este método convierte un array en un String. Recibe un delimitador y el array o una serie de cadena que se va a unir. Por ejemplo:
    ![alt no se encontró la imagen](./src/assets/join.jpeg)
