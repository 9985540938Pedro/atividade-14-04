import java.util.Scanner;

public class att6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário fixo: R$ ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o total de vendas no mês: R$ ");
        double totalVendas = scanner.nextDouble();

        
        double comissao = totalVendas * 0.15;

        
        double salarioFinal = salarioFixo + comissao;

        
        System.out.println("\nVendedor: " + nome);
        System.out.printf("Salário fixo: R$ %.2f\n", salarioFixo);
        System.out.printf("Salário final (com comissão): R$ %.2f\n", salarioFinal);

        scanner.close();
    }
}
