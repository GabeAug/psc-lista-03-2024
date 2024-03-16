import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3, maior, menor, media;

        System.out.println("Escreva 3 valores: ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();

        maior = Math.max(n1, Math.max(n2, n3));
        menor = Math.min(n1, Math.min(n2, n3));
        media = (n1 + n2 + n3) / 3;

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média dos números é: " + media);

        scanner.close();

    }
}