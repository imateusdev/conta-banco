import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do Cliente:");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        double saldo = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Por favor, digite o saldo:");
            if (scanner.hasNextDouble()) {
                saldo = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                scanner.next();
            }
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
