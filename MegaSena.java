import java.util.Arrays;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int contador = 0;
        
        System.out.println("Digite 6 números da mega-sena (de 1 a 60):");
        
        while (contador < 6) {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();
            
            if (numero < 1 || numero > 60) {
                System.out.println("Número inválido! Digite um número entre 1 e 60.");
                continue;
            }
            
            boolean repetido = false;
            for (int i = 0; i < contador; i++) {
                if (numeros[i] == numero) {
                    repetido = true;
                    break;
                }
            }
            
            if (repetido) {
                System.out.println("Número já foi digitado! Digite outro número.");
                continue;
            }
            
            numeros[contador] = numero;
            contador++;
        }
        
        Arrays.sort(numeros);
        
        System.out.println("Números ordenados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
        scanner.close();
    }
}
