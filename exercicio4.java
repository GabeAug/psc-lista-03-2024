import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual tipo de operação deseja fazer: \n1- Para calcular perimertro do circulo \n2- Para calcular área do circulo \n3- Para calcular volume da esfera ");
        int operacao = scanner.nextInt();
        if (operacao == 1) {
            System.out.println("Digite o raio do círculo: ");
        } else if (operacao == 2) {
            System.out.println("Digite o raio do círculo: ");
        } else {
            System.out.println("Digite o raio do esfera: ");
        }
        double raio = scanner.nextDouble();

        double pi = 3.141592;

        if (operacao == 1) {
            double perimetro = 2 * pi * raio;
            System.out.println("Perímetro do círculo: " + perimetro);
        } else if (operacao == 2) {
            double area = pi * raio * raio;
            System.out.println("Área do círculo: " + area);
        } else if (operacao == 3) {
            double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
            System.out.println("Volume da esfera: " + volume);
        } else {
            System.out.println("Código da operação inválido.");
        }
        scanner.close();
    }
}