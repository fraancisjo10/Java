package ejercicios;

import java.util.Scanner;

public class ejerciciofaltaclase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;
        int mayor, menor;
        int suma = 0;
        int pares = 0;

        System.out.print("Introduce el primer numero: ");
        num1 = teclado.nextInt();

        System.out.print("Introduce el segundo numero: ");
        num2 = teclado.nextInt();

        // Encontrar el mayor y el menor usando IF
        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }

        // Sumar todos los numeros desde el menor hasta el mayor
        // y contar los numeros pares
        for (int i = menor; i <= mayor; i++) {
            suma = suma + i;

            if (i % 2 == 0) {
                pares++;
            }
        }

        System.out.println("El menor es: " + menor);
        System.out.println("El mayor es: " + mayor);
        System.out.println("La suma desde " + menor + " hasta " + mayor
                + " es: " + suma);
        System.out.println("Cantidad de numeros pares: " + pares);

     
    }
}
