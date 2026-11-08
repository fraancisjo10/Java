
package ejercicios;

import java.util.Scanner;


public class ejercicio7 {

    
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        double largo, ancho, area, perimetro;

        System.out.println("Introduce el largo del rectangulo: ");
        largo = teclado.nextDouble();

        System.out.println("Introduce el ancho del rectangulo: ");
        ancho = teclado.nextDouble();

        area = largo * ancho;
        perimetro = 2 * (largo + ancho);
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);       
    }
    
}
