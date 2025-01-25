import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        scanner.useDelimiter("\\n");

        System.out.println("Por favor, informe a agência");
        String agencia = scanner.next();

        System.out.println("Por favor, informe o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, informe o nome do cliente");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, informe o saldo da conta");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia
                + ", conta " + numero
                + " e seu saldo " + saldo
                + " já está disponível para saque.";

        System.out.println(mensagem);
    }
}
