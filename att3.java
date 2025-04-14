import java.util.Scanner;

public class att3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        
        System.out.print("Digite um número real: ");
        double numeroReal = scanner.nextDouble();

        
        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        
        System.out.print("Digite 'true' ou 'false': ");
        boolean valorBooleano = scanner.nextBoolean();

        
        System.out.println("\nValores atribuídos:");
        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número real: " + numeroReal);
        System.out.println("Caractere: " + caractere);
        System.out.println("Booleano: " + valorBooleano);

        scanner.close();
    }
}
