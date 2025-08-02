import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o seu saldo: ");
        float saldo = scanner.nextFloat();

        System.out.println("NOME: " + nome + "\nCONTA: " + conta + "\nAGÊNCIA: " + agencia + "\nSALDO: R$" + saldo);

        scanner.close();
    }
}
