import java.util.Scanner;

public class att10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        String opcao; 

        
           
            System.out.println("Menu de opções:");
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Opção 3");
            System.out.println("S - Sair");

            
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine().toUpperCase(); 

            
            switch (opcao) {
                case "1":
                    System.out.println("Você escolheu a opção 1");
                    break;
                case "2":
                    System.out.println("Você escolheu a opção 2");
                    break;
                case "3":
                    System.out.println("Você escolheu a opção 3");
                    break;
                case "S":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
         while (!opcao.equals("S")); 

        scanner.close(); 
    }
}
