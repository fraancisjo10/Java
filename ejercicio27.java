
package ejercicios;
import java.util.Scanner;

public class ejercicio27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce primer numero: ");
        int num1 = sc.nextInt(); 
        System.out.print("Introduce segundo numero: ");
        int num2 = sc.nextInt();
        
        int menor = num1;
        int mayor = num2;
        
        if (num1 > num2) {
            menor = num2;
            mayor = num1;
        }
        System.out.print("Todos los numeros:");
        int i = menor;
        while (i <= mayor) {
            System.out.print(i + " ");
            i++;
        }
        
        System.out.print("Numeros pares:");
            i = menor;
            while (i <= mayor) {
                if (i % 2 == 0)
                { System.out.print(i + " ");
                }
                i++; 
            }
             
    }
}