package ejercicios;
import java.util.Scanner;

public class primerayultimaparicionnum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int posicion = 0;
        int primera = 0;
        int ultima = 0;
        String lista = "";

        System.out.print("Dame un numero (0 para terminar): ");
        numero = teclado.nextInt();

        while (numero != 0) {
            posicion++;

            lista = lista + numero + " ";

            if (numero == 12) {
                if (primera == 0) {
                    primera = posicion;
                }
                ultima = posicion;
            }

            System.out.print("Dame un numero (0 para terminar): ");
            numero = teclado.nextInt();
        }

        System.out.println("Primera aparicion en posicion " + primera);
        System.out.println("Ultima aparicion en posicion " + ultima);
        System.out.println("Lista introducida: " + lista);

        teclado.close();
    }
}