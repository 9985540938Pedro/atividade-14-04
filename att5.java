import java.util.Scanner;

public class att5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        
        System.out.println("\nAntes da troca: A = " + A + ", B = " + B);

        
        int temp = A;
        A = B;
        B = temp;

        
        System.out.println("Depois da troca: A = " + A + ", B = " + B);

        scanner.close();
    }
}
