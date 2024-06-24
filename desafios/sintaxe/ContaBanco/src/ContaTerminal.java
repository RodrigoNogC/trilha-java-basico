import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita e recebe o número da conta
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine();

        //Solicita e recebe a agência
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        //Solicita e recebe o nome do cliente
        System.out.println("Por favor, digite o nome do CLiente!");
        String nomeCliente = scanner.nextLine();

        //Solicita e recebe o saldo
        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = scanner.nextDouble();

        //Exibe a mensagem final
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);

        scanner.close();

    }
}