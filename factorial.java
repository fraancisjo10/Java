package ejercicios;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        long factorial = 1;

        System.out.print("Dame un numero entero no negativo: ");
        numero = teclado.nextInt();

        while (numero < 0) {
            System.out.print("Debe ser no negativo: ");
            numero = teclado.nextInt();
        }

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numero + " es " + factorial);

        teclado.close();
    }
}