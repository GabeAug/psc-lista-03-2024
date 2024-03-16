import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota50, nota20, nota10, nota5, nota2, nota1;
        System.out.print("Digite o valor da compra: ");
        int valorCompra = scanner.nextInt();
        System.out.print("Digite o valor pago: ");
        int valorPago = scanner.nextInt();
        int troco = (valorPago - valorCompra);

        if (valorCompra > valorPago) {
            System.out.println("Quantidade paga é isuficiente para realizar a compra.");
        } else {
            System.out.println("Valor do troco é: " + "$" + troco);
            System.out.print("Notas de $50: ");
            nota50 = troco / 50;
            troco = troco % 50;
            System.out.println(nota50);
            System.out.print("Notas de $20: ");
            nota20 = troco / 20;
            troco = troco % 20;
            System.out.println(nota20);
            System.out.print("Notas de $10: ");
            nota10 = troco / 10;
            troco = troco % 10;
            System.out.println(nota10);
            System.out.print("Notas de $5: ");
            nota5 = troco / 5;
            troco = troco % 5;
            System.out.println(nota5);
            System.out.print("Notas de $2: ");
            nota2 = troco / 2;
            troco = troco % 2;
            System.out.println(nota2);
            System.out.print("Notas de $1: ");
            nota1 = troco / 1;
            troco = troco % 1;
            System.out.println(nota1);
        }

        scanner.close();
    }
}