import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de n para a sequência de Fibonacci: ");
        int n = scanner.nextInt();
        
        int[] fibonacci = new int[n];
        
        if (n >= 1) {
            fibonacci[0] = 0;
        }
        
        if (n >= 2) {
            fibonacci[1] = 1;
        }
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        scanner.close();
    }
}
