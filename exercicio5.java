import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o operador (+, -, *, /, ^):");
        char operador = scanner.next().charAt(0);

        double resultado = 0;
        boolean erro = false;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    erro = true;
                }
                break;
            case '^':
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Erro: Operador inválido!");
                erro = true;
                break;
        }

        if (!erro) {
            System.out.println("O resultado da operação é: " + resultado);
        }
        scanner.close();
    }
}