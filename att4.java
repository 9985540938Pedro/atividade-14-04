import java.util.Scanner;

public class att4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();

        
        double media = (nota1 + nota2 + nota3) / 3;

        
        System.out.println("\nAluno: " + nome);
        System.out.printf("Média: %.2f\n", media);

        scanner.close();
    }
}
