import java.util.Scanner;

public class att2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;

        
        double divisao = 0;
        if (numero2 != 0) {
            divisao = numero1 / numero2;
        }

        
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + subtracao);
        System.out.println("Resultado da multiplicação: " + multiplicacao);

        if (numero2 != 0) {
            System.out.println("Resultado da divisão: " + divisao);
        } else {
            System.out.println("Divisão por zero não é permitida.");
        }

        scanner.close();
    }
}
