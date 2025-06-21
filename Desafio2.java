import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo N: ");
        int N = scanner.nextInt();
        int soma = 0;
        for (int i = 1; i <= N; i++) {
            soma += i;
        }
        System.out.println("A soma de 1 até " + N + " é " + soma);
        scanner.close();
    }
}